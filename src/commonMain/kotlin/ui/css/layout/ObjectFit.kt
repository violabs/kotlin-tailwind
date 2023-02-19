package ui.css.layout

val objectFit = ObjectFit.instance

class ObjectFit private constructor() {
    val contain = "object-contain "
    val cover = "object-cover "
    val fill = "object-fill "
    val none = "object-none "
    val scaleDown = "object-scale-down "

    companion object {
        val instance: ObjectFit = ObjectFit()
    }
}