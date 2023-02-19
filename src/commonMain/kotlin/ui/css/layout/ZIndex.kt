package ui.css.layout

val z = ZIndex.instance

class ZIndex private constructor() {
    val n0 = "z-0 "
    val n10 = "z-10 "
    val n20 = "z-20 "
    val n30 = "z-30 "
    val n40 = "z-40 "
    val n50 = "z-50 "
    val auto = "z-auto "

    companion object {
        val instance: ZIndex = ZIndex()
    }
}