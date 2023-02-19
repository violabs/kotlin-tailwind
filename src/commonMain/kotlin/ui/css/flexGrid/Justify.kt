package ui.css.flexGrid

val justify = Justify.instance

class Justify private constructor() {
    val start = "justify-start "
    val end = "justify-end "
    val center = "justify-center "
    val between = "justify-between "
    val around = "justify-around "
    val evenly = "justify-evenly "

    val items = Items.instance
    val self = Self.instance

    companion object {
        val instance = Justify()
    }

    class Items private constructor() {
        val start = "justify-items-start "
        val end = "justify-items-end "
        val center = "justify-items-center "
        val stretch = "justify-items-stretch "

        companion object {
            val instance = Items()
        }
    }

    class Self private constructor() {
        val auto = "justify-self-auto "
        val start = "justify-self-start "
        val end = "justify-self-end "
        val center = "justify-self-center "
        val stretch = "justify-self-stretch "

        companion object {
            val instance = Self()
        }
    }
}