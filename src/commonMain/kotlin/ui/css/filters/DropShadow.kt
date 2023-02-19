package ui.css.filters

val dropShadow = DropShadow.instance

class DropShadow private constructor() {
    val sm = "drop-shadow-sm "
    val it = "drop-shadow "
    val md = "drop-shadow-md "
    val lg = "drop-shadow-lg "
    val xl = "drop-shadow-xl "
    val n2xl = "drop-shadow-2xl "
    val none = "drop-shadow-none "

    override fun toString(): String = it

    companion object {
        val instance: DropShadow = DropShadow()
    }
}