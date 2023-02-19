package ui.css.transforms

val origin = Origin.instance

class Origin private constructor() {
    val center = "origin-center "
    val top = "origin-top "
    val topRight = "origin-top-right "
    val right = "origin-right "
    val bottomRight = "origin-bottom-right "
    val bottom = "origin-bottom "
    val bottomLeft = "origin-bottom-left "
    val left = "origin-left "
    val topLeft = "origin-top-left "

    companion object {
        val instance: Origin = Origin()
    }

}