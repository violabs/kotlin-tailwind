package ui.css.typography

val leading = LineHeight.instance

class LineHeight private constructor() {
    val n3 = "leading-3 "
    val n4 = "leading-4 "
    val n5 = "leading-5 "
    val n6 = "leading-6 "
    val n7 = "leading-7 "
    val n8 = "leading-8 "
    val n9 = "leading-9 "
    val n10 = "leading-10 "
    val none = "leading-none "
    val tight = "leading-tight "
    val snug = "leading-snug "
    val relaxed = "leading-relaxed "
    val loose = "leading-loose "
    
    companion object {
        val instance: LineHeight = LineHeight()
    }
}