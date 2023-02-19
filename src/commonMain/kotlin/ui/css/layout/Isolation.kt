package ui.css.layout

val isolation = Isolation.instance
val isolate = isolation.n0

class Isolation private constructor() {
    val n0 = "isolate "
    val auto = "isolation-auto "

    companion object {
        val instance: Isolation = Isolation()
    }
}