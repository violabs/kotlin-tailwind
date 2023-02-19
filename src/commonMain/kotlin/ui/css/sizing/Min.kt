package ui.css.sizing

val min = Min.instance

class Min private constructor() {
    val w = W.instance
    val h = W.instance

    companion object {
        val instance: Min = Min()
    }

    class W private constructor() {
        val n0 = "min-w-0 "
        val full = "min-w-full "
        val min = "min-w-min "
        val max = "min-w-max "
        val fit = "min-w-fit "

        companion object {
            val instance = W()
        }
    }

    class H private constructor() {
        val n0 = "min-h-0 "
        val full = "min-h-full "
        val screen = "min-h-screen "
        val min = "min-h-min "
        val max = "min-h-max "
        val fit = "min-h-fit "
        
        companion object {
            val instance = H()
        }
    }
}