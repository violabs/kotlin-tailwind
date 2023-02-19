package ui.css.transforms

val scale = Scale.instance

class Scale private constructor() {
    val n0 = "scale-0 "
    val n50 = "scale-50 "
    val n75 = "scale-75 "
    val n90 = "scale-90 "
    val n95 = "scale-95 "
    val n100 = "scale-100 "
    val n105 = "scale-105 "
    val n110 = "scale-110 "
    val n125 = "scale-125 "
    val n150 = "scale-150 "

    val x = X.instance
    val y = Y.instance

    companion object {
        val instance: Scale = Scale()
    }

    class X private constructor() {
        val n0 = "scale-x-0 "
        val n50 = "scale-x-50 "
        val n75 = "scale-x-75 "
        val n90 = "scale-x-90 "
        val n95 = "scale-x-95 "
        val n100 = "scale-x-100 "
        val n105 = "scale-x-105 "
        val n110 = "scale-x-110 "
        val n125 = "scale-x-125 "
        val n150 = "scale-x-150 "

        companion object {
            val instance: X = X()
        }

    }

    class Y private constructor() {
        val n0 = "scale-y-0 "
        val n50 = "scale-y-50 "
        val n75 = "scale-y-75 "
        val n90 = "scale-y-90 "
        val n95 = "scale-y-95 "
        val n100 = "scale-y-100 "
        val n105 = "scale-y-105 "
        val n110 = "scale-y-110 "
        val n125 = "scale-y-125 "
        val n150 = "scale-y-150 "

        companion object {
            val instance: Y = Y()
        }

    }

}