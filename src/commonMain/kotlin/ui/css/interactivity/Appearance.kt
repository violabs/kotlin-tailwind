package ui.css.interactivity

val appearance = Appearance.instance

class Appearance private constructor() {
    val none = "none "

    companion object {
        val instance: Appearance = Appearance()
    }
}