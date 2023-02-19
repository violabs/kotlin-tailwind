package ui.css.layout

val overscroll = Overscroll.instance

class Overscroll private constructor() {
    val auto = "overscroll-auto "
    val hidden = "overscroll-hidden "
    val clip = "overscroll-clip "
    val visible = "overscroll-visible "
    val scroll = "overscroll-scroll "
    val x = X.instance
    val y = Y.instance

    companion object {
        val instance: Overscroll = Overscroll()
    }

    class X private constructor() {
        val auto = "overscroll-x-auto "
        val contain = "overscroll-x-contain "
        val none = "overscroll-x-none "

        companion object {
            val instance = X()
        }
    }

    class Y private constructor() {
        val auto = "overscroll-y-auto "
        val contain = "overscroll-y-contain "
        val none = "overscroll-y-none "

        companion object {
            val instance = Y()
        }
    }
}