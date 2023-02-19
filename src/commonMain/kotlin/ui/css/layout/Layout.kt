package ui.css.layout

val layout = Layout.instance
val container = layout.container

class Layout private constructor() {
    val container = "container "

    companion object {
        val instance = Layout()
    }
}