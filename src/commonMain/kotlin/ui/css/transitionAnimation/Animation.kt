package ui.css.transitionAnimation

val animate = Animation.instance

class Animation private constructor() {
    val none = "animate-none "
    val spin = "animate-spin "
    val ping = "animate-ping "

    companion object {
        val instance: Animation = Animation()
    }
}