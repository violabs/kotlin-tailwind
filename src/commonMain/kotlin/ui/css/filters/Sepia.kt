package ui.css.filters

val sepia = Sepia.instance

class Sepia private constructor() {
    val n0 = "sepia-0 "
    val it = "sepia "

    override fun toString(): String = it

    companion object {
        val instance: Sepia = Sepia()
    }
}