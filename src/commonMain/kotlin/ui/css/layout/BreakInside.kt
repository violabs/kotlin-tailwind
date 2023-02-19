package ui.css.layout

val breakInside = BreakInside.instance

class BreakInside private constructor() {

    val auto = "break-inside-auto "
    val avoid = "break-inside-avoid "
    val avoidPage = "break-inside-avoid-page "
    val avoidColumn = "break-inside-avoid-column "

    companion object {
        val instance = BreakInside()
    }
}