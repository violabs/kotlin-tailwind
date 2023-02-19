package ui.css.layout

val overflow = Overflow.instance

class Overflow private constructor() {

    val auto = "overflow-auto "
    val hidden = "overflow-hidden "
    val clip = "overflow-clip "
    val visible = "overflow-visible "
    val scroll = "overflow-scroll "
    val x = X.instance
    val y = Y.instance

    companion object {
        val instance: Overflow = Overflow()
    }

    class X private constructor() {
        val auto = "overflow-x-auto "
        val hidden = "overflow-x-hidden "
        val clip = "overflow-x-clip "
        val visible = "overflow-x-visible "
        val scroll = "overflow-x-scroll "

        companion object {
            val instance = X()
        }
    }

    class Y private constructor() {
        val auto = "overflow-y-auto "
        val hidden = "overflow-y-hidden "
        val clip = "overflow-y-clip "
        val visible = "overflow-y-visible "
        val scroll = "overflow-y-scroll "

        companion object {
            val instance = Y()
        }
    }
}