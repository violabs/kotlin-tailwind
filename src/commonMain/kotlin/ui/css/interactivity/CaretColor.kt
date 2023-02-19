package ui.css.interactivity

val caret = CaretColor.instance

class CaretColor private constructor() {
    val inherit = "caret-inherit "
    val current = "caret-current "
    val transparent = "caret-transparent "
    val black = "caret-black "
    val white = "caret-white "

    // COLORS
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
    val fuchsia = Fuchsia.instance
    val pink = Pink.instance
    val rose = Rose.instance

    companion object {
        val instance: CaretColor = CaretColor()
    }

    class Slate private constructor() {
        val n50 = "caret-slate-50 "
        val n100 = "caret-slate-100 "
        val n200 = "caret-slate-200 "
        val n300 = "caret-slate-300 "
        val n400 = "caret-slate-400 "
        val n500 = "caret-slate-500 "
        val n600 = "caret-slate-600 "
        val n700 = "caret-slate-700 "
        val n800 = "caret-slate-800 "
        val n900 = "caret-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "caret-gray-50 "
        val n100 = "caret-gray-100 "
        val n200 = "caret-gray-200 "
        val n300 = "caret-gray-300 "
        val n400 = "caret-gray-400 "
        val n500 = "caret-gray-500 "
        val n600 = "caret-gray-600 "
        val n700 = "caret-gray-700 "
        val n800 = "caret-gray-800 "
        val n900 = "caret-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "caret-zinc-50 "
        val n100 = "caret-zinc-100 "
        val n200 = "caret-zinc-200 "
        val n300 = "caret-zinc-300 "
        val n400 = "caret-zinc-400 "
        val n500 = "caret-zinc-500 "
        val n600 = "caret-zinc-600 "
        val n700 = "caret-zinc-700 "
        val n800 = "caret-zinc-800 "
        val n900 = "caret-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "caret-neutral-50 "
        val n100 = "caret-neutral-100 "
        val n200 = "caret-neutral-200 "
        val n300 = "caret-neutral-300 "
        val n400 = "caret-neutral-400 "
        val n500 = "caret-neutral-500 "
        val n600 = "caret-neutral-600 "
        val n700 = "caret-neutral-700 "
        val n800 = "caret-neutral-800 "
        val n900 = "caret-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "caret-stone-50 "
        val n100 = "caret-stone-100 "
        val n200 = "caret-stone-200 "
        val n300 = "caret-stone-300 "
        val n400 = "caret-stone-400 "
        val n500 = "caret-stone-500 "
        val n600 = "caret-stone-600 "
        val n700 = "caret-stone-700 "
        val n800 = "caret-stone-800 "
        val n900 = "caret-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "caret-red-50 "
        val n100 = "caret-red-100 "
        val n200 = "caret-red-200 "
        val n300 = "caret-red-300 "
        val n400 = "caret-red-400 "
        val n500 = "caret-red-500 "
        val n600 = "caret-red-600 "
        val n700 = "caret-red-700 "
        val n800 = "caret-red-800 "
        val n900 = "caret-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "caret-orange-50 "
        val n100 = "caret-orange-100 "
        val n200 = "caret-orange-200 "
        val n300 = "caret-orange-300 "
        val n400 = "caret-orange-400 "
        val n500 = "caret-orange-500 "
        val n600 = "caret-orange-600 "
        val n700 = "caret-orange-700 "
        val n800 = "caret-orange-800 "
        val n900 = "caret-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "caret-amber-50 "
        val n100 = "caret-amber-100 "
        val n200 = "caret-amber-200 "
        val n300 = "caret-amber-300 "
        val n400 = "caret-amber-400 "
        val n500 = "caret-amber-500 "
        val n600 = "caret-amber-600 "
        val n700 = "caret-amber-700 "
        val n800 = "caret-amber-800 "
        val n900 = "caret-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "caret-yellow-50 "
        val n100 = "caret-yellow-100 "
        val n200 = "caret-yellow-200 "
        val n300 = "caret-yellow-300 "
        val n400 = "caret-yellow-400 "
        val n500 = "caret-yellow-500 "
        val n600 = "caret-yellow-600 "
        val n700 = "caret-yellow-700 "
        val n800 = "caret-yellow-800 "
        val n900 = "caret-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "caret-lime-50 "
        val n100 = "caret-lime-100 "
        val n200 = "caret-lime-200 "
        val n300 = "caret-lime-300 "
        val n400 = "caret-lime-400 "
        val n500 = "caret-lime-500 "
        val n600 = "caret-lime-600 "
        val n700 = "caret-lime-700 "
        val n800 = "caret-lime-800 "
        val n900 = "caret-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "caret-green-50 "
        val n100 = "caret-green-100 "
        val n200 = "caret-green-200 "
        val n300 = "caret-green-300 "
        val n400 = "caret-green-400 "
        val n500 = "caret-green-500 "
        val n600 = "caret-green-600 "
        val n700 = "caret-green-700 "
        val n800 = "caret-green-800 "
        val n900 = "caret-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "caret-emerald-50 "
        val n100 = "caret-emerald-100 "
        val n200 = "caret-emerald-200 "
        val n300 = "caret-emerald-300 "
        val n400 = "caret-emerald-400 "
        val n500 = "caret-emerald-500 "
        val n600 = "caret-emerald-600 "
        val n700 = "caret-emerald-700 "
        val n800 = "caret-emerald-800 "
        val n900 = "caret-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "caret-teal-50 "
        val n100 = "caret-teal-100 "
        val n200 = "caret-teal-200 "
        val n300 = "caret-teal-300 "
        val n400 = "caret-teal-400 "
        val n500 = "caret-teal-500 "
        val n600 = "caret-teal-600 "
        val n700 = "caret-teal-700 "
        val n800 = "caret-teal-800 "
        val n900 = "caret-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "caret-cyan-50 "
        val n100 = "caret-cyan-100 "
        val n200 = "caret-cyan-200 "
        val n300 = "caret-cyan-300 "
        val n400 = "caret-cyan-400 "
        val n500 = "caret-cyan-500 "
        val n600 = "caret-cyan-600 "
        val n700 = "caret-cyan-700 "
        val n800 = "caret-cyan-800 "
        val n900 = "caret-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "caret-sky-50 "
        val n100 = "caret-sky-100 "
        val n200 = "caret-sky-200 "
        val n300 = "caret-sky-300 "
        val n400 = "caret-sky-400 "
        val n500 = "caret-sky-500 "
        val n600 = "caret-sky-600 "
        val n700 = "caret-sky-700 "
        val n800 = "caret-sky-800 "
        val n900 = "caret-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "caret-blue-50 "
        val n100 = "caret-blue-100 "
        val n200 = "caret-blue-200 "
        val n300 = "caret-blue-300 "
        val n400 = "caret-blue-400 "
        val n500 = "caret-blue-500 "
        val n600 = "caret-blue-600 "
        val n700 = "caret-blue-700 "
        val n800 = "caret-blue-800 "
        val n900 = "caret-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "caret-indigo-50 "
        val n100 = "caret-indigo-100 "
        val n200 = "caret-indigo-200 "
        val n300 = "caret-indigo-300 "
        val n400 = "caret-indigo-400 "
        val n500 = "caret-indigo-500 "
        val n600 = "caret-indigo-600 "
        val n700 = "caret-indigo-700 "
        val n800 = "caret-indigo-800 "
        val n900 = "caret-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "caret-violet-50 "
        val n100 = "caret-violet-100 "
        val n200 = "caret-violet-200 "
        val n300 = "caret-violet-300 "
        val n400 = "caret-violet-400 "
        val n500 = "caret-violet-500 "
        val n600 = "caret-violet-600 "
        val n700 = "caret-violet-700 "
        val n800 = "caret-violet-800 "
        val n900 = "caret-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "caret-fuchsia-50 "
        val n100 = "caret-fuchsia-100 "
        val n200 = "caret-fuchsia-200 "
        val n300 = "caret-fuchsia-300 "
        val n400 = "caret-fuchsia-400 "
        val n500 = "caret-fuchsia-500 "
        val n600 = "caret-fuchsia-600 "
        val n700 = "caret-fuchsia-700 "
        val n800 = "caret-fuchsia-800 "
        val n900 = "caret-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "caret-pink-50 "
        val n100 = "caret-pink-100 "
        val n200 = "caret-pink-200 "
        val n300 = "caret-pink-300 "
        val n400 = "caret-pink-400 "
        val n500 = "caret-pink-500 "
        val n600 = "caret-pink-600 "
        val n700 = "caret-pink-700 "
        val n800 = "caret-pink-800 "
        val n900 = "caret-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "caret-rose-50 "
        val n100 = "caret-rose-100 "
        val n200 = "caret-rose-200 "
        val n300 = "caret-rose-300 "
        val n400 = "caret-rose-400 "
        val n500 = "caret-rose-500 "
        val n600 = "caret-rose-600 "
        val n700 = "caret-rose-700 "
        val n800 = "caret-rose-800 "
        val n900 = "caret-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}
