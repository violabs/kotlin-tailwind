package ui.css.effects

val shadow = Shadow.instance

class Shadow private constructor() {
    val sm = "shadow-sm "
    val it = "shadow "
    val md = "shadow-md "
    val lg = "shadow-lg "
    val xl = "shadow-xl "
    val n2xl = "shadow-2xl "
    val inner = "shadow-inner "
    val none = "shadow-none "

    // COLORS
    val inherit = "shadow-inherit "
    val current = "shadow-current "
    val transparent = "shadow-transparent "
    val black = "shadow-black "
    val white = "shadow-white "

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

    override fun toString(): String = it

    companion object {
        val instance = Shadow()
    }

    class Slate private constructor() {
        val n50 = "shadow-slate-50 "
        val n100 = "shadow-slate-100 "
        val n200 = "shadow-slate-200 "
        val n300 = "shadow-slate-300 "
        val n400 = "shadow-slate-400 "
        val n500 = "shadow-slate-500 "
        val n600 = "shadow-slate-600 "
        val n700 = "shadow-slate-700 "
        val n800 = "shadow-slate-800 "
        val n900 = "shadow-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "shadow-gray-50 "
        val n100 = "shadow-gray-100 "
        val n200 = "shadow-gray-200 "
        val n300 = "shadow-gray-300 "
        val n400 = "shadow-gray-400 "
        val n500 = "shadow-gray-500 "
        val n600 = "shadow-gray-600 "
        val n700 = "shadow-gray-700 "
        val n800 = "shadow-gray-800 "
        val n900 = "shadow-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "shadow-zinc-50 "
        val n100 = "shadow-zinc-100 "
        val n200 = "shadow-zinc-200 "
        val n300 = "shadow-zinc-300 "
        val n400 = "shadow-zinc-400 "
        val n500 = "shadow-zinc-500 "
        val n600 = "shadow-zinc-600 "
        val n700 = "shadow-zinc-700 "
        val n800 = "shadow-zinc-800 "
        val n900 = "shadow-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "shadow-neutral-50 "
        val n100 = "shadow-neutral-100 "
        val n200 = "shadow-neutral-200 "
        val n300 = "shadow-neutral-300 "
        val n400 = "shadow-neutral-400 "
        val n500 = "shadow-neutral-500 "
        val n600 = "shadow-neutral-600 "
        val n700 = "shadow-neutral-700 "
        val n800 = "shadow-neutral-800 "
        val n900 = "shadow-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "shadow-stone-50 "
        val n100 = "shadow-stone-100 "
        val n200 = "shadow-stone-200 "
        val n300 = "shadow-stone-300 "
        val n400 = "shadow-stone-400 "
        val n500 = "shadow-stone-500 "
        val n600 = "shadow-stone-600 "
        val n700 = "shadow-stone-700 "
        val n800 = "shadow-stone-800 "
        val n900 = "shadow-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "shadow-red-50 "
        val n100 = "shadow-red-100 "
        val n200 = "shadow-red-200 "
        val n300 = "shadow-red-300 "
        val n400 = "shadow-red-400 "
        val n500 = "shadow-red-500 "
        val n600 = "shadow-red-600 "
        val n700 = "shadow-red-700 "
        val n800 = "shadow-red-800 "
        val n900 = "shadow-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "shadow-orange-50 "
        val n100 = "shadow-orange-100 "
        val n200 = "shadow-orange-200 "
        val n300 = "shadow-orange-300 "
        val n400 = "shadow-orange-400 "
        val n500 = "shadow-orange-500 "
        val n600 = "shadow-orange-600 "
        val n700 = "shadow-orange-700 "
        val n800 = "shadow-orange-800 "
        val n900 = "shadow-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "shadow-amber-50 "
        val n100 = "shadow-amber-100 "
        val n200 = "shadow-amber-200 "
        val n300 = "shadow-amber-300 "
        val n400 = "shadow-amber-400 "
        val n500 = "shadow-amber-500 "
        val n600 = "shadow-amber-600 "
        val n700 = "shadow-amber-700 "
        val n800 = "shadow-amber-800 "
        val n900 = "shadow-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "shadow-yellow-50 "
        val n100 = "shadow-yellow-100 "
        val n200 = "shadow-yellow-200 "
        val n300 = "shadow-yellow-300 "
        val n400 = "shadow-yellow-400 "
        val n500 = "shadow-yellow-500 "
        val n600 = "shadow-yellow-600 "
        val n700 = "shadow-yellow-700 "
        val n800 = "shadow-yellow-800 "
        val n900 = "shadow-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "shadow-lime-50 "
        val n100 = "shadow-lime-100 "
        val n200 = "shadow-lime-200 "
        val n300 = "shadow-lime-300 "
        val n400 = "shadow-lime-400 "
        val n500 = "shadow-lime-500 "
        val n600 = "shadow-lime-600 "
        val n700 = "shadow-lime-700 "
        val n800 = "shadow-lime-800 "
        val n900 = "shadow-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "shadow-green-50 "
        val n100 = "shadow-green-100 "
        val n200 = "shadow-green-200 "
        val n300 = "shadow-green-300 "
        val n400 = "shadow-green-400 "
        val n500 = "shadow-green-500 "
        val n600 = "shadow-green-600 "
        val n700 = "shadow-green-700 "
        val n800 = "shadow-green-800 "
        val n900 = "shadow-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "shadow-emerald-50 "
        val n100 = "shadow-emerald-100 "
        val n200 = "shadow-emerald-200 "
        val n300 = "shadow-emerald-300 "
        val n400 = "shadow-emerald-400 "
        val n500 = "shadow-emerald-500 "
        val n600 = "shadow-emerald-600 "
        val n700 = "shadow-emerald-700 "
        val n800 = "shadow-emerald-800 "
        val n900 = "shadow-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "shadow-teal-50 "
        val n100 = "shadow-teal-100 "
        val n200 = "shadow-teal-200 "
        val n300 = "shadow-teal-300 "
        val n400 = "shadow-teal-400 "
        val n500 = "shadow-teal-500 "
        val n600 = "shadow-teal-600 "
        val n700 = "shadow-teal-700 "
        val n800 = "shadow-teal-800 "
        val n900 = "shadow-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "shadow-cyan-50 "
        val n100 = "shadow-cyan-100 "
        val n200 = "shadow-cyan-200 "
        val n300 = "shadow-cyan-300 "
        val n400 = "shadow-cyan-400 "
        val n500 = "shadow-cyan-500 "
        val n600 = "shadow-cyan-600 "
        val n700 = "shadow-cyan-700 "
        val n800 = "shadow-cyan-800 "
        val n900 = "shadow-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "shadow-sky-50 "
        val n100 = "shadow-sky-100 "
        val n200 = "shadow-sky-200 "
        val n300 = "shadow-sky-300 "
        val n400 = "shadow-sky-400 "
        val n500 = "shadow-sky-500 "
        val n600 = "shadow-sky-600 "
        val n700 = "shadow-sky-700 "
        val n800 = "shadow-sky-800 "
        val n900 = "shadow-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "shadow-blue-50 "
        val n100 = "shadow-blue-100 "
        val n200 = "shadow-blue-200 "
        val n300 = "shadow-blue-300 "
        val n400 = "shadow-blue-400 "
        val n500 = "shadow-blue-500 "
        val n600 = "shadow-blue-600 "
        val n700 = "shadow-blue-700 "
        val n800 = "shadow-blue-800 "
        val n900 = "shadow-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "shadow-indigo-50 "
        val n100 = "shadow-indigo-100 "
        val n200 = "shadow-indigo-200 "
        val n300 = "shadow-indigo-300 "
        val n400 = "shadow-indigo-400 "
        val n500 = "shadow-indigo-500 "
        val n600 = "shadow-indigo-600 "
        val n700 = "shadow-indigo-700 "
        val n800 = "shadow-indigo-800 "
        val n900 = "shadow-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "shadow-violet-50 "
        val n100 = "shadow-violet-100 "
        val n200 = "shadow-violet-200 "
        val n300 = "shadow-violet-300 "
        val n400 = "shadow-violet-400 "
        val n500 = "shadow-violet-500 "
        val n600 = "shadow-violet-600 "
        val n700 = "shadow-violet-700 "
        val n800 = "shadow-violet-800 "
        val n900 = "shadow-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "shadow-purple-50 "
        val n100 = "shadow-purple-100 "
        val n200 = "shadow-purple-200 "
        val n300 = "shadow-purple-300 "
        val n400 = "shadow-purple-400 "
        val n500 = "shadow-purple-500 "
        val n600 = "shadow-purple-600 "
        val n700 = "shadow-purple-700 "
        val n800 = "shadow-purple-800 "
        val n900 = "shadow-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "shadow-fuchsia-50 "
        val n100 = "shadow-fuchsia-100 "
        val n200 = "shadow-fuchsia-200 "
        val n300 = "shadow-fuchsia-300 "
        val n400 = "shadow-fuchsia-400 "
        val n500 = "shadow-fuchsia-500 "
        val n600 = "shadow-fuchsia-600 "
        val n700 = "shadow-fuchsia-700 "
        val n800 = "shadow-fuchsia-800 "
        val n900 = "shadow-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "shadow-pink-50 "
        val n100 = "shadow-pink-100 "
        val n200 = "shadow-pink-200 "
        val n300 = "shadow-pink-300 "
        val n400 = "shadow-pink-400 "
        val n500 = "shadow-pink-500 "
        val n600 = "shadow-pink-600 "
        val n700 = "shadow-pink-700 "
        val n800 = "shadow-pink-800 "
        val n900 = "shadow-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "shadow-rose-50 "
        val n100 = "shadow-rose-100 "
        val n200 = "shadow-rose-200 "
        val n300 = "shadow-rose-300 "
        val n400 = "shadow-rose-400 "
        val n500 = "shadow-rose-500 "
        val n600 = "shadow-rose-600 "
        val n700 = "shadow-rose-700 "
        val n800 = "shadow-rose-800 "
        val n900 = "shadow-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}