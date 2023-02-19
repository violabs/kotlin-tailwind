package ui.css.layout

val objectPosition = ObjectPosition.instance

class ObjectPosition private constructor() {
    val bottom = "object-bottom "
    val center = "object-center "
    val left = "object-left "
    val leftBottom = "object-left-bottom "
    val leftTop = "object-left-top "
    val right = "object-right "
    val rightBottom = "object-right-bottom "
    val rightTop = "object-right-top "
    val top = "object-top "

    companion object {
        val instance: ObjectPosition = ObjectPosition()
    }
}