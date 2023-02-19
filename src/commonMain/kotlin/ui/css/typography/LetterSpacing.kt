package ui.css.typography

val tracking = LetterSpacing.instance

class LetterSpacing private constructor() {
    val tighter = "tracking-tighter"
    val tight = "tracking-tight "
    val normal = "tracking-normal "
    val wide = "tracking-wide "
    val wider = "tracking-wider "
    val widest = "tracking-widest "

    companion object {
        val instance: LetterSpacing = LetterSpacing()
    }
}