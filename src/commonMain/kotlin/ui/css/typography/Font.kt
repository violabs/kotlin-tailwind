package ui.css.typography

val contentNone = "content-none "

val font = Font.instance

val antialiased = font.antialiased
val subpixelAntialiased = font.subpixelAntialiased
val italic = font.italic
val notItalic = font.notItalic

val normalNums = font.normalNums
val ordinal = font.ordinal
val slashedZero = font.slashedZero
val liningNums = font.liningNums
val oldstyleNums = font.oldstyleNums
val proportionalNums = font.proportionalNums
val tabularNums = font.tabularNums
val diagonalFractions = font.diagonalFractions
val stackedFractions = font.stackedFractions

class Font private constructor() {
    // FAMILY
    val sans = "font-sans "
    val serif = "font-serif "
    val mono = "font-mono "

    // WEIGHT
    val thin = "font-thin "
    val extralight = "font-extralight "
    val light = "font-light "
    val normal = "font-normal "
    val medium = "font-medium "
    val semibold = "font-semibold "
    val bold = "font-bold "
    val extrabold = "font-extrabold "
    val black = "font-black "

    // SMOOTHING
    val antialiased = "antialiased "
    val subpixelAntialiased = "subpixel-antialiased "

    // style
    val italic = "italic "
    val notItalic = "not-italic "

    // VARIANT NUMERIC
    val normalNums = "normal-nums "
    val ordinal = "ordinal "
    val slashedZero = "slashed-zero "
    val liningNums = "lining-nums "
    val oldstyleNums = "oldstyle-nums "
    val proportionalNums = "proportional-nums "
    val tabularNums = "tabular-nums "
    val diagonalFractions = "diagonal-fractions "
    val stackedFractions = "stacked-fractions "

    companion object {
        val instance = Font()
    }
}