package ui.css.typography

val underlineOffset = UnderlineOffset.instance

class UnderlineOffset private constructor() {
    val auto = "underline-offset-auto "
    val n0 = "underline-offset-0 "
    val n1 = "underline-offset-1 "
    val n2 = "underline-offset-2 "
    val n4 = "underline-offset-4 "
    val n8 = "underline-offset-8 "

    companion object {
        val instance: UnderlineOffset = UnderlineOffset()
    }
}