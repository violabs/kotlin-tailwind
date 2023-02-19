package ui.css.borders

val border = Border.instance

class Border private constructor() {
    // WIDTH
    val n0 = "border-0 "
    val n1 = "border "
    val n2 = "border-2 "
    val n4 = "border-4 "
    val n8 = "border-8 "

    // STYLE
    val solid = "border-solid "
    val dashed = "border-dashed "
    val dotted = "border-dotted "
    val double = "border-double "
    val hidden = "border-hidden "
    val none = "border-none "

    val x = X.instance
    val y = Y.instance
    val t = T.instance
    val r = R.instance
    val b = B.instance
    val l = L.instance

    // COLORS
    val inherit = "border-inherit "
    val current = "border-current "
    val transparent = "border-transparent "
    val black = "border-black "
    val white = "border-white "

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

    override fun toString(): String = n1

    class X private constructor() {
        val n0 = "border-x-0 "
        val n1 = "border-x "
        val n2 = "border-x-2 "
        val n4 = "border-x-4 "
        val n8 = "border-x-8 "
        companion object {
            val instance = X()
        }
    }

    class Y private constructor() {
        val n0 = "border-y-0 "
        val n1 = "border-y "
        val n2 = "border-y-2 "
        val n4 = "border-y-4 "
        val n8 = "border-y-8 "
        companion object {
            val instance = Y()
        }
    }

    class T private constructor() {
        val n0 = "border-t-0 "
        val n1 = "border-t "
        val n2 = "border-t-2 "
        val n4 = "border-t-4 "
        val n8 = "border-t-8 "
        companion object {
            val instance = T()
        }
    }

    class R private constructor() {
        val n0 = "border-r-0 "
        val n1 = "border-r "
        val n2 = "border-r-2 "
        val n4 = "border-r-4 "
        val n8 = "border-r-8 "
        companion object {
            val instance = R()
        }
    }

    class B private constructor() {
        val n0 = "border-b-0 "
        val n1 = "border-b "
        val n2 = "border-b-2 "
        val n4 = "border-b-4 "
        val n8 = "border-b-8 "
        companion object {
            val instance = B()
        }
    }

    class L private constructor() {
        val n0 = "border-l-0 "
        val n1 = "border-l "
        val n2 = "border-l-2 "
        val n4 = "border-l-4 "
        val n8 = "border-l-8 "
        companion object {
            val instance = L()
        }
    }

    companion object {
        val instance = Border()
    }

    class Slate private constructor() {
        val n50 = "border-slate-50 "
        val n100 = "border-slate-100 "
        val n200 = "border-slate-200 "
        val n300 = "border-slate-300 "
        val n400 = "border-slate-400 "
        val n500 = "border-slate-500 "
        val n600 = "border-slate-600 "
        val n700 = "border-slate-700 "
        val n800 = "border-slate-800 "
        val n900 = "border-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "border-gray-50 "
        val n100 = "border-gray-100 "
        val n200 = "border-gray-200 "
        val n300 = "border-gray-300 "
        val n400 = "border-gray-400 "
        val n500 = "border-gray-500 "
        val n600 = "border-gray-600 "
        val n700 = "border-gray-700 "
        val n800 = "border-gray-800 "
        val n900 = "border-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "border-zinc-50 "
        val n100 = "border-zinc-100 "
        val n200 = "border-zinc-200 "
        val n300 = "border-zinc-300 "
        val n400 = "border-zinc-400 "
        val n500 = "border-zinc-500 "
        val n600 = "border-zinc-600 "
        val n700 = "border-zinc-700 "
        val n800 = "border-zinc-800 "
        val n900 = "border-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "border-neutral-50 "
        val n100 = "border-neutral-100 "
        val n200 = "border-neutral-200 "
        val n300 = "border-neutral-300 "
        val n400 = "border-neutral-400 "
        val n500 = "border-neutral-500 "
        val n600 = "border-neutral-600 "
        val n700 = "border-neutral-700 "
        val n800 = "border-neutral-800 "
        val n900 = "border-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "border-stone-50 "
        val n100 = "border-stone-100 "
        val n200 = "border-stone-200 "
        val n300 = "border-stone-300 "
        val n400 = "border-stone-400 "
        val n500 = "border-stone-500 "
        val n600 = "border-stone-600 "
        val n700 = "border-stone-700 "
        val n800 = "border-stone-800 "
        val n900 = "border-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "border-red-50 "
        val n100 = "border-red-100 "
        val n200 = "border-red-200 "
        val n300 = "border-red-300 "
        val n400 = "border-red-400 "
        val n500 = "border-red-500 "
        val n600 = "border-red-600 "
        val n700 = "border-red-700 "
        val n800 = "border-red-800 "
        val n900 = "border-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "border-orange-50 "
        val n100 = "border-orange-100 "
        val n200 = "border-orange-200 "
        val n300 = "border-orange-300 "
        val n400 = "border-orange-400 "
        val n500 = "border-orange-500 "
        val n600 = "border-orange-600 "
        val n700 = "border-orange-700 "
        val n800 = "border-orange-800 "
        val n900 = "border-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "border-amber-50 "
        val n100 = "border-amber-100 "
        val n200 = "border-amber-200 "
        val n300 = "border-amber-300 "
        val n400 = "border-amber-400 "
        val n500 = "border-amber-500 "
        val n600 = "border-amber-600 "
        val n700 = "border-amber-700 "
        val n800 = "border-amber-800 "
        val n900 = "border-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "border-yellow-50 "
        val n100 = "border-yellow-100 "
        val n200 = "border-yellow-200 "
        val n300 = "border-yellow-300 "
        val n400 = "border-yellow-400 "
        val n500 = "border-yellow-500 "
        val n600 = "border-yellow-600 "
        val n700 = "border-yellow-700 "
        val n800 = "border-yellow-800 "
        val n900 = "border-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "border-lime-50 "
        val n100 = "border-lime-100 "
        val n200 = "border-lime-200 "
        val n300 = "border-lime-300 "
        val n400 = "border-lime-400 "
        val n500 = "border-lime-500 "
        val n600 = "border-lime-600 "
        val n700 = "border-lime-700 "
        val n800 = "border-lime-800 "
        val n900 = "border-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "border-green-50 "
        val n100 = "border-green-100 "
        val n200 = "border-green-200 "
        val n300 = "border-green-300 "
        val n400 = "border-green-400 "
        val n500 = "border-green-500 "
        val n600 = "border-green-600 "
        val n700 = "border-green-700 "
        val n800 = "border-green-800 "
        val n900 = "border-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "border-emerald-50 "
        val n100 = "border-emerald-100 "
        val n200 = "border-emerald-200 "
        val n300 = "border-emerald-300 "
        val n400 = "border-emerald-400 "
        val n500 = "border-emerald-500 "
        val n600 = "border-emerald-600 "
        val n700 = "border-emerald-700 "
        val n800 = "border-emerald-800 "
        val n900 = "border-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "border-teal-50 "
        val n100 = "border-teal-100 "
        val n200 = "border-teal-200 "
        val n300 = "border-teal-300 "
        val n400 = "border-teal-400 "
        val n500 = "border-teal-500 "
        val n600 = "border-teal-600 "
        val n700 = "border-teal-700 "
        val n800 = "border-teal-800 "
        val n900 = "border-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "border-cyan-50 "
        val n100 = "border-cyan-100 "
        val n200 = "border-cyan-200 "
        val n300 = "border-cyan-300 "
        val n400 = "border-cyan-400 "
        val n500 = "border-cyan-500 "
        val n600 = "border-cyan-600 "
        val n700 = "border-cyan-700 "
        val n800 = "border-cyan-800 "
        val n900 = "border-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "border-sky-50 "
        val n100 = "border-sky-100 "
        val n200 = "border-sky-200 "
        val n300 = "border-sky-300 "
        val n400 = "border-sky-400 "
        val n500 = "border-sky-500 "
        val n600 = "border-sky-600 "
        val n700 = "border-sky-700 "
        val n800 = "border-sky-800 "
        val n900 = "border-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "border-blue-50 "
        val n100 = "border-blue-100 "
        val n200 = "border-blue-200 "
        val n300 = "border-blue-300 "
        val n400 = "border-blue-400 "
        val n500 = "border-blue-500 "
        val n600 = "border-blue-600 "
        val n700 = "border-blue-700 "
        val n800 = "border-blue-800 "
        val n900 = "border-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "border-indigo-50 "
        val n100 = "border-indigo-100 "
        val n200 = "border-indigo-200 "
        val n300 = "border-indigo-300 "
        val n400 = "border-indigo-400 "
        val n500 = "border-indigo-500 "
        val n600 = "border-indigo-600 "
        val n700 = "border-indigo-700 "
        val n800 = "border-indigo-800 "
        val n900 = "border-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "border-violet-50 "
        val n100 = "border-violet-100 "
        val n200 = "border-violet-200 "
        val n300 = "border-violet-300 "
        val n400 = "border-violet-400 "
        val n500 = "border-violet-500 "
        val n600 = "border-violet-600 "
        val n700 = "border-violet-700 "
        val n800 = "border-violet-800 "
        val n900 = "border-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "border-purple-50 "
        val n100 = "border-purple-100 "
        val n200 = "border-purple-200 "
        val n300 = "border-purple-300 "
        val n400 = "border-purple-400 "
        val n500 = "border-purple-500 "
        val n600 = "border-purple-600 "
        val n700 = "border-purple-700 "
        val n800 = "border-purple-800 "
        val n900 = "border-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "border-fuchsia-50 "
        val n100 = "border-fuchsia-100 "
        val n200 = "border-fuchsia-200 "
        val n300 = "border-fuchsia-300 "
        val n400 = "border-fuchsia-400 "
        val n500 = "border-fuchsia-500 "
        val n600 = "border-fuchsia-600 "
        val n700 = "border-fuchsia-700 "
        val n800 = "border-fuchsia-800 "
        val n900 = "border-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "border-pink-50 "
        val n100 = "border-pink-100 "
        val n200 = "border-pink-200 "
        val n300 = "border-pink-300 "
        val n400 = "border-pink-400 "
        val n500 = "border-pink-500 "
        val n600 = "border-pink-600 "
        val n700 = "border-pink-700 "
        val n800 = "border-pink-800 "
        val n900 = "border-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "border-rose-50 "
        val n100 = "border-rose-100 "
        val n200 = "border-rose-200 "
        val n300 = "border-rose-300 "
        val n400 = "border-rose-400 "
        val n500 = "border-rose-500 "
        val n600 = "border-rose-600 "
        val n700 = "border-rose-700 "
        val n800 = "border-rose-800 "
        val n900 = "border-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}