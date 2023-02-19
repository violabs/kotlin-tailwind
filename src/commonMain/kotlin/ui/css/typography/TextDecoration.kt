package ui.css.typography

val decoration = TextDecoration.instance

class TextDecoration private constructor() {
    val underline = "underline "
    val overline = "overline "
    val lineThrough = "line-through "
    val noUnderline = "no-underline "

    // STYLE
    val solid = "decoration-solid "
    val double = "decoration-double "
    val dotted = "decoration-dotted "
    val dashed = "decoration-dashed "
    val wavy = "decoration-wavy "

    // THICKNESS
    val auto = "decoration-auto "
    val fromFront = "decoration-from-front "
    val n0 = "decoration-0 "
    val n1 = "decoration-1 "
    val n2 = "decoration-2 "
    val n4 = "decoration-4 "
    val n8 = "decoration-8 "

    // COLOR
    val inherit = "decoration-inherit "
    val current = "decoration-current "
    val transparent = "decoration-transparent "
    val black = "decoration-black "
    val white = "decoration-white "

    val slate = Slate.instance
    val gray = Gray.instance
    val zinc = Zinc.instance
    val neutral = Neutral.instance
    val stone = Stone.instance
    val red = Red.instance
    val orange = Orange.instance
    val amber = Amber.instance
    val yellow = Yellow.instance
    val lime = Lime.instance
    val green = Green.instance
    val emerald = Emerald.instance
    val teal = Teal.instance
    val cyan = Cyan.instance
    val sky = Sky.instance
    val blue = Blue.instance
    val indigo = Indigo.instance
    val violet = Violet.instance
    val purple = Purple.instance
    val fuchsia = Fuchsia.instance
    val pink = Pink.instance
    val rose = Rose.instance

    companion object {
        val instance: TextDecoration = TextDecoration()
    }

    class Slate private constructor() {
        val n50 = "decoration-slate-50 "
        val n100 = "decoration-slate-100 "
        val n200 = "decoration-slate-200 "
        val n300 = "decoration-slate-300 "
        val n400 = "decoration-slate-400 "
        val n500 = "decoration-slate-500 "
        val n600 = "decoration-slate-600 "
        val n700 = "decoration-slate-700 "
        val n800 = "decoration-slate-800 "
        val n900 = "decoration-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "decoration-gray-50 "
        val n100 = "decoration-gray-100 "
        val n200 = "decoration-gray-200 "
        val n300 = "decoration-gray-300 "
        val n400 = "decoration-gray-400 "
        val n500 = "decoration-gray-500 "
        val n600 = "decoration-gray-600 "
        val n700 = "decoration-gray-700 "
        val n800 = "decoration-gray-800 "
        val n900 = "decoration-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "decoration-zinc-50 "
        val n100 = "decoration-zinc-100 "
        val n200 = "decoration-zinc-200 "
        val n300 = "decoration-zinc-300 "
        val n400 = "decoration-zinc-400 "
        val n500 = "decoration-zinc-500 "
        val n600 = "decoration-zinc-600 "
        val n700 = "decoration-zinc-700 "
        val n800 = "decoration-zinc-800 "
        val n900 = "decoration-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "decoration-neutral-50 "
        val n100 = "decoration-neutral-100 "
        val n200 = "decoration-neutral-200 "
        val n300 = "decoration-neutral-300 "
        val n400 = "decoration-neutral-400 "
        val n500 = "decoration-neutral-500 "
        val n600 = "decoration-neutral-600 "
        val n700 = "decoration-neutral-700 "
        val n800 = "decoration-neutral-800 "
        val n900 = "decoration-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "decoration-stone-50 "
        val n100 = "decoration-stone-100 "
        val n200 = "decoration-stone-200 "
        val n300 = "decoration-stone-300 "
        val n400 = "decoration-stone-400 "
        val n500 = "decoration-stone-500 "
        val n600 = "decoration-stone-600 "
        val n700 = "decoration-stone-700 "
        val n800 = "decoration-stone-800 "
        val n900 = "decoration-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "decoration-red-50 "
        val n100 = "decoration-red-100 "
        val n200 = "decoration-red-200 "
        val n300 = "decoration-red-300 "
        val n400 = "decoration-red-400 "
        val n500 = "decoration-red-500 "
        val n600 = "decoration-red-600 "
        val n700 = "decoration-red-700 "
        val n800 = "decoration-red-800 "
        val n900 = "decoration-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "decoration-orange-50 "
        val n100 = "decoration-orange-100 "
        val n200 = "decoration-orange-200 "
        val n300 = "decoration-orange-300 "
        val n400 = "decoration-orange-400 "
        val n500 = "decoration-orange-500 "
        val n600 = "decoration-orange-600 "
        val n700 = "decoration-orange-700 "
        val n800 = "decoration-orange-800 "
        val n900 = "decoration-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "decoration-amber-50 "
        val n100 = "decoration-amber-100 "
        val n200 = "decoration-amber-200 "
        val n300 = "decoration-amber-300 "
        val n400 = "decoration-amber-400 "
        val n500 = "decoration-amber-500 "
        val n600 = "decoration-amber-600 "
        val n700 = "decoration-amber-700 "
        val n800 = "decoration-amber-800 "
        val n900 = "decoration-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "decoration-yellow-50 "
        val n100 = "decoration-yellow-100 "
        val n200 = "decoration-yellow-200 "
        val n300 = "decoration-yellow-300 "
        val n400 = "decoration-yellow-400 "
        val n500 = "decoration-yellow-500 "
        val n600 = "decoration-yellow-600 "
        val n700 = "decoration-yellow-700 "
        val n800 = "decoration-yellow-800 "
        val n900 = "decoration-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "decoration-lime-50 "
        val n100 = "decoration-lime-100 "
        val n200 = "decoration-lime-200 "
        val n300 = "decoration-lime-300 "
        val n400 = "decoration-lime-400 "
        val n500 = "decoration-lime-500 "
        val n600 = "decoration-lime-600 "
        val n700 = "decoration-lime-700 "
        val n800 = "decoration-lime-800 "
        val n900 = "decoration-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "decoration-green-50 "
        val n100 = "decoration-green-100 "
        val n200 = "decoration-green-200 "
        val n300 = "decoration-green-300 "
        val n400 = "decoration-green-400 "
        val n500 = "decoration-green-500 "
        val n600 = "decoration-green-600 "
        val n700 = "decoration-green-700 "
        val n800 = "decoration-green-800 "
        val n900 = "decoration-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "decoration-emerald-50 "
        val n100 = "decoration-emerald-100 "
        val n200 = "decoration-emerald-200 "
        val n300 = "decoration-emerald-300 "
        val n400 = "decoration-emerald-400 "
        val n500 = "decoration-emerald-500 "
        val n600 = "decoration-emerald-600 "
        val n700 = "decoration-emerald-700 "
        val n800 = "decoration-emerald-800 "
        val n900 = "decoration-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "decoration-teal-50 "
        val n100 = "decoration-teal-100 "
        val n200 = "decoration-teal-200 "
        val n300 = "decoration-teal-300 "
        val n400 = "decoration-teal-400 "
        val n500 = "decoration-teal-500 "
        val n600 = "decoration-teal-600 "
        val n700 = "decoration-teal-700 "
        val n800 = "decoration-teal-800 "
        val n900 = "decoration-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "decoration-cyan-50 "
        val n100 = "decoration-cyan-100 "
        val n200 = "decoration-cyan-200 "
        val n300 = "decoration-cyan-300 "
        val n400 = "decoration-cyan-400 "
        val n500 = "decoration-cyan-500 "
        val n600 = "decoration-cyan-600 "
        val n700 = "decoration-cyan-700 "
        val n800 = "decoration-cyan-800 "
        val n900 = "decoration-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "decoration-sky-50 "
        val n100 = "decoration-sky-100 "
        val n200 = "decoration-sky-200 "
        val n300 = "decoration-sky-300 "
        val n400 = "decoration-sky-400 "
        val n500 = "decoration-sky-500 "
        val n600 = "decoration-sky-600 "
        val n700 = "decoration-sky-700 "
        val n800 = "decoration-sky-800 "
        val n900 = "decoration-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "decoration-blue-50 "
        val n100 = "decoration-blue-100 "
        val n200 = "decoration-blue-200 "
        val n300 = "decoration-blue-300 "
        val n400 = "decoration-blue-400 "
        val n500 = "decoration-blue-500 "
        val n600 = "decoration-blue-600 "
        val n700 = "decoration-blue-700 "
        val n800 = "decoration-blue-800 "
        val n900 = "decoration-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "decoration-indigo-50 "
        val n100 = "decoration-indigo-100 "
        val n200 = "decoration-indigo-200 "
        val n300 = "decoration-indigo-300 "
        val n400 = "decoration-indigo-400 "
        val n500 = "decoration-indigo-500 "
        val n600 = "decoration-indigo-600 "
        val n700 = "decoration-indigo-700 "
        val n800 = "decoration-indigo-800 "
        val n900 = "decoration-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "decoration-violet-50 "
        val n100 = "decoration-violet-100 "
        val n200 = "decoration-violet-200 "
        val n300 = "decoration-violet-300 "
        val n400 = "decoration-violet-400 "
        val n500 = "decoration-violet-500 "
        val n600 = "decoration-violet-600 "
        val n700 = "decoration-violet-700 "
        val n800 = "decoration-violet-800 "
        val n900 = "decoration-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "decoration-purple-50 "
        val n100 = "decoration-purple-100 "
        val n200 = "decoration-purple-200 "
        val n300 = "decoration-purple-300 "
        val n400 = "decoration-purple-400 "
        val n500 = "decoration-purple-500 "
        val n600 = "decoration-purple-600 "
        val n700 = "decoration-purple-700 "
        val n800 = "decoration-purple-800 "
        val n900 = "decoration-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "decoration-fuchsia-50 "
        val n100 = "decoration-fuchsia-100 "
        val n200 = "decoration-fuchsia-200 "
        val n300 = "decoration-fuchsia-300 "
        val n400 = "decoration-fuchsia-400 "
        val n500 = "decoration-fuchsia-500 "
        val n600 = "decoration-fuchsia-600 "
        val n700 = "decoration-fuchsia-700 "
        val n800 = "decoration-fuchsia-800 "
        val n900 = "decoration-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "decoration-pink-50 "
        val n100 = "decoration-pink-100 "
        val n200 = "decoration-pink-200 "
        val n300 = "decoration-pink-300 "
        val n400 = "decoration-pink-400 "
        val n500 = "decoration-pink-500 "
        val n600 = "decoration-pink-600 "
        val n700 = "decoration-pink-700 "
        val n800 = "decoration-pink-800 "
        val n900 = "decoration-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "decoration-rose-50 "
        val n100 = "decoration-rose-100 "
        val n200 = "decoration-rose-200 "
        val n300 = "decoration-rose-300 "
        val n400 = "decoration-rose-400 "
        val n500 = "decoration-rose-500 "
        val n600 = "decoration-rose-600 "
        val n700 = "decoration-rose-700 "
        val n800 = "decoration-rose-800 "
        val n900 = "decoration-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}