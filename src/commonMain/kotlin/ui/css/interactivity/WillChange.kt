package ui.css.interactivity

val willChange = WillChange.instance

class WillChange private constructor() {
    val auto = "will-change-auto "
    val scroll = "will-change-scroll "
    val contents = "will-change-contents "
    val transform = "will-change-transform "

    companion object {
        val instance: WillChange = WillChange()
    }
}