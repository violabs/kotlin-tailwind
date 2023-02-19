package ui.css.layout

val clear = Clear.instance

class Clear private constructor() {
    val left = "clear-left "
    val right = "clear-right "
    val both = "clear-both "
    val none = "clear-none "

    companion object {
        val instance: Clear = Clear()
    }
}