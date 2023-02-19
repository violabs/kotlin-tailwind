package ui.css.filters

val hueRotate = HueRotate.instance

class HueRotate private constructor() {
    val n0 = "hue-rotate-0 "
    val n15 = "hue-rotate-15 "
    val n30 = "hue-rotate-30 "
    val n60 = "hue-rotate-60 "
    val n90 = "hue-rotate-90 "
    val n180 = "hue-rotate-180 "

    companion object {
        val instance: HueRotate = HueRotate()
    }
}