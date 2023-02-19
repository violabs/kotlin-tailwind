package ui.css.filters

val saturate = Saturate.instance

class Saturate private constructor() {
    val n0 = "saturate-0 "
    val n50 = "saturate-50 "
    val n100 = "saturate-100 "
    val n150 = "saturate-150 "
    val n200 = "saturate-200 "

    companion object {
        val instance: Saturate = Saturate()
    }
}