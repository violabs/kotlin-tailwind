package ui.css.layout

val aspect = AspectRatio.instance

class AspectRatio private constructor() {

    val auto = "aspect-auto "
    val square = "aspect-square "
    val video = "aspect-video "

    companion object {
        val instance = AspectRatio()
    }
}