package ui.css.interactivity

val touch = Touch.instance

class Touch private constructor() {
    val auto = "touch-auto "
    val none = "touch-none "
    val pinchZoom = "touch-pinch-zoom "
    val manipulation = "touch-manipulation "
    val pan = Pan.instance

    companion object {
        val instance: Touch = Touch()
    }

    class Pan private constructor() {
        val x = "touch-pan-x "
        val left = "touch-pan-left "
        val right = "touch-pan-right "
        val y = "touch-pan-y "
        val up = "touch-pan-up "
        val down = "touch-pan-down "

        companion object {
            val instance: Pan = Pan()
        }
    }
}