package ui.css.layout

val float = Float.instance

class Float private constructor() {
    val right = "float-right "
    val left = "float-left "
    val none = "float-none "

    companion object {
        val instance: Float = Float()
    }
}