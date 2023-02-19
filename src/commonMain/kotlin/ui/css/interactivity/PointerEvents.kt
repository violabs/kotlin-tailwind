package ui.css.interactivity

val pointerEvents = PointerEvents.instance

class PointerEvents private constructor() {
    val none = "pointer-events-none "
    val auto = "pointer-events-auto "

    companion object {
        val instance: PointerEvents = PointerEvents()
    }
}