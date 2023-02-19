package ui.css.sizing

val max = Max.instance

class Max private constructor() {
    val w = W.instance
    val h = W.instance

    companion object {
        val instance: Max = Max()
    }

    class W private constructor() {
        val n0 = "max-w-0 "
        val none = "max-w-none "
        val xs = "max-w-xs "
        val sm = "max-w-sm "
        val md = "max-w-md "
        val lg = "max-w-lg "
        val xl = "max-w-xl "
        val n2xl = "max-w-2xl "
        val n3xl = "max-w-3xl "
        val n4xl = "max-w-4xl "
        val n5xl = "max-w-5xl "
        val n6xl = "max-w-6xl "
        val n7xl = "max-w-7xl "
        val full = "max-w-full "
        val min = "max-w-min "
        val max = "max-w-max "
        val fit = "max-w-fit "
        val prose = "max-w-prose "


        companion object {
            val instance = W()
        }

        class Screen private constructor() {
            val sm = "max-w-screen-sm "
            val md = "max-w-screen-md "
            val lg = "max-w-screen-lg "
            val xl = "max-w-screen-xl "
            val n2xl = "max-w-screen-2xl "

            companion object {
                val instance = Screen()
            }
        }
    }

    class H private constructor() {
        val n0 = "max-h-0 "
        val full = "max-h-full "
        val screen = "max-h-screen "
        val min = "max-h-min "
        val max = "max-h-max "
        val fit = "max-h-fit "

        companion object {
            val instance = H()
        }
    }
}