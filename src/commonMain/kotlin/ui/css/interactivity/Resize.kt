package ui.css.interactivity

val resize = Resize.instance

class Resize private constructor() {
    val it = "resize "
    val none = "resize-none "
    val x = "resize-x "
    val y = "resize-y "

    override fun toString(): String = it

    companion object {
        val instance: Resize = Resize()
    }
}