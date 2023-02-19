package ui.css.typography

val wordBreak = WordBreak.instance

class WordBreak private constructor() {
    val normal = "break-normal "
    val words = "break-words "
    val all = "break-all "
    val keep = "break-keep "

    companion object {
        val instance: WordBreak = WordBreak()
    }
}