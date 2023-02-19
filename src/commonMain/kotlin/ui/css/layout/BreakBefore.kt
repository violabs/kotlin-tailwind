package ui.css.layout

val breakBefore = BreakBefore.instance

class BreakBefore private constructor() {

    val auto = "break-before-auto "
    val avoid = "break-before-avoid "
    val all = "break-before-all "
    val avoidPage = "break-before-avoid-page "
    val page = "break-before-page "
    val left = "break-before-left "
    val right = "break-before-right "
    val column = "break-before-column "

    companion object {
        val instance = BreakBefore()
    }
}