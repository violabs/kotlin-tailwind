package ui.css.layout

val breakAfter = BreakAfter.instance

class BreakAfter private constructor() {

    val auto = "break-after-auto "
    val avoid = "break-after-avoid "
    val all = "break-after-all "
    val avoidPage = "break-after-avoid-page "
    val page = "break-after-page "
    val left = "break-after-left "
    val right = "break-after-right "
    val column = "break-after-column "

    companion object {
        val instance = BreakAfter()
    }
}