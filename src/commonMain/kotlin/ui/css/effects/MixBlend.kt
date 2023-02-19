package ui.css.effects

val mixBlend = MixBlend.instance

class MixBlend private constructor() {
    val normal = "mix-blend-normal "
    val multiply = "mix-blend-multiply "
    val screen = "mix-blend-screen "
    val overlay = "mix-blend-overlay "
    val darken = "mix-blend-darken "
    val lighten = "mix-blend-lighten "
    val colorDodge = "mix-blend-color-dodge "
    val colorBurn = "mix-blend-color-burn "
    val hardLight = "mix-blend-hard-light "
    val softLight = "mix-blend-soft-light "
    val difference = "mix-blend-difference "
    val exclusion = "mix-blend-exclusion "
    val hue = "mix-blend-hue "
    val saturation = "mix-blend-saturation "
    val color = "mix-blend-color "
    val luminosity = "mix-blend-luminosity "
    val plusLighter = "mix-blend-plus-lighter "

    companion object {
        val instance = MixBlend()
    }
}