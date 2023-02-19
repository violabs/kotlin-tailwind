package ui.css.accessibility

val sr = ScreenReader.instance

class ScreenReader private constructor() {
    val only = "sr-only "
    val notOnly = "not-sr-only "

    companion object {
        val instance: ScreenReader = ScreenReader()
    }
}