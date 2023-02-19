package ui.css.filters

val brightness = Brightness.instance

class Brightness private constructor() {
    val n0 = "brightness-0 "
    val n50 = "brightness-50 "
    val n75 = "brightness-75 "
    val n90 = "brightness-90 "
    val n95 = "brightness-95 "
    val n100 = "brightness-100 "
    val n105 = "brightness-105 "
    val n110 = "brightness-110 "
    val n125 = "brightness-125 "
    val n150 = "brightness-150 "
    val n200 = "brightness-200 "

    companion object {
        val instance: Brightness = Brightness()
    }
}