package ui.css.interactivity

val cursor = Cursor.instance

class Cursor private constructor() {
    val auto = "cursor-auto "
    val default = "cursor-default "
    val pointer = "cursor-pointer "
    val wait = "cursor-wait "
    val text = "cursor-text "
    val move = "cursor-move "
    val help = "cursor-help "
    val notAllowed = "cursor-not-allowed "
    val none = "cursor-none "
    val crosshair = "cursor-crosshair "
    val verticalText = "cursor-vertical-text "
    val alias = "cursor-alias "
    val copy = "cursor-copy "
    val noDrop = "cursor-no-drop "
    val grab = "cursor-grab "
    val grabbing = "cursor-grabbing "
    val allScroll = "cursor-all-scroll "
    val colResize = "cursor-col-resize "
    val rowResize = "cursor-row-resize "
    val nResize = "cursor-n-resize "
    val eResize = "cursor-e-resize "
    val sResize = "cursor-s-resize "
    val wResize = "cursor-w-resize "
    val neResize = "cursor-ne-resize "
    val nwResize = "cursor-nw-resize "
    val seResize = "cursor-se-resize "
    val swResize = "cursor-sw-resize "
    val ewResize = "cursor-ew-resize "
    val nsResize = "cursor-ns-resize "
    val neswResize = "cursor-nesw-resize "
    val nwseResize = "cursor-nwse-resize "
    val zoom = Zoom.instance

    companion object {
        val instance: Cursor = Cursor()
    }

    class Zoom private constructor() {
        val `in` = "cursor-zoom-in "
        val out = "cursor-zoom-out "

        companion object {
            val instance: Zoom = Zoom()
        }
    }
}