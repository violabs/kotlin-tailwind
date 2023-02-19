package ui.css.filters

val invert = Invert.instance

class Invert private constructor() {
    val n0 = "invert-0 "
    val it = "invert "

    override fun toString(): String = it

    companion object {
        val instance: Invert = Invert()
    }
}