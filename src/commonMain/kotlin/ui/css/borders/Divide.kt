package ui.css.borders

val divide = Divide.instance

class Divide private constructor() {
    val x = X.instance
    val y = Y.instance

    // STYLE
    val solid = "divide-solid "
    val dashed = "divide-dashed "
    val dotted = "divide-dotted "
    val double = "divide-double "
    val none = "divide-none "

    // COLORS
    val inherit = "divide-inherit "
    val current = "divide-current "
    val transparent = "divide-transparent "
    val black = "divide-black "
    val white = "divide-white "

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
        val instance: Divide = Divide()
    }

    class X private constructor() {
        val n0 = "divide-x-0 "
        val n1 = "divide-x "
        val n2 = "divide-x-2 "
        val n4 = "divide-x-4 "
        val n8 = "divide-x-8 "
        val reverse = "divide-x-reverse "

        override fun toString(): String = n1

        companion object {
            val instance = X()
        }
    }

    class Y private constructor() {
        val n0 = "divide-y-0 "
        val n1 = "divide-y "
        val n2 = "divide-y-2 "
        val n4 = "divide-y-4 "
        val n8 = "divide-y-8 "
        val reverse = "divide-y-reverse "

        override fun toString(): String = n1

        companion object {
            val instance = Y()
        }
    }

    class Slate private constructor() {
        val n50 = "divide-slate-50 "
        val n100 = "divide-slate-100 "
        val n200 = "divide-slate-200 "
        val n300 = "divide-slate-300 "
        val n400 = "divide-slate-400 "
        val n500 = "divide-slate-500 "
        val n600 = "divide-slate-600 "
        val n700 = "divide-slate-700 "
        val n800 = "divide-slate-800 "
        val n900 = "divide-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "divide-gray-50 "
        val n100 = "divide-gray-100 "
        val n200 = "divide-gray-200 "
        val n300 = "divide-gray-300 "
        val n400 = "divide-gray-400 "
        val n500 = "divide-gray-500 "
        val n600 = "divide-gray-600 "
        val n700 = "divide-gray-700 "
        val n800 = "divide-gray-800 "
        val n900 = "divide-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "divide-zinc-50 "
        val n100 = "divide-zinc-100 "
        val n200 = "divide-zinc-200 "
        val n300 = "divide-zinc-300 "
        val n400 = "divide-zinc-400 "
        val n500 = "divide-zinc-500 "
        val n600 = "divide-zinc-600 "
        val n700 = "divide-zinc-700 "
        val n800 = "divide-zinc-800 "
        val n900 = "divide-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "divide-neutral-50 "
        val n100 = "divide-neutral-100 "
        val n200 = "divide-neutral-200 "
        val n300 = "divide-neutral-300 "
        val n400 = "divide-neutral-400 "
        val n500 = "divide-neutral-500 "
        val n600 = "divide-neutral-600 "
        val n700 = "divide-neutral-700 "
        val n800 = "divide-neutral-800 "
        val n900 = "divide-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "divide-stone-50 "
        val n100 = "divide-stone-100 "
        val n200 = "divide-stone-200 "
        val n300 = "divide-stone-300 "
        val n400 = "divide-stone-400 "
        val n500 = "divide-stone-500 "
        val n600 = "divide-stone-600 "
        val n700 = "divide-stone-700 "
        val n800 = "divide-stone-800 "
        val n900 = "divide-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "divide-red-50 "
        val n100 = "divide-red-100 "
        val n200 = "divide-red-200 "
        val n300 = "divide-red-300 "
        val n400 = "divide-red-400 "
        val n500 = "divide-red-500 "
        val n600 = "divide-red-600 "
        val n700 = "divide-red-700 "
        val n800 = "divide-red-800 "
        val n900 = "divide-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "divide-orange-50 "
        val n100 = "divide-orange-100 "
        val n200 = "divide-orange-200 "
        val n300 = "divide-orange-300 "
        val n400 = "divide-orange-400 "
        val n500 = "divide-orange-500 "
        val n600 = "divide-orange-600 "
        val n700 = "divide-orange-700 "
        val n800 = "divide-orange-800 "
        val n900 = "divide-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "divide-amber-50 "
        val n100 = "divide-amber-100 "
        val n200 = "divide-amber-200 "
        val n300 = "divide-amber-300 "
        val n400 = "divide-amber-400 "
        val n500 = "divide-amber-500 "
        val n600 = "divide-amber-600 "
        val n700 = "divide-amber-700 "
        val n800 = "divide-amber-800 "
        val n900 = "divide-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "divide-yellow-50 "
        val n100 = "divide-yellow-100 "
        val n200 = "divide-yellow-200 "
        val n300 = "divide-yellow-300 "
        val n400 = "divide-yellow-400 "
        val n500 = "divide-yellow-500 "
        val n600 = "divide-yellow-600 "
        val n700 = "divide-yellow-700 "
        val n800 = "divide-yellow-800 "
        val n900 = "divide-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "divide-lime-50 "
        val n100 = "divide-lime-100 "
        val n200 = "divide-lime-200 "
        val n300 = "divide-lime-300 "
        val n400 = "divide-lime-400 "
        val n500 = "divide-lime-500 "
        val n600 = "divide-lime-600 "
        val n700 = "divide-lime-700 "
        val n800 = "divide-lime-800 "
        val n900 = "divide-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "divide-green-50 "
        val n100 = "divide-green-100 "
        val n200 = "divide-green-200 "
        val n300 = "divide-green-300 "
        val n400 = "divide-green-400 "
        val n500 = "divide-green-500 "
        val n600 = "divide-green-600 "
        val n700 = "divide-green-700 "
        val n800 = "divide-green-800 "
        val n900 = "divide-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "divide-emerald-50 "
        val n100 = "divide-emerald-100 "
        val n200 = "divide-emerald-200 "
        val n300 = "divide-emerald-300 "
        val n400 = "divide-emerald-400 "
        val n500 = "divide-emerald-500 "
        val n600 = "divide-emerald-600 "
        val n700 = "divide-emerald-700 "
        val n800 = "divide-emerald-800 "
        val n900 = "divide-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "divide-teal-50 "
        val n100 = "divide-teal-100 "
        val n200 = "divide-teal-200 "
        val n300 = "divide-teal-300 "
        val n400 = "divide-teal-400 "
        val n500 = "divide-teal-500 "
        val n600 = "divide-teal-600 "
        val n700 = "divide-teal-700 "
        val n800 = "divide-teal-800 "
        val n900 = "divide-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "divide-cyan-50 "
        val n100 = "divide-cyan-100 "
        val n200 = "divide-cyan-200 "
        val n300 = "divide-cyan-300 "
        val n400 = "divide-cyan-400 "
        val n500 = "divide-cyan-500 "
        val n600 = "divide-cyan-600 "
        val n700 = "divide-cyan-700 "
        val n800 = "divide-cyan-800 "
        val n900 = "divide-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "divide-sky-50 "
        val n100 = "divide-sky-100 "
        val n200 = "divide-sky-200 "
        val n300 = "divide-sky-300 "
        val n400 = "divide-sky-400 "
        val n500 = "divide-sky-500 "
        val n600 = "divide-sky-600 "
        val n700 = "divide-sky-700 "
        val n800 = "divide-sky-800 "
        val n900 = "divide-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "divide-blue-50 "
        val n100 = "divide-blue-100 "
        val n200 = "divide-blue-200 "
        val n300 = "divide-blue-300 "
        val n400 = "divide-blue-400 "
        val n500 = "divide-blue-500 "
        val n600 = "divide-blue-600 "
        val n700 = "divide-blue-700 "
        val n800 = "divide-blue-800 "
        val n900 = "divide-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "divide-indigo-50 "
        val n100 = "divide-indigo-100 "
        val n200 = "divide-indigo-200 "
        val n300 = "divide-indigo-300 "
        val n400 = "divide-indigo-400 "
        val n500 = "divide-indigo-500 "
        val n600 = "divide-indigo-600 "
        val n700 = "divide-indigo-700 "
        val n800 = "divide-indigo-800 "
        val n900 = "divide-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "divide-violet-50 "
        val n100 = "divide-violet-100 "
        val n200 = "divide-violet-200 "
        val n300 = "divide-violet-300 "
        val n400 = "divide-violet-400 "
        val n500 = "divide-violet-500 "
        val n600 = "divide-violet-600 "
        val n700 = "divide-violet-700 "
        val n800 = "divide-violet-800 "
        val n900 = "divide-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "divide-purple-50 "
        val n100 = "divide-purple-100 "
        val n200 = "divide-purple-200 "
        val n300 = "divide-purple-300 "
        val n400 = "divide-purple-400 "
        val n500 = "divide-purple-500 "
        val n600 = "divide-purple-600 "
        val n700 = "divide-purple-700 "
        val n800 = "divide-purple-800 "
        val n900 = "divide-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "divide-fuchsia-50 "
        val n100 = "divide-fuchsia-100 "
        val n200 = "divide-fuchsia-200 "
        val n300 = "divide-fuchsia-300 "
        val n400 = "divide-fuchsia-400 "
        val n500 = "divide-fuchsia-500 "
        val n600 = "divide-fuchsia-600 "
        val n700 = "divide-fuchsia-700 "
        val n800 = "divide-fuchsia-800 "
        val n900 = "divide-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "divide-pink-50 "
        val n100 = "divide-pink-100 "
        val n200 = "divide-pink-200 "
        val n300 = "divide-pink-300 "
        val n400 = "divide-pink-400 "
        val n500 = "divide-pink-500 "
        val n600 = "divide-pink-600 "
        val n700 = "divide-pink-700 "
        val n800 = "divide-pink-800 "
        val n900 = "divide-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "divide-rose-50 "
        val n100 = "divide-rose-100 "
        val n200 = "divide-rose-200 "
        val n300 = "divide-rose-300 "
        val n400 = "divide-rose-400 "
        val n500 = "divide-rose-500 "
        val n600 = "divide-rose-600 "
        val n700 = "divide-rose-700 "
        val n800 = "divide-rose-800 "
        val n900 = "divide-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}