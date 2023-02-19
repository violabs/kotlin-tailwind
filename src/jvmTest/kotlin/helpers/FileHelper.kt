package helpers

import java.io.File

class Directory(private val path: String) {
    private val file = File(path)
    private val subPaths: FileTreeWalk = file.walkTopDown()

    fun print(): Directory = apply {
        subPaths.forEach(::println)
    }

    fun kotlinFiles(): Sequence<KFile> =
        subPaths
            .asSequence()
            .filter { it.name.contains(".kt") }
            .map(::KFile)
}

val kabobRegex = "-[a-zA-Z]".toRegex()

fun String.kabobToCamelCase(): String {
    return kabobRegex.replace(this) {
        it
            .value
            .replace("-","")
            .uppercase()
    }
}

val classRegex = "class (\\w+) ".toRegex()

class KFile(private val file: File) {
    fun print(): KFile = apply { println(file.path) }

    fun removePackageDetails() {
        val lines: List<String> = file.readLines()

        val packageInfo: String = lines.firstOrNull() ?: throw Exception("No first line")

        if (!packageInfo.contains("package")) throw Exception("package is not in the first line")

        val packagePath: String = packageInfo.replace("package ", "")

        val classes = mutableListOf<String>()

        val final = mutableListOf<String>()

        for (line in lines) {
            if (line.contains("package")) {
                final.add(line)
                continue
            }

            if (line.contains("class")) {
                classRegex
                    .find(line)
                    ?.groupValues
                    ?.last()
                    ?.let(classes::add)

                final.add(line)

                continue
            }

            var newLine = line.replace("$packagePath.", "")

            newLine =
                classes
                    .asSequence()
                    .filter { newLine.contains(it) }
                    .fold(newLine) { acc, n -> acc.replace("$n.", "") }

            newLine = newLine.replace("Companion.", "")
            final.add(newLine)
        }

        val writeLines = final.joinToString("\n")

        file.writeText(writeLines)

        println("UPDATED $file")
    }
}