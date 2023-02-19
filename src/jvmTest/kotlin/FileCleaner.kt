import helpers.Directory
import helpers.KFile
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class FileCleaner {
    @Test
    @Disabled
    fun clean() {
        Directory("./src/commonMain/kotlin/ui/css")
            .kotlinFiles()
            .onEach(KFile::removePackageDetails)
            .toList()
    }
}