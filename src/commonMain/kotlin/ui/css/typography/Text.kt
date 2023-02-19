package ui.css.typography

val text = Text.instance

class Text private constructor() {

    val xs = "text-xs "
    val sm = "text-sm "
    val base = "text-base "
    val lg = "text-lg "
    val xl = "text-xl "
    val n2xl = "text-2xl "
    val n3xl = "text-3xl "
    val n4xl = "text-4xl "
    val n5xl = "text-5xl "
    val n6xl = "text-6xl "
    val n7xl = "text-7xl "
    val n8xl = "text-8xl "
    val n9xl = "text-9xl "

    // H-ALIGN
    val left = "text-left "
    val center = "text-center "
    val right = "text-right "
    val justify = "text-justify "
    val start = "text-start "
    val end = "text-end "

    // V-ALIGN
    val align = VerticalAlign.instance

    // TRANSFORM
    val uppercase = "uppercase "
    val lowercase = "lowercase "
    val capitalize = "capitalize "
    val normalCase = "normal-case "

    // OVERFLOW
    val truncate = "truncate "
    val textEllipses = "text-ellipsis "
    val textClip = "text-clip "

    // INDENT
    val indent = Indent.instance

    // COLOR
    val inherit = "text-inherit "
    val current = "text-current "
    val transparent = "text-transparent "
    val black = "text-black "
    val white = "text-white "

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
        val instance: Text = Text()
    }

    class VerticalAlign private constructor() {
        val baseline = "align-baseline "
        val top = "align-top "
        val middle = "align-middle "
        val bottom = "align-bottom "
        val textTop = "align-text-top "
        val textBottom = "align-text-bottom "
        val sub = "align-sub "
        val `super` = "align-super "

        companion object {
            val instance = VerticalAlign()
        }
    }

    class Indent private constructor() {
        val n0 = "indent-0 "
        val px = "indent-px "
        val n0_5 = "indent-0.5 "
        val n1 = "indent-1 "
        val n1_5 = "indent-1.5 "
        val n2 = "indent-2 "
        val n2_5 = "indent-2.5 "
        val n3 = "indent-3 "
        val n3_5 = "indent-3.5 "
        val n4 = "indent-4 "
        val n5 = "indent-5 "
        val n6 = "indent-6 "
        val n7 = "indent-7 "
        val n8 = "indent-8 "
        val n9 = "indent-9 "
        val n10 = "indent-10 "
        val n11 = "indent-11 "
        val n12 = "indent-12 "
        val n14 = "indent-14 "
        val n16 = "indent-16 "
        val n20 = "indent-20 "
        val n24 = "indent-24 "
        val n28 = "indent-28 "
        val n32 = "indent-32 "
        val n36 = "indent-36 "
        val n40 = "indent-40 "
        val n44 = "indent-44 "
        val n48 = "indent-48 "
        val n52 = "indent-52 "
        val n56 = "indent-56 "
        val n60 = "indent-60 "
        val n64 = "indent-64 "
        val n72 = "indent-72 "
        val n80 = "indent-80 "
        val n96 = "indent-96 "

        companion object {
            val instance = Indent()
        }
    }

    class Slate private constructor() {
        val n50 = "text-slate-50 "
        val n100 = "text-slate-100 "
        val n200 = "text-slate-200 "
        val n300 = "text-slate-300 "
        val n400 = "text-slate-400 "
        val n500 = "text-slate-500 "
        val n600 = "text-slate-600 "
        val n700 = "text-slate-700 "
        val n800 = "text-slate-800 "
        val n900 = "text-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "text-gray-50 "
        val n100 = "text-gray-100 "
        val n200 = "text-gray-200 "
        val n300 = "text-gray-300 "
        val n400 = "text-gray-400 "
        val n500 = "text-gray-500 "
        val n600 = "text-gray-600 "
        val n700 = "text-gray-700 "
        val n800 = "text-gray-800 "
        val n900 = "text-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "text-zinc-50 "
        val n100 = "text-zinc-100 "
        val n200 = "text-zinc-200 "
        val n300 = "text-zinc-300 "
        val n400 = "text-zinc-400 "
        val n500 = "text-zinc-500 "
        val n600 = "text-zinc-600 "
        val n700 = "text-zinc-700 "
        val n800 = "text-zinc-800 "
        val n900 = "text-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "text-neutral-50 "
        val n100 = "text-neutral-100 "
        val n200 = "text-neutral-200 "
        val n300 = "text-neutral-300 "
        val n400 = "text-neutral-400 "
        val n500 = "text-neutral-500 "
        val n600 = "text-neutral-600 "
        val n700 = "text-neutral-700 "
        val n800 = "text-neutral-800 "
        val n900 = "text-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "text-stone-50 "
        val n100 = "text-stone-100 "
        val n200 = "text-stone-200 "
        val n300 = "text-stone-300 "
        val n400 = "text-stone-400 "
        val n500 = "text-stone-500 "
        val n600 = "text-stone-600 "
        val n700 = "text-stone-700 "
        val n800 = "text-stone-800 "
        val n900 = "text-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "text-red-50 "
        val n100 = "text-red-100 "
        val n200 = "text-red-200 "
        val n300 = "text-red-300 "
        val n400 = "text-red-400 "
        val n500 = "text-red-500 "
        val n600 = "text-red-600 "
        val n700 = "text-red-700 "
        val n800 = "text-red-800 "
        val n900 = "text-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "text-orange-50 "
        val n100 = "text-orange-100 "
        val n200 = "text-orange-200 "
        val n300 = "text-orange-300 "
        val n400 = "text-orange-400 "
        val n500 = "text-orange-500 "
        val n600 = "text-orange-600 "
        val n700 = "text-orange-700 "
        val n800 = "text-orange-800 "
        val n900 = "text-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "text-amber-50 "
        val n100 = "text-amber-100 "
        val n200 = "text-amber-200 "
        val n300 = "text-amber-300 "
        val n400 = "text-amber-400 "
        val n500 = "text-amber-500 "
        val n600 = "text-amber-600 "
        val n700 = "text-amber-700 "
        val n800 = "text-amber-800 "
        val n900 = "text-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "text-yellow-50 "
        val n100 = "text-yellow-100 "
        val n200 = "text-yellow-200 "
        val n300 = "text-yellow-300 "
        val n400 = "text-yellow-400 "
        val n500 = "text-yellow-500 "
        val n600 = "text-yellow-600 "
        val n700 = "text-yellow-700 "
        val n800 = "text-yellow-800 "
        val n900 = "text-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "text-lime-50 "
        val n100 = "text-lime-100 "
        val n200 = "text-lime-200 "
        val n300 = "text-lime-300 "
        val n400 = "text-lime-400 "
        val n500 = "text-lime-500 "
        val n600 = "text-lime-600 "
        val n700 = "text-lime-700 "
        val n800 = "text-lime-800 "
        val n900 = "text-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "text-green-50 "
        val n100 = "text-green-100 "
        val n200 = "text-green-200 "
        val n300 = "text-green-300 "
        val n400 = "text-green-400 "
        val n500 = "text-green-500 "
        val n600 = "text-green-600 "
        val n700 = "text-green-700 "
        val n800 = "text-green-800 "
        val n900 = "text-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "text-emerald-50 "
        val n100 = "text-emerald-100 "
        val n200 = "text-emerald-200 "
        val n300 = "text-emerald-300 "
        val n400 = "text-emerald-400 "
        val n500 = "text-emerald-500 "
        val n600 = "text-emerald-600 "
        val n700 = "text-emerald-700 "
        val n800 = "text-emerald-800 "
        val n900 = "text-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "text-teal-50 "
        val n100 = "text-teal-100 "
        val n200 = "text-teal-200 "
        val n300 = "text-teal-300 "
        val n400 = "text-teal-400 "
        val n500 = "text-teal-500 "
        val n600 = "text-teal-600 "
        val n700 = "text-teal-700 "
        val n800 = "text-teal-800 "
        val n900 = "text-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "text-cyan-50 "
        val n100 = "text-cyan-100 "
        val n200 = "text-cyan-200 "
        val n300 = "text-cyan-300 "
        val n400 = "text-cyan-400 "
        val n500 = "text-cyan-500 "
        val n600 = "text-cyan-600 "
        val n700 = "text-cyan-700 "
        val n800 = "text-cyan-800 "
        val n900 = "text-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "text-sky-50 "
        val n100 = "text-sky-100 "
        val n200 = "text-sky-200 "
        val n300 = "text-sky-300 "
        val n400 = "text-sky-400 "
        val n500 = "text-sky-500 "
        val n600 = "text-sky-600 "
        val n700 = "text-sky-700 "
        val n800 = "text-sky-800 "
        val n900 = "text-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "text-blue-50 "
        val n100 = "text-blue-100 "
        val n200 = "text-blue-200 "
        val n300 = "text-blue-300 "
        val n400 = "text-blue-400 "
        val n500 = "text-blue-500 "
        val n600 = "text-blue-600 "
        val n700 = "text-blue-700 "
        val n800 = "text-blue-800 "
        val n900 = "text-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "text-indigo-50 "
        val n100 = "text-indigo-100 "
        val n200 = "text-indigo-200 "
        val n300 = "text-indigo-300 "
        val n400 = "text-indigo-400 "
        val n500 = "text-indigo-500 "
        val n600 = "text-indigo-600 "
        val n700 = "text-indigo-700 "
        val n800 = "text-indigo-800 "
        val n900 = "text-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "text-violet-50 "
        val n100 = "text-violet-100 "
        val n200 = "text-violet-200 "
        val n300 = "text-violet-300 "
        val n400 = "text-violet-400 "
        val n500 = "text-violet-500 "
        val n600 = "text-violet-600 "
        val n700 = "text-violet-700 "
        val n800 = "text-violet-800 "
        val n900 = "text-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "text-purple-50 "
        val n100 = "text-purple-100 "
        val n200 = "text-purple-200 "
        val n300 = "text-purple-300 "
        val n400 = "text-purple-400 "
        val n500 = "text-purple-500 "
        val n600 = "text-purple-600 "
        val n700 = "text-purple-700 "
        val n800 = "text-purple-800 "
        val n900 = "text-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "text-fuchsia-50 "
        val n100 = "text-fuchsia-100 "
        val n200 = "text-fuchsia-200 "
        val n300 = "text-fuchsia-300 "
        val n400 = "text-fuchsia-400 "
        val n500 = "text-fuchsia-500 "
        val n600 = "text-fuchsia-600 "
        val n700 = "text-fuchsia-700 "
        val n800 = "text-fuchsia-800 "
        val n900 = "text-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "text-pink-50 "
        val n100 = "text-pink-100 "
        val n200 = "text-pink-200 "
        val n300 = "text-pink-300 "
        val n400 = "text-pink-400 "
        val n500 = "text-pink-500 "
        val n600 = "text-pink-600 "
        val n700 = "text-pink-700 "
        val n800 = "text-pink-800 "
        val n900 = "text-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "text-rose-50 "
        val n100 = "text-rose-100 "
        val n200 = "text-rose-200 "
        val n300 = "text-rose-300 "
        val n400 = "text-rose-400 "
        val n500 = "text-rose-500 "
        val n600 = "text-rose-600 "
        val n700 = "text-rose-700 "
        val n800 = "text-rose-800 "
        val n900 = "text-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}