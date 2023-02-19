package ui.css.transforms

val skew = Skew.instance

class Skew private constructor() {
    val x = X.instance
    val y = Y.instance

    companion object {
        val instance: Skew = Skew()
    }

    class X private constructor() {
        val n0 = "skew-x-0 "
        val n1 = "skew-x-1 "
        val n2 = "skew-x-2 "
        val n3 = "skew-x-3 "
        val n6 = "skew-x-6 "
        val n12 = "skew-x-12 "

        companion object {
            val instance: X = X()
        }

    }

    class Y private constructor() {
        val n0 = "skew-y-0 "
        val n1 = "skew-y-1 "
        val n2 = "skew-y-2 "
        val n3 = "skew-y-3 "
        val n6 = "skew-y-6 "
        val n12 = "skew-y-12 "

        companion object {
            val instance: Y = Y()
        }

    }

}