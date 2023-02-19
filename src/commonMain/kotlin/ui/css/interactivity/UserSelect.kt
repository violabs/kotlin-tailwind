package ui.css.interactivity

class UserSelect private constructor() {
    val none = "select-none "
    val text = "select-text "
    val all = "select-all "
    val auto = "select-auto "

    companion object {
        val instance: UserSelect = UserSelect()
    }
}