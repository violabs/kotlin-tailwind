package ui.css.typography

val listStyle = ListStyle.instance

class ListStyle private constructor() {
    val none = "list-none "
    val disc = "list-disc "
    val decimal = "list-decimal "

    // position
    val inside = "list-inside "
    val outside = "list-outside "

    companion object {
        val instance: ListStyle = ListStyle()
    }
}