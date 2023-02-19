package ui.css.layout

val visibility = Visibility.instance
val visible = visibility.visible
val invisible = visibility.invisible
val collapse = visibility.collapse

class Visibility private constructor() {

    val visible = "visible "
    val invisible = "invisible "
    val collapse = "collapse "

    companion object {
        val instance: Visibility = Visibility()
    }
}