package ui.css.filters

val backdrop = Backdrop.instance

class Backdrop private constructor() {
    val blur = Blur.instance
    val brightness = Brightness.instance

    companion object {
        val instance: Backdrop = Backdrop()
    }

    class Blur private constructor() {
        val none = "backdrop-blur-none "
        val sm = "backdrop-blur-sm "
        val it = "backdrop-blur "
        val md = "backdrop-blur-md "
        val lg = "backdrop-blur-lg "
        val xl = "backdrop-blur-xl "
        val n2xl = "backdrop-blur-2xl "
        val n3xl = "backdrop-blur-3xl "

        override fun toString(): String = it

        companion object {
            val instance: Blur = Blur()
        }
    }

    class Brightness private constructor() {
        val n0 = "backdrop-brightness-0 "
        val n50 = "backdrop-brightness-50 "
        val n75 = "backdrop-brightness-75 "
        val n90 = "backdrop-brightness-90 "
        val n95 = "backdrop-brightness-95 "
        val n100 = "backdrop-brightness-100 "
        val n105 = "backdrop-brightness-105 "
        val n110 = "backdrop-brightness-110 "
        val n125 = "backdrop-brightness-125 "
        val n150 = "backdrop-brightness-150 "
        val n200 = "backdrop-brightness-200 "

        companion object {
            val instance: Brightness = Brightness()
        }
    }

    class Contrast private constructor() {
        val n0 = "backdrop-contrast-0 "
        val n50 = "backdrop-contrast-50 "
        val n75 = "backdrop-contrast-75 "
        val n100 = "backdrop-contrast-100 "
        val n125 = "backdrop-contrast-125 "
        val n150 = "backdrop-contrast-150 "
        val n200 = "backdrop-contrast-200 "

        companion object {
            val instance: Contrast = Contrast()
        }
    }

    class Grayscale private constructor() {
        val n0 = "backdrop-grayscale-0 "
        val it = "backdrop-grayscale "

        override fun toString(): String = it

        companion object {
            val instance: Grayscale = Grayscale()
        }
    }

    class HueRotate private constructor() {
        val n0 = "backdrop-hue-rotate-0 "
        val n15 = "backdrop-hue-rotate-15 "
        val n30 = "backdrop-hue-rotate-30 "
        val n60 = "backdrop-hue-rotate-60 "
        val n90 = "backdrop-hue-rotate-90 "
        val n180 = "backdrop-hue-rotate-180 "

        companion object {
            val instance: HueRotate = HueRotate()
        }
    }

    class Invert private constructor() {
        val n0 = "backdrop-invert-0 "
        val it = "backdrop-invert "

        override fun toString(): String = it

        companion object {
            val instance: Invert = Invert()
        }
    }

    class Opacity private constructor() {
        val n0 = "backdrop-opacity-0 "
        val n5 = "backdrop-opacity-5 "
        val n10 = "backdrop-opacity-10 "
        val n20 = "backdrop-opacity-20 "
        val n25 = "backdrop-opacity-25 "
        val n30 = "backdrop-opacity-30 "
        val n40 = "backdrop-opacity-40 "
        val n50 = "backdrop-opacity-50 "
        val n60 = "backdrop-opacity-60 "
        val n70 = "backdrop-opacity-70 "
        val n75 = "backdrop-opacity-75 "
        val n80 = "backdrop-opacity-80 "
        val n90 = "backdrop-opacity-90 "
        val n95 = "backdrop-opacity-95 "
        val n100 = "backdrop-opacity-100 "

        companion object {
            val instance = Opacity()
        }
    }

    class Saturate private constructor() {
        val n0 = "backdrop-saturate-0 "
        val n50 = "backdrop-saturate-50 "
        val n100 = "backdrop-saturate-100 "
        val n150 = "backdrop-saturate-150 "
        val n200 = "backdrop-saturate-200 "

        companion object {
            val instance: Saturate = Saturate()
        }
    }

    class Sepia private constructor() {
        val n0 = "backdrop-sepia-0 "
        val it = "backdrop-sepia "

        override fun toString(): String = it

        companion object {
            val instance: Sepia = Sepia()
        }
    }
}