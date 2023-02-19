package ui.css.filters

val grayscale = Grayscale.instance

class Grayscale private constructor() {
    val n0 = "grayscale-0 "
    val it = "grayscale "

    override fun toString(): String = it

    companion object {
        val instance: Grayscale = Grayscale()
    }
}