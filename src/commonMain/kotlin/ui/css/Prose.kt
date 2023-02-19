package ui.css

val prose = Prose.instance

class Prose private constructor() {
    val light = "prose "
    val dark = "dark:prose-invert "

    override fun toString(): String = dark

    companion object {
        val instance: Prose = Prose()
    }
}