package ui.css.filters

val blur = Blur.instance

class Blur private constructor() {
    val none = "blur-none "
    val sm = "blur-sm "
    val it = "blur "
    val md = "blur-md "
    val lg = "blur-lg "
    val xl = "blur-xl "
    val n2xl = "blur-2xl "
    val n3xl = "blur-3xl "

    override fun toString(): String = it

    companion object {
        val instance: Blur = Blur()
    }
}