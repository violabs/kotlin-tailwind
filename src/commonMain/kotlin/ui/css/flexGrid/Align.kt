package ui.css.flexGrid

val align = Align.instance

class Align private constructor() {
    val start = "content-start "
    val end = "content-end "
    val center = "content-center "
    val between = "content-between "
    val around = "content-around "
    val evenly = "content-evenly "
    val baseline = "content-baseline "

    val items = Items.instance
    val self = Self.instance

    companion object {
        val instance: Align = Align()
    }

    class Items private constructor() {
        val start = "items-start "
        val end = "items-end "
        val center = "items-center "
        val stretch = "items-stretch "
        val baseline = "items-baseline "

        companion object {
            val instance = Items()
        }
    }

    class Self private constructor() {
        val auto = "self-auto "
        val start = "self-start "
        val end = "self-end "
        val center = "self-center "
        val stretch = "self-stretch "
        val baseline = "self-baseline "

        companion object {
            val instance = Self()
        }
    }
}