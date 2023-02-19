package ui.css.layout

val boxDecoration = BoxDecoration.instance

class BoxDecoration private constructor() {
    val clone = "box-decoration-clone "
    val slice = "box-decoration-slice "

    companion object {
        val instance = BoxDecoration()
    }
}