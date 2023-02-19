package ui.css.layout

val boxSizing = BoxSizing.instance

class BoxSizing private constructor() {

    val border = "box-border "
    val content = "box-content "

    companion object {
        val instance = BoxSizing()
    }
}