package ui.css.transforms

val rotate = Rotate.instance

class Rotate private constructor() {
    val n0 = "rotate-0 "
    val n1 = "rotate-1 "
    val n2 = "rotate-2 "
    val n3 = "rotate-3 "
    val n6 = "rotate-6 "
    val n12 = "rotate-12 "
    val n45 = "rotate-45 "
    val n90 = "rotate-90 "
    val n180 = "rotate-180 "

    companion object {
        val instance: Rotate = Rotate()
    }

}