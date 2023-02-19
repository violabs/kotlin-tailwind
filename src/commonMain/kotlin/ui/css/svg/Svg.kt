package ui.css.svg

val svg = Svg.instance

class Svg private constructor() {

    val fill = Fill.instance
    val stroke = Stroke.instance

    companion object {
        val instance: Svg = Svg()
    }

    class Fill private constructor() {
        val none = "fill-none "
        val inherit = "fill-inherit "
        val current = "fill-current "
        val transparent = "fill-transparent "
        val black = "fill-black "
        val white = "fill-white "

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
            val instance: Fill = Fill()
        }

        class Slate private constructor() {
            val n50 = "fill-slate-50 "
            val n100 = "fill-slate-100 "
            val n200 = "fill-slate-200 "
            val n300 = "fill-slate-300 "
            val n400 = "fill-slate-400 "
            val n500 = "fill-slate-500 "
            val n600 = "fill-slate-600 "
            val n700 = "fill-slate-700 "
            val n800 = "fill-slate-800 "
            val n900 = "fill-slate-900 "

            companion object {
                val instance: Slate = Slate()
            }
        }

        class Gray private constructor() {
            val n50 = "fill-gray-50 "
            val n100 = "fill-gray-100 "
            val n200 = "fill-gray-200 "
            val n300 = "fill-gray-300 "
            val n400 = "fill-gray-400 "
            val n500 = "fill-gray-500 "
            val n600 = "fill-gray-600 "
            val n700 = "fill-gray-700 "
            val n800 = "fill-gray-800 "
            val n900 = "fill-gray-900 "

            companion object {
                val instance: Gray = Gray()
            }
        }

        class Zinc private constructor() {
            val n50 = "fill-zinc-50 "
            val n100 = "fill-zinc-100 "
            val n200 = "fill-zinc-200 "
            val n300 = "fill-zinc-300 "
            val n400 = "fill-zinc-400 "
            val n500 = "fill-zinc-500 "
            val n600 = "fill-zinc-600 "
            val n700 = "fill-zinc-700 "
            val n800 = "fill-zinc-800 "
            val n900 = "fill-zinc-900 "

            companion object {
                val instance: Zinc = Zinc()
            }
        }

        class Neutral private constructor() {
            val n50 = "fill-neutral-50 "
            val n100 = "fill-neutral-100 "
            val n200 = "fill-neutral-200 "
            val n300 = "fill-neutral-300 "
            val n400 = "fill-neutral-400 "
            val n500 = "fill-neutral-500 "
            val n600 = "fill-neutral-600 "
            val n700 = "fill-neutral-700 "
            val n800 = "fill-neutral-800 "
            val n900 = "fill-neutral-900 "

            companion object {
                val instance: Neutral = Neutral()
            }
        }

        class Stone private constructor() {
            val n50 = "fill-stone-50 "
            val n100 = "fill-stone-100 "
            val n200 = "fill-stone-200 "
            val n300 = "fill-stone-300 "
            val n400 = "fill-stone-400 "
            val n500 = "fill-stone-500 "
            val n600 = "fill-stone-600 "
            val n700 = "fill-stone-700 "
            val n800 = "fill-stone-800 "
            val n900 = "fill-stone-900 "

            companion object {
                val instance: Stone = Stone()
            }
        }

        class Red private constructor() {
            val n50 = "fill-red-50 "
            val n100 = "fill-red-100 "
            val n200 = "fill-red-200 "
            val n300 = "fill-red-300 "
            val n400 = "fill-red-400 "
            val n500 = "fill-red-500 "
            val n600 = "fill-red-600 "
            val n700 = "fill-red-700 "
            val n800 = "fill-red-800 "
            val n900 = "fill-red-900 "

            companion object {
                val instance: Red = Red()
            }
        }

        class Orange private constructor() {
            val n50 = "fill-orange-50 "
            val n100 = "fill-orange-100 "
            val n200 = "fill-orange-200 "
            val n300 = "fill-orange-300 "
            val n400 = "fill-orange-400 "
            val n500 = "fill-orange-500 "
            val n600 = "fill-orange-600 "
            val n700 = "fill-orange-700 "
            val n800 = "fill-orange-800 "
            val n900 = "fill-orange-900 "

            companion object {
                val instance: Orange = Orange()
            }
        }

        class Amber private constructor() {
            val n50 = "fill-amber-50 "
            val n100 = "fill-amber-100 "
            val n200 = "fill-amber-200 "
            val n300 = "fill-amber-300 "
            val n400 = "fill-amber-400 "
            val n500 = "fill-amber-500 "
            val n600 = "fill-amber-600 "
            val n700 = "fill-amber-700 "
            val n800 = "fill-amber-800 "
            val n900 = "fill-amber-900 "

            companion object {
                val instance: Amber = Amber()
            }
        }

        class Yellow private constructor() {
            val n50 = "fill-yellow-50 "
            val n100 = "fill-yellow-100 "
            val n200 = "fill-yellow-200 "
            val n300 = "fill-yellow-300 "
            val n400 = "fill-yellow-400 "
            val n500 = "fill-yellow-500 "
            val n600 = "fill-yellow-600 "
            val n700 = "fill-yellow-700 "
            val n800 = "fill-yellow-800 "
            val n900 = "fill-yellow-900 "

            companion object {
                val instance: Yellow = Yellow()
            }
        }

        class Lime private constructor() {
            val n50 = "fill-lime-50 "
            val n100 = "fill-lime-100 "
            val n200 = "fill-lime-200 "
            val n300 = "fill-lime-300 "
            val n400 = "fill-lime-400 "
            val n500 = "fill-lime-500 "
            val n600 = "fill-lime-600 "
            val n700 = "fill-lime-700 "
            val n800 = "fill-lime-800 "
            val n900 = "fill-lime-900 "

            companion object {
                val instance: Lime = Lime()
            }
        }

        class Green private constructor() {
            val n50 = "fill-green-50 "
            val n100 = "fill-green-100 "
            val n200 = "fill-green-200 "
            val n300 = "fill-green-300 "
            val n400 = "fill-green-400 "
            val n500 = "fill-green-500 "
            val n600 = "fill-green-600 "
            val n700 = "fill-green-700 "
            val n800 = "fill-green-800 "
            val n900 = "fill-green-900 "

            companion object {
                val instance: Green = Green()
            }
        }

        class Emerald private constructor() {
            val n50 = "fill-emerald-50 "
            val n100 = "fill-emerald-100 "
            val n200 = "fill-emerald-200 "
            val n300 = "fill-emerald-300 "
            val n400 = "fill-emerald-400 "
            val n500 = "fill-emerald-500 "
            val n600 = "fill-emerald-600 "
            val n700 = "fill-emerald-700 "
            val n800 = "fill-emerald-800 "
            val n900 = "fill-emerald-900 "

            companion object {
                val instance: Emerald = Emerald()
            }
        }

        class Teal private constructor() {
            val n50 = "fill-teal-50 "
            val n100 = "fill-teal-100 "
            val n200 = "fill-teal-200 "
            val n300 = "fill-teal-300 "
            val n400 = "fill-teal-400 "
            val n500 = "fill-teal-500 "
            val n600 = "fill-teal-600 "
            val n700 = "fill-teal-700 "
            val n800 = "fill-teal-800 "
            val n900 = "fill-teal-900 "

            companion object {
                val instance: Teal = Teal()
            }
        }

        class Cyan private constructor() {
            val n50 = "fill-cyan-50 "
            val n100 = "fill-cyan-100 "
            val n200 = "fill-cyan-200 "
            val n300 = "fill-cyan-300 "
            val n400 = "fill-cyan-400 "
            val n500 = "fill-cyan-500 "
            val n600 = "fill-cyan-600 "
            val n700 = "fill-cyan-700 "
            val n800 = "fill-cyan-800 "
            val n900 = "fill-cyan-900 "

            companion object {
                val instance: Cyan = Cyan()
            }
        }

        class Sky private constructor() {
            val n50 = "fill-sky-50 "
            val n100 = "fill-sky-100 "
            val n200 = "fill-sky-200 "
            val n300 = "fill-sky-300 "
            val n400 = "fill-sky-400 "
            val n500 = "fill-sky-500 "
            val n600 = "fill-sky-600 "
            val n700 = "fill-sky-700 "
            val n800 = "fill-sky-800 "
            val n900 = "fill-sky-900 "

            companion object {
                val instance: Sky = Sky()
            }
        }

        class Blue private constructor() {
            val n50 = "fill-blue-50 "
            val n100 = "fill-blue-100 "
            val n200 = "fill-blue-200 "
            val n300 = "fill-blue-300 "
            val n400 = "fill-blue-400 "
            val n500 = "fill-blue-500 "
            val n600 = "fill-blue-600 "
            val n700 = "fill-blue-700 "
            val n800 = "fill-blue-800 "
            val n900 = "fill-blue-900 "

            companion object {
                val instance: Blue = Blue()
            }
        }

        class Indigo private constructor() {
            val n50 = "fill-indigo-50 "
            val n100 = "fill-indigo-100 "
            val n200 = "fill-indigo-200 "
            val n300 = "fill-indigo-300 "
            val n400 = "fill-indigo-400 "
            val n500 = "fill-indigo-500 "
            val n600 = "fill-indigo-600 "
            val n700 = "fill-indigo-700 "
            val n800 = "fill-indigo-800 "
            val n900 = "fill-indigo-900 "

            companion object {
                val instance: Indigo = Indigo()
            }
        }

        class Violet private constructor() {
            val n50 = "fill-violet-50 "
            val n100 = "fill-violet-100 "
            val n200 = "fill-violet-200 "
            val n300 = "fill-violet-300 "
            val n400 = "fill-violet-400 "
            val n500 = "fill-violet-500 "
            val n600 = "fill-violet-600 "
            val n700 = "fill-violet-700 "
            val n800 = "fill-violet-800 "
            val n900 = "fill-violet-900 "

            companion object {
                val instance: Violet = Violet()
            }
        }

        class Fuchsia private constructor() {
            val n50 = "fill-fuchsia-50 "
            val n100 = "fill-fuchsia-100 "
            val n200 = "fill-fuchsia-200 "
            val n300 = "fill-fuchsia-300 "
            val n400 = "fill-fuchsia-400 "
            val n500 = "fill-fuchsia-500 "
            val n600 = "fill-fuchsia-600 "
            val n700 = "fill-fuchsia-700 "
            val n800 = "fill-fuchsia-800 "
            val n900 = "fill-fuchsia-900 "

            companion object {
                val instance: Fuchsia = Fuchsia()
            }
        }

        class Pink private constructor() {
            val n50 = "fill-pink-50 "
            val n100 = "fill-pink-100 "
            val n200 = "fill-pink-200 "
            val n300 = "fill-pink-300 "
            val n400 = "fill-pink-400 "
            val n500 = "fill-pink-500 "
            val n600 = "fill-pink-600 "
            val n700 = "fill-pink-700 "
            val n800 = "fill-pink-800 "
            val n900 = "fill-pink-900 "

            companion object {
                val instance: Pink = Pink()
            }
        }

        class Rose private constructor() {
            val n50 = "fill-rose-50 "
            val n100 = "fill-rose-100 "
            val n200 = "fill-rose-200 "
            val n300 = "fill-rose-300 "
            val n400 = "fill-rose-400 "
            val n500 = "fill-rose-500 "
            val n600 = "fill-rose-600 "
            val n700 = "fill-rose-700 "
            val n800 = "fill-rose-800 "
            val n900 = "fill-rose-900 "

            companion object {
                val instance: Rose = Rose()
            }
        }
    }

    class Stroke private constructor() {
        val none = "stroke-none "
        val inherit = "stroke-inherit "
        val current = "stroke-current "
        val transparent = "stroke-transparent "
        val black = "stroke-black "
        val white = "stroke-white "
        val n0 = "stroke-0 "
        val n1 = "stroke-1 "
        val n2 = "stroke-2 "

        // COLORS
        val slate = instance
        val gray = instance
        val zinc = instance
        val neutral = instance
        val stone = instance
        val red = instance
        val orange = instance
        val amber = instance
        val yellow = instance
        val lime = instance
        val green = instance
        val emerald = instance
        val teal = instance
        val cyan = instance
        val sky = instance
        val blue = instance
        val indigo = instance
        val violet = instance
        val fuchsia = instance
        val pink = instance
        val rose = instance

        companion object {
            val instance: Stroke = Stroke()
        }

        class Slate private constructor() {
            val n50 = "stroke-slate-50 "
            val n100 = "stroke-slate-100 "
            val n200 = "stroke-slate-200 "
            val n300 = "stroke-slate-300 "
            val n400 = "stroke-slate-400 "
            val n500 = "stroke-slate-500 "
            val n600 = "stroke-slate-600 "
            val n700 = "stroke-slate-700 "
            val n800 = "stroke-slate-800 "
            val n900 = "stroke-slate-900 "

            companion object {
                val instance: Slate = Slate()
            }
        }

        class Gray private constructor() {
            val n50 = "stroke-gray-50 "
            val n100 = "stroke-gray-100 "
            val n200 = "stroke-gray-200 "
            val n300 = "stroke-gray-300 "
            val n400 = "stroke-gray-400 "
            val n500 = "stroke-gray-500 "
            val n600 = "stroke-gray-600 "
            val n700 = "stroke-gray-700 "
            val n800 = "stroke-gray-800 "
            val n900 = "stroke-gray-900 "

            companion object {
                val instance: Gray = Gray()
            }
        }

        class Zinc private constructor() {
            val n50 = "stroke-zinc-50 "
            val n100 = "stroke-zinc-100 "
            val n200 = "stroke-zinc-200 "
            val n300 = "stroke-zinc-300 "
            val n400 = "stroke-zinc-400 "
            val n500 = "stroke-zinc-500 "
            val n600 = "stroke-zinc-600 "
            val n700 = "stroke-zinc-700 "
            val n800 = "stroke-zinc-800 "
            val n900 = "stroke-zinc-900 "

            companion object {
                val instance: Zinc = Zinc()
            }
        }

        class Neutral private constructor() {
            val n50 = "stroke-neutral-50 "
            val n100 = "stroke-neutral-100 "
            val n200 = "stroke-neutral-200 "
            val n300 = "stroke-neutral-300 "
            val n400 = "stroke-neutral-400 "
            val n500 = "stroke-neutral-500 "
            val n600 = "stroke-neutral-600 "
            val n700 = "stroke-neutral-700 "
            val n800 = "stroke-neutral-800 "
            val n900 = "stroke-neutral-900 "

            companion object {
                val instance: Neutral = Neutral()
            }
        }

        class Stone private constructor() {
            val n50 = "stroke-stone-50 "
            val n100 = "stroke-stone-100 "
            val n200 = "stroke-stone-200 "
            val n300 = "stroke-stone-300 "
            val n400 = "stroke-stone-400 "
            val n500 = "stroke-stone-500 "
            val n600 = "stroke-stone-600 "
            val n700 = "stroke-stone-700 "
            val n800 = "stroke-stone-800 "
            val n900 = "stroke-stone-900 "

            companion object {
                val instance: Stone = Stone()
            }
        }

        class Red private constructor() {
            val n50 = "stroke-red-50 "
            val n100 = "stroke-red-100 "
            val n200 = "stroke-red-200 "
            val n300 = "stroke-red-300 "
            val n400 = "stroke-red-400 "
            val n500 = "stroke-red-500 "
            val n600 = "stroke-red-600 "
            val n700 = "stroke-red-700 "
            val n800 = "stroke-red-800 "
            val n900 = "stroke-red-900 "

            companion object {
                val instance: Red = Red()
            }
        }

        class Orange private constructor() {
            val n50 = "stroke-orange-50 "
            val n100 = "stroke-orange-100 "
            val n200 = "stroke-orange-200 "
            val n300 = "stroke-orange-300 "
            val n400 = "stroke-orange-400 "
            val n500 = "stroke-orange-500 "
            val n600 = "stroke-orange-600 "
            val n700 = "stroke-orange-700 "
            val n800 = "stroke-orange-800 "
            val n900 = "stroke-orange-900 "

            companion object {
                val instance: Orange = Orange()
            }
        }

        class Amber private constructor() {
            val n50 = "stroke-amber-50 "
            val n100 = "stroke-amber-100 "
            val n200 = "stroke-amber-200 "
            val n300 = "stroke-amber-300 "
            val n400 = "stroke-amber-400 "
            val n500 = "stroke-amber-500 "
            val n600 = "stroke-amber-600 "
            val n700 = "stroke-amber-700 "
            val n800 = "stroke-amber-800 "
            val n900 = "stroke-amber-900 "

            companion object {
                val instance: Amber = Amber()
            }
        }

        class Yellow private constructor() {
            val n50 = "stroke-yellow-50 "
            val n100 = "stroke-yellow-100 "
            val n200 = "stroke-yellow-200 "
            val n300 = "stroke-yellow-300 "
            val n400 = "stroke-yellow-400 "
            val n500 = "stroke-yellow-500 "
            val n600 = "stroke-yellow-600 "
            val n700 = "stroke-yellow-700 "
            val n800 = "stroke-yellow-800 "
            val n900 = "stroke-yellow-900 "

            companion object {
                val instance: Yellow = Yellow()
            }
        }

        class Lime private constructor() {
            val n50 = "stroke-lime-50 "
            val n100 = "stroke-lime-100 "
            val n200 = "stroke-lime-200 "
            val n300 = "stroke-lime-300 "
            val n400 = "stroke-lime-400 "
            val n500 = "stroke-lime-500 "
            val n600 = "stroke-lime-600 "
            val n700 = "stroke-lime-700 "
            val n800 = "stroke-lime-800 "
            val n900 = "stroke-lime-900 "

            companion object {
                val instance: Lime = Lime()
            }
        }

        class Green private constructor() {
            val n50 = "stroke-green-50 "
            val n100 = "stroke-green-100 "
            val n200 = "stroke-green-200 "
            val n300 = "stroke-green-300 "
            val n400 = "stroke-green-400 "
            val n500 = "stroke-green-500 "
            val n600 = "stroke-green-600 "
            val n700 = "stroke-green-700 "
            val n800 = "stroke-green-800 "
            val n900 = "stroke-green-900 "

            companion object {
                val instance: Green = Green()
            }
        }

        class Emerald private constructor() {
            val n50 = "stroke-emerald-50 "
            val n100 = "stroke-emerald-100 "
            val n200 = "stroke-emerald-200 "
            val n300 = "stroke-emerald-300 "
            val n400 = "stroke-emerald-400 "
            val n500 = "stroke-emerald-500 "
            val n600 = "stroke-emerald-600 "
            val n700 = "stroke-emerald-700 "
            val n800 = "stroke-emerald-800 "
            val n900 = "stroke-emerald-900 "

            companion object {
                val instance: Emerald = Emerald()
            }
        }

        class Teal private constructor() {
            val n50 = "stroke-teal-50 "
            val n100 = "stroke-teal-100 "
            val n200 = "stroke-teal-200 "
            val n300 = "stroke-teal-300 "
            val n400 = "stroke-teal-400 "
            val n500 = "stroke-teal-500 "
            val n600 = "stroke-teal-600 "
            val n700 = "stroke-teal-700 "
            val n800 = "stroke-teal-800 "
            val n900 = "stroke-teal-900 "

            companion object {
                val instance: Teal = Teal()
            }
        }

        class Cyan private constructor() {
            val n50 = "stroke-cyan-50 "
            val n100 = "stroke-cyan-100 "
            val n200 = "stroke-cyan-200 "
            val n300 = "stroke-cyan-300 "
            val n400 = "stroke-cyan-400 "
            val n500 = "stroke-cyan-500 "
            val n600 = "stroke-cyan-600 "
            val n700 = "stroke-cyan-700 "
            val n800 = "stroke-cyan-800 "
            val n900 = "stroke-cyan-900 "

            companion object {
                val instance: Cyan = Cyan()
            }
        }

        class Sky private constructor() {
            val n50 = "stroke-sky-50 "
            val n100 = "stroke-sky-100 "
            val n200 = "stroke-sky-200 "
            val n300 = "stroke-sky-300 "
            val n400 = "stroke-sky-400 "
            val n500 = "stroke-sky-500 "
            val n600 = "stroke-sky-600 "
            val n700 = "stroke-sky-700 "
            val n800 = "stroke-sky-800 "
            val n900 = "stroke-sky-900 "

            companion object {
                val instance: Sky = Sky()
            }
        }

        class Blue private constructor() {
            val n50 = "stroke-blue-50 "
            val n100 = "stroke-blue-100 "
            val n200 = "stroke-blue-200 "
            val n300 = "stroke-blue-300 "
            val n400 = "stroke-blue-400 "
            val n500 = "stroke-blue-500 "
            val n600 = "stroke-blue-600 "
            val n700 = "stroke-blue-700 "
            val n800 = "stroke-blue-800 "
            val n900 = "stroke-blue-900 "

            companion object {
                val instance: Blue = Blue()
            }
        }

        class Indigo private constructor() {
            val n50 = "stroke-indigo-50 "
            val n100 = "stroke-indigo-100 "
            val n200 = "stroke-indigo-200 "
            val n300 = "stroke-indigo-300 "
            val n400 = "stroke-indigo-400 "
            val n500 = "stroke-indigo-500 "
            val n600 = "stroke-indigo-600 "
            val n700 = "stroke-indigo-700 "
            val n800 = "stroke-indigo-800 "
            val n900 = "stroke-indigo-900 "

            companion object {
                val instance: Indigo = Indigo()
            }
        }

        class Violet private constructor() {
            val n50 = "stroke-violet-50 "
            val n100 = "stroke-violet-100 "
            val n200 = "stroke-violet-200 "
            val n300 = "stroke-violet-300 "
            val n400 = "stroke-violet-400 "
            val n500 = "stroke-violet-500 "
            val n600 = "stroke-violet-600 "
            val n700 = "stroke-violet-700 "
            val n800 = "stroke-violet-800 "
            val n900 = "stroke-violet-900 "

            companion object {
                val instance: Violet = Violet()
            }
        }

        class Fuchsia private constructor() {
            val n50 = "stroke-fuchsia-50 "
            val n100 = "stroke-fuchsia-100 "
            val n200 = "stroke-fuchsia-200 "
            val n300 = "stroke-fuchsia-300 "
            val n400 = "stroke-fuchsia-400 "
            val n500 = "stroke-fuchsia-500 "
            val n600 = "stroke-fuchsia-600 "
            val n700 = "stroke-fuchsia-700 "
            val n800 = "stroke-fuchsia-800 "
            val n900 = "stroke-fuchsia-900 "

            companion object {
                val instance: Fuchsia = Fuchsia()
            }
        }

        class Pink private constructor() {
            val n50 = "stroke-pink-50 "
            val n100 = "stroke-pink-100 "
            val n200 = "stroke-pink-200 "
            val n300 = "stroke-pink-300 "
            val n400 = "stroke-pink-400 "
            val n500 = "stroke-pink-500 "
            val n600 = "stroke-pink-600 "
            val n700 = "stroke-pink-700 "
            val n800 = "stroke-pink-800 "
            val n900 = "stroke-pink-900 "

            companion object {
                val instance: Pink = Pink()
            }
        }

        class Rose private constructor() {
            val n50 = "stroke-rose-50 "
            val n100 = "stroke-rose-100 "
            val n200 = "stroke-rose-200 "
            val n300 = "stroke-rose-300 "
            val n400 = "stroke-rose-400 "
            val n500 = "stroke-rose-500 "
            val n600 = "stroke-rose-600 "
            val n700 = "stroke-rose-700 "
            val n800 = "stroke-rose-800 "
            val n900 = "stroke-rose-900 "

            companion object {
                val instance: Rose = Rose()
            }
        }
    }

}