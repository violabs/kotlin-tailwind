package ui.css.typography

val whitespace = Whitespace.instance

class Whitespace private constructor() {
    val normal = "whitespace-normal "
    val nowrap = "whitespace-nowrap "
    val pre = "whitespace-pre "
    val preLine = "whitespace-pre-line "
    val preWrap = "whitespace-pre-wrap "

    companion object {
        val instance: Whitespace = Whitespace()
    }
}