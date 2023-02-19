package ui.css.interactivity

val accent = Accent.instance

class Accent private constructor() {
    val inherit = "accent-inherit "
    val current = "accent-current "
    val transparent = "accent-transparent "
    val black = "accent-black "
    val white = "accent-white "
    val auto = "accent-auto "

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
        val instance: Accent = Accent()
    }

    class Slate private constructor() {
        val n50 = "accent-slate-50 "
        val n100 = "accent-slate-100 "
        val n200 = "accent-slate-200 "
        val n300 = "accent-slate-300 "
        val n400 = "accent-slate-400 "
        val n500 = "accent-slate-500 "
        val n600 = "accent-slate-600 "
        val n700 = "accent-slate-700 "
        val n800 = "accent-slate-800 "
        val n900 = "accent-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "accent-gray-50 "
        val n100 = "accent-gray-100 "
        val n200 = "accent-gray-200 "
        val n300 = "accent-gray-300 "
        val n400 = "accent-gray-400 "
        val n500 = "accent-gray-500 "
        val n600 = "accent-gray-600 "
        val n700 = "accent-gray-700 "
        val n800 = "accent-gray-800 "
        val n900 = "accent-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "accent-zinc-50 "
        val n100 = "accent-zinc-100 "
        val n200 = "accent-zinc-200 "
        val n300 = "accent-zinc-300 "
        val n400 = "accent-zinc-400 "
        val n500 = "accent-zinc-500 "
        val n600 = "accent-zinc-600 "
        val n700 = "accent-zinc-700 "
        val n800 = "accent-zinc-800 "
        val n900 = "accent-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "accent-neutral-50 "
        val n100 = "accent-neutral-100 "
        val n200 = "accent-neutral-200 "
        val n300 = "accent-neutral-300 "
        val n400 = "accent-neutral-400 "
        val n500 = "accent-neutral-500 "
        val n600 = "accent-neutral-600 "
        val n700 = "accent-neutral-700 "
        val n800 = "accent-neutral-800 "
        val n900 = "accent-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "accent-stone-50 "
        val n100 = "accent-stone-100 "
        val n200 = "accent-stone-200 "
        val n300 = "accent-stone-300 "
        val n400 = "accent-stone-400 "
        val n500 = "accent-stone-500 "
        val n600 = "accent-stone-600 "
        val n700 = "accent-stone-700 "
        val n800 = "accent-stone-800 "
        val n900 = "accent-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "accent-red-50 "
        val n100 = "accent-red-100 "
        val n200 = "accent-red-200 "
        val n300 = "accent-red-300 "
        val n400 = "accent-red-400 "
        val n500 = "accent-red-500 "
        val n600 = "accent-red-600 "
        val n700 = "accent-red-700 "
        val n800 = "accent-red-800 "
        val n900 = "accent-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "accent-orange-50 "
        val n100 = "accent-orange-100 "
        val n200 = "accent-orange-200 "
        val n300 = "accent-orange-300 "
        val n400 = "accent-orange-400 "
        val n500 = "accent-orange-500 "
        val n600 = "accent-orange-600 "
        val n700 = "accent-orange-700 "
        val n800 = "accent-orange-800 "
        val n900 = "accent-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "accent-amber-50 "
        val n100 = "accent-amber-100 "
        val n200 = "accent-amber-200 "
        val n300 = "accent-amber-300 "
        val n400 = "accent-amber-400 "
        val n500 = "accent-amber-500 "
        val n600 = "accent-amber-600 "
        val n700 = "accent-amber-700 "
        val n800 = "accent-amber-800 "
        val n900 = "accent-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "accent-yellow-50 "
        val n100 = "accent-yellow-100 "
        val n200 = "accent-yellow-200 "
        val n300 = "accent-yellow-300 "
        val n400 = "accent-yellow-400 "
        val n500 = "accent-yellow-500 "
        val n600 = "accent-yellow-600 "
        val n700 = "accent-yellow-700 "
        val n800 = "accent-yellow-800 "
        val n900 = "accent-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "accent-lime-50 "
        val n100 = "accent-lime-100 "
        val n200 = "accent-lime-200 "
        val n300 = "accent-lime-300 "
        val n400 = "accent-lime-400 "
        val n500 = "accent-lime-500 "
        val n600 = "accent-lime-600 "
        val n700 = "accent-lime-700 "
        val n800 = "accent-lime-800 "
        val n900 = "accent-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "accent-green-50 "
        val n100 = "accent-green-100 "
        val n200 = "accent-green-200 "
        val n300 = "accent-green-300 "
        val n400 = "accent-green-400 "
        val n500 = "accent-green-500 "
        val n600 = "accent-green-600 "
        val n700 = "accent-green-700 "
        val n800 = "accent-green-800 "
        val n900 = "accent-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "accent-emerald-50 "
        val n100 = "accent-emerald-100 "
        val n200 = "accent-emerald-200 "
        val n300 = "accent-emerald-300 "
        val n400 = "accent-emerald-400 "
        val n500 = "accent-emerald-500 "
        val n600 = "accent-emerald-600 "
        val n700 = "accent-emerald-700 "
        val n800 = "accent-emerald-800 "
        val n900 = "accent-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "accent-teal-50 "
        val n100 = "accent-teal-100 "
        val n200 = "accent-teal-200 "
        val n300 = "accent-teal-300 "
        val n400 = "accent-teal-400 "
        val n500 = "accent-teal-500 "
        val n600 = "accent-teal-600 "
        val n700 = "accent-teal-700 "
        val n800 = "accent-teal-800 "
        val n900 = "accent-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "accent-cyan-50 "
        val n100 = "accent-cyan-100 "
        val n200 = "accent-cyan-200 "
        val n300 = "accent-cyan-300 "
        val n400 = "accent-cyan-400 "
        val n500 = "accent-cyan-500 "
        val n600 = "accent-cyan-600 "
        val n700 = "accent-cyan-700 "
        val n800 = "accent-cyan-800 "
        val n900 = "accent-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "accent-sky-50 "
        val n100 = "accent-sky-100 "
        val n200 = "accent-sky-200 "
        val n300 = "accent-sky-300 "
        val n400 = "accent-sky-400 "
        val n500 = "accent-sky-500 "
        val n600 = "accent-sky-600 "
        val n700 = "accent-sky-700 "
        val n800 = "accent-sky-800 "
        val n900 = "accent-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "accent-blue-50 "
        val n100 = "accent-blue-100 "
        val n200 = "accent-blue-200 "
        val n300 = "accent-blue-300 "
        val n400 = "accent-blue-400 "
        val n500 = "accent-blue-500 "
        val n600 = "accent-blue-600 "
        val n700 = "accent-blue-700 "
        val n800 = "accent-blue-800 "
        val n900 = "accent-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "accent-indigo-50 "
        val n100 = "accent-indigo-100 "
        val n200 = "accent-indigo-200 "
        val n300 = "accent-indigo-300 "
        val n400 = "accent-indigo-400 "
        val n500 = "accent-indigo-500 "
        val n600 = "accent-indigo-600 "
        val n700 = "accent-indigo-700 "
        val n800 = "accent-indigo-800 "
        val n900 = "accent-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "accent-violet-50 "
        val n100 = "accent-violet-100 "
        val n200 = "accent-violet-200 "
        val n300 = "accent-violet-300 "
        val n400 = "accent-violet-400 "
        val n500 = "accent-violet-500 "
        val n600 = "accent-violet-600 "
        val n700 = "accent-violet-700 "
        val n800 = "accent-violet-800 "
        val n900 = "accent-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "accent-fuchsia-50 "
        val n100 = "accent-fuchsia-100 "
        val n200 = "accent-fuchsia-200 "
        val n300 = "accent-fuchsia-300 "
        val n400 = "accent-fuchsia-400 "
        val n500 = "accent-fuchsia-500 "
        val n600 = "accent-fuchsia-600 "
        val n700 = "accent-fuchsia-700 "
        val n800 = "accent-fuchsia-800 "
        val n900 = "accent-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "accent-pink-50 "
        val n100 = "accent-pink-100 "
        val n200 = "accent-pink-200 "
        val n300 = "accent-pink-300 "
        val n400 = "accent-pink-400 "
        val n500 = "accent-pink-500 "
        val n600 = "accent-pink-600 "
        val n700 = "accent-pink-700 "
        val n800 = "accent-pink-800 "
        val n900 = "accent-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "accent-rose-50 "
        val n100 = "accent-rose-100 "
        val n200 = "accent-rose-200 "
        val n300 = "accent-rose-300 "
        val n400 = "accent-rose-400 "
        val n500 = "accent-rose-500 "
        val n600 = "accent-rose-600 "
        val n700 = "accent-rose-700 "
        val n800 = "accent-rose-800 "
        val n900 = "accent-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}
