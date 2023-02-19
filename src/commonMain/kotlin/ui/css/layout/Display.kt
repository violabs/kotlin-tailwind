package ui.css.layout

val display = Display.instance
val block = display.block
val inlineBlock = display.inlineBlock
val inlineFlex = display.inlineFlex
val table = display.table
val inlineTable = display.inlineTable
val tableCaption = display.tableCaption

class Display private constructor() {

    val block = "block "
    val inlineBlock = "inline-block "
    val inlineFlex = "inline-flex "
    val table = "table "
    val inlineTable = "inline-table "
    val tableCaption = "table-caption "
    
    companion object {
        val instance: Display = Display()
    }
}