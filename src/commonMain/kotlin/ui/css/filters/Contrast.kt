package ui.css.filters

val contrast = Contrast.instance

class Contrast private constructor() {
    val n0 = "contrast-0 "
    val n50 = "contrast-50 "
    val n75 = "contrast-75 "
    val n100 = "contrast-100 "
    val n125 = "contrast-125 "
    val n150 = "contrast-150 "
    val n200 = "contrast-200 "

    companion object {
        val instance: Contrast = Contrast()
    }
}