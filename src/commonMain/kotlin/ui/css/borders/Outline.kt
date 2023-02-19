package ui.css.borders

val outline = Outline.instance

class Outline private constructor() {
    val n0 = "outline-0 "
    val n1 = "outline-1 "
    val n2 = "outline-2 "
    val n4 = "outline-4 "
    val n8 = "outline-8 "

    // STYLES
    val none = "outline-none "
    val it = "outline "
    val dashed = "outline-dashed "
    val dotted = "outline-dotted "
    val double = "outline-double "

    val offset = Offset.instance

    // COLORS
    val inherit = "outline-inherit "
    val current = "outline-current "
    val transparent = "outline-transparent "
    val black = "outline-black "
    val white = "outline-white "

    val slate = Divide.Slate.instance
    val gray = Divide.Gray.instance
    val zinc = Divide.Zinc.instance
    val neutral = Divide.Neutral.instance
    val stone = Divide.Stone.instance
    val red = Divide.Red.instance
    val orange = Divide.Orange.instance
    val amber = Divide.Amber.instance
    val yellow = Divide.Yellow.instance
    val lime = Divide.Lime.instance
    val green = Divide.Green.instance
    val emerald = Divide.Emerald.instance
    val teal = Divide.Teal.instance
    val cyan = Divide.Cyan.instance
    val sky = Divide.Sky.instance
    val blue = Divide.Blue.instance
    val indigo = Divide.Indigo.instance
    val violet = Divide.Violet.instance
    val purple = Divide.Purple.instance
    val fuchsia = Divide.Fuchsia.instance
    val pink = Divide.Pink.instance
    val rose = Divide.Rose.instance

    override fun toString(): String = it

    companion object {
        val instance: Outline = Outline()
    }

    class Offset private constructor() {
        val n0 = "outline-offset-0 "
        val n1 = "outline-offset-1 "
        val n2 = "outline-offset-2 "
        val n4 = "outline-offset-4 "
        val n8 = "outline-offset-8 "

        companion object {
            val instance = Offset()
        }
    }

    class Slate private constructor() {
        val n50 = "outline-slate-50 "
        val n100 = "outline-slate-100 "
        val n200 = "outline-slate-200 "
        val n300 = "outline-slate-300 "
        val n400 = "outline-slate-400 "
        val n500 = "outline-slate-500 "
        val n600 = "outline-slate-600 "
        val n700 = "outline-slate-700 "
        val n800 = "outline-slate-800 "
        val n900 = "outline-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "outline-gray-50 "
        val n100 = "outline-gray-100 "
        val n200 = "outline-gray-200 "
        val n300 = "outline-gray-300 "
        val n400 = "outline-gray-400 "
        val n500 = "outline-gray-500 "
        val n600 = "outline-gray-600 "
        val n700 = "outline-gray-700 "
        val n800 = "outline-gray-800 "
        val n900 = "outline-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "outline-zinc-50 "
        val n100 = "outline-zinc-100 "
        val n200 = "outline-zinc-200 "
        val n300 = "outline-zinc-300 "
        val n400 = "outline-zinc-400 "
        val n500 = "outline-zinc-500 "
        val n600 = "outline-zinc-600 "
        val n700 = "outline-zinc-700 "
        val n800 = "outline-zinc-800 "
        val n900 = "outline-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "outline-neutral-50 "
        val n100 = "outline-neutral-100 "
        val n200 = "outline-neutral-200 "
        val n300 = "outline-neutral-300 "
        val n400 = "outline-neutral-400 "
        val n500 = "outline-neutral-500 "
        val n600 = "outline-neutral-600 "
        val n700 = "outline-neutral-700 "
        val n800 = "outline-neutral-800 "
        val n900 = "outline-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "outline-stone-50 "
        val n100 = "outline-stone-100 "
        val n200 = "outline-stone-200 "
        val n300 = "outline-stone-300 "
        val n400 = "outline-stone-400 "
        val n500 = "outline-stone-500 "
        val n600 = "outline-stone-600 "
        val n700 = "outline-stone-700 "
        val n800 = "outline-stone-800 "
        val n900 = "outline-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "outline-red-50 "
        val n100 = "outline-red-100 "
        val n200 = "outline-red-200 "
        val n300 = "outline-red-300 "
        val n400 = "outline-red-400 "
        val n500 = "outline-red-500 "
        val n600 = "outline-red-600 "
        val n700 = "outline-red-700 "
        val n800 = "outline-red-800 "
        val n900 = "outline-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "outline-orange-50 "
        val n100 = "outline-orange-100 "
        val n200 = "outline-orange-200 "
        val n300 = "outline-orange-300 "
        val n400 = "outline-orange-400 "
        val n500 = "outline-orange-500 "
        val n600 = "outline-orange-600 "
        val n700 = "outline-orange-700 "
        val n800 = "outline-orange-800 "
        val n900 = "outline-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "outline-amber-50 "
        val n100 = "outline-amber-100 "
        val n200 = "outline-amber-200 "
        val n300 = "outline-amber-300 "
        val n400 = "outline-amber-400 "
        val n500 = "outline-amber-500 "
        val n600 = "outline-amber-600 "
        val n700 = "outline-amber-700 "
        val n800 = "outline-amber-800 "
        val n900 = "outline-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "outline-yellow-50 "
        val n100 = "outline-yellow-100 "
        val n200 = "outline-yellow-200 "
        val n300 = "outline-yellow-300 "
        val n400 = "outline-yellow-400 "
        val n500 = "outline-yellow-500 "
        val n600 = "outline-yellow-600 "
        val n700 = "outline-yellow-700 "
        val n800 = "outline-yellow-800 "
        val n900 = "outline-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "outline-lime-50 "
        val n100 = "outline-lime-100 "
        val n200 = "outline-lime-200 "
        val n300 = "outline-lime-300 "
        val n400 = "outline-lime-400 "
        val n500 = "outline-lime-500 "
        val n600 = "outline-lime-600 "
        val n700 = "outline-lime-700 "
        val n800 = "outline-lime-800 "
        val n900 = "outline-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "outline-green-50 "
        val n100 = "outline-green-100 "
        val n200 = "outline-green-200 "
        val n300 = "outline-green-300 "
        val n400 = "outline-green-400 "
        val n500 = "outline-green-500 "
        val n600 = "outline-green-600 "
        val n700 = "outline-green-700 "
        val n800 = "outline-green-800 "
        val n900 = "outline-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "outline-emerald-50 "
        val n100 = "outline-emerald-100 "
        val n200 = "outline-emerald-200 "
        val n300 = "outline-emerald-300 "
        val n400 = "outline-emerald-400 "
        val n500 = "outline-emerald-500 "
        val n600 = "outline-emerald-600 "
        val n700 = "outline-emerald-700 "
        val n800 = "outline-emerald-800 "
        val n900 = "outline-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "outline-teal-50 "
        val n100 = "outline-teal-100 "
        val n200 = "outline-teal-200 "
        val n300 = "outline-teal-300 "
        val n400 = "outline-teal-400 "
        val n500 = "outline-teal-500 "
        val n600 = "outline-teal-600 "
        val n700 = "outline-teal-700 "
        val n800 = "outline-teal-800 "
        val n900 = "outline-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "outline-cyan-50 "
        val n100 = "outline-cyan-100 "
        val n200 = "outline-cyan-200 "
        val n300 = "outline-cyan-300 "
        val n400 = "outline-cyan-400 "
        val n500 = "outline-cyan-500 "
        val n600 = "outline-cyan-600 "
        val n700 = "outline-cyan-700 "
        val n800 = "outline-cyan-800 "
        val n900 = "outline-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "outline-sky-50 "
        val n100 = "outline-sky-100 "
        val n200 = "outline-sky-200 "
        val n300 = "outline-sky-300 "
        val n400 = "outline-sky-400 "
        val n500 = "outline-sky-500 "
        val n600 = "outline-sky-600 "
        val n700 = "outline-sky-700 "
        val n800 = "outline-sky-800 "
        val n900 = "outline-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "outline-blue-50 "
        val n100 = "outline-blue-100 "
        val n200 = "outline-blue-200 "
        val n300 = "outline-blue-300 "
        val n400 = "outline-blue-400 "
        val n500 = "outline-blue-500 "
        val n600 = "outline-blue-600 "
        val n700 = "outline-blue-700 "
        val n800 = "outline-blue-800 "
        val n900 = "outline-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "outline-indigo-50 "
        val n100 = "outline-indigo-100 "
        val n200 = "outline-indigo-200 "
        val n300 = "outline-indigo-300 "
        val n400 = "outline-indigo-400 "
        val n500 = "outline-indigo-500 "
        val n600 = "outline-indigo-600 "
        val n700 = "outline-indigo-700 "
        val n800 = "outline-indigo-800 "
        val n900 = "outline-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "outline-violet-50 "
        val n100 = "outline-violet-100 "
        val n200 = "outline-violet-200 "
        val n300 = "outline-violet-300 "
        val n400 = "outline-violet-400 "
        val n500 = "outline-violet-500 "
        val n600 = "outline-violet-600 "
        val n700 = "outline-violet-700 "
        val n800 = "outline-violet-800 "
        val n900 = "outline-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "outline-purple-50 "
        val n100 = "outline-purple-100 "
        val n200 = "outline-purple-200 "
        val n300 = "outline-purple-300 "
        val n400 = "outline-purple-400 "
        val n500 = "outline-purple-500 "
        val n600 = "outline-purple-600 "
        val n700 = "outline-purple-700 "
        val n800 = "outline-purple-800 "
        val n900 = "outline-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "outline-fuchsia-50 "
        val n100 = "outline-fuchsia-100 "
        val n200 = "outline-fuchsia-200 "
        val n300 = "outline-fuchsia-300 "
        val n400 = "outline-fuchsia-400 "
        val n500 = "outline-fuchsia-500 "
        val n600 = "outline-fuchsia-600 "
        val n700 = "outline-fuchsia-700 "
        val n800 = "outline-fuchsia-800 "
        val n900 = "outline-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "outline-pink-50 "
        val n100 = "outline-pink-100 "
        val n200 = "outline-pink-200 "
        val n300 = "outline-pink-300 "
        val n400 = "outline-pink-400 "
        val n500 = "outline-pink-500 "
        val n600 = "outline-pink-600 "
        val n700 = "outline-pink-700 "
        val n800 = "outline-pink-800 "
        val n900 = "outline-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "outline-rose-50 "
        val n100 = "outline-rose-100 "
        val n200 = "outline-rose-200 "
        val n300 = "outline-rose-300 "
        val n400 = "outline-rose-400 "
        val n500 = "outline-rose-500 "
        val n600 = "outline-rose-600 "
        val n700 = "outline-rose-700 "
        val n800 = "outline-rose-800 "
        val n900 = "outline-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}