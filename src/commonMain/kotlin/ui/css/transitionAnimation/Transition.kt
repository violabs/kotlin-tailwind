package ui.css.transitionAnimation

val transition = Transition.instance

class Transition private constructor() {
    val none = "transition-none"
    val all = "transition-all"
    val it = "transition"
    val colors = "transition-colors"
    val opacity = "transition-opacity"
    val shadow = "transition-shadow"
    val transform = "transition-transform"

    val duration = Duration.instance
    val ease = Ease.instance
    val delay = Delay.instance

    override fun toString(): String = it

    companion object {
        val instance: Transition = Transition()
    }

    class Duration private constructor() {
        val n75 = "duration-75 "
        val n100 = "duration-100 "
        val n150 = "duration-150 "
        val n200 = "duration-200 "
        val n300 = "duration-300 "
        val n500 = "duration-500 "
        val n700 = "duration-700 "
        val n1000 = "duration-1000 "

        companion object {
            val instance: Duration =
                Duration()
        }
    }

    class Ease private constructor() {
        val linear = "ease-linear "
        val `in` = "ease-in "
        val out = "ease-out "
        val inOut = "ease-in-out "

        companion object {
            val instance: Ease = Ease()
        }
    }

    class Delay private constructor() {
        val n75 = "delay-75 "
        val n100 = "delay-100 "
        val n150 = "delay-150 "
        val n200 = "delay-200 "
        val n300 = "delay-300 "
        val n500 = "delay-500 "
        val n700 = "delay-700 "
        val n1000 = "delay-1000 "

        companion object {
            val instance: Delay = Delay()
        }
    }
}