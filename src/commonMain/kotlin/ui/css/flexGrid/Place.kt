package ui.css.flexGrid

val place = Place.instance

class Place private constructor() {
    val content = Content.instance
    val items = Items.instance
    val self = Self.instance

    companion object {
        val instance = Place()
    }

    class Content private constructor() {
        val center = "place-content-center "
        val start = "place-content-start "
        val end = "place-content-end "
        val between = "place-content-between "
        val around = "place-content-around "
        val evenly = "place-content-evenly "
        val baseline = "place-content-baseline "
        val stretch = "place-content-stretch "

        companion object {
            val instance = Content()
        }
    }

    class Items private constructor() {
        val start = "place-items-start "
        val end = "place-items-end "
        val center = "place-items-center "
        val baseline = "place-items-baseline "
        val stretch = "place-items-stretch "

        companion object {
            val instance = Items()
        }
    }

    class Self private constructor() {
        val auto = "place-self-auto"
        val start = "place-self-start "
        val end = "place-self-end "
        val center = "place-self-center "
        val stretch = "place-self-stretch "

        companion object {
            val instance = Self()
        }
    }
}