package ui.css.borders

val ring = Ring.instance

class Ring private constructor() {
    val n0 = "ring-0 "
    val n1 = "ring-1 "
    val n2 = "ring-2 "
    val n4 = "ring-4 "
    val n8 = "ring-8 "
    val it = "ring "
    val inset = "ring-inset "

    // COLORS
    val inherit = "ring-inherit "
    val current = "ring-current "
    val transparent = "ring-transparent "
    val black = "ring-black "
    val white = "ring-white "

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
        val instance: Ring = Ring()
    }

    class Offset private constructor() {
        val n0 = "ring-offset-0 "
        val n1 = "ring-offset-1 "
        val n2 = "ring-offset-2 "
        val n4 = "ring-offset-4 "
        val n8 = "ring-offset-8 "

        // COLORS
        val inherit = "ring-offset-inherit "
        val current = "ring-offset-current "
        val transparent = "ring-offset-transparent "
        val black = "ring-offset-black "
        val white = "ring-offset-white "

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
            val instance = Offset()
        }

        class Slate private constructor() {
            val n50 = "ring-offset-slate-50 "
            val n100 = "ring-offset-slate-100 "
            val n200 = "ring-offset-slate-200 "
            val n300 = "ring-offset-slate-300 "
            val n400 = "ring-offset-slate-400 "
            val n500 = "ring-offset-slate-500 "
            val n600 = "ring-offset-slate-600 "
            val n700 = "ring-offset-slate-700 "
            val n800 = "ring-offset-slate-800 "
            val n900 = "ring-offset-slate-900 "

            companion object {
                val instance: Slate = Slate()
            }
        }

        class Gray private constructor() {
            val n50 = "ring-offset-gray-50 "
            val n100 = "ring-offset-gray-100 "
            val n200 = "ring-offset-gray-200 "
            val n300 = "ring-offset-gray-300 "
            val n400 = "ring-offset-gray-400 "
            val n500 = "ring-offset-gray-500 "
            val n600 = "ring-offset-gray-600 "
            val n700 = "ring-offset-gray-700 "
            val n800 = "ring-offset-gray-800 "
            val n900 = "ring-offset-gray-900 "

            companion object {
                val instance: Gray = Gray()
            }
        }

        class Zinc private constructor() {
            val n50 = "ring-offset-zinc-50 "
            val n100 = "ring-offset-zinc-100 "
            val n200 = "ring-offset-zinc-200 "
            val n300 = "ring-offset-zinc-300 "
            val n400 = "ring-offset-zinc-400 "
            val n500 = "ring-offset-zinc-500 "
            val n600 = "ring-offset-zinc-600 "
            val n700 = "ring-offset-zinc-700 "
            val n800 = "ring-offset-zinc-800 "
            val n900 = "ring-offset-zinc-900 "

            companion object {
                val instance: Zinc = Zinc()
            }
        }

        class Neutral private constructor() {
            val n50 = "ring-offset-neutral-50 "
            val n100 = "ring-offset-neutral-100 "
            val n200 = "ring-offset-neutral-200 "
            val n300 = "ring-offset-neutral-300 "
            val n400 = "ring-offset-neutral-400 "
            val n500 = "ring-offset-neutral-500 "
            val n600 = "ring-offset-neutral-600 "
            val n700 = "ring-offset-neutral-700 "
            val n800 = "ring-offset-neutral-800 "
            val n900 = "ring-offset-neutral-900 "

            companion object {
                val instance: Neutral = Neutral()
            }
        }

        class Stone private constructor() {
            val n50 = "ring-offset-stone-50 "
            val n100 = "ring-offset-stone-100 "
            val n200 = "ring-offset-stone-200 "
            val n300 = "ring-offset-stone-300 "
            val n400 = "ring-offset-stone-400 "
            val n500 = "ring-offset-stone-500 "
            val n600 = "ring-offset-stone-600 "
            val n700 = "ring-offset-stone-700 "
            val n800 = "ring-offset-stone-800 "
            val n900 = "ring-offset-stone-900 "

            companion object {
                val instance: Stone = Stone()
            }
        }

        class Red private constructor() {
            val n50 = "ring-offset-red-50 "
            val n100 = "ring-offset-red-100 "
            val n200 = "ring-offset-red-200 "
            val n300 = "ring-offset-red-300 "
            val n400 = "ring-offset-red-400 "
            val n500 = "ring-offset-red-500 "
            val n600 = "ring-offset-red-600 "
            val n700 = "ring-offset-red-700 "
            val n800 = "ring-offset-red-800 "
            val n900 = "ring-offset-red-900 "

            companion object {
                val instance: Red = Red()
            }
        }

        class Orange private constructor() {
            val n50 = "ring-offset-orange-50 "
            val n100 = "ring-offset-orange-100 "
            val n200 = "ring-offset-orange-200 "
            val n300 = "ring-offset-orange-300 "
            val n400 = "ring-offset-orange-400 "
            val n500 = "ring-offset-orange-500 "
            val n600 = "ring-offset-orange-600 "
            val n700 = "ring-offset-orange-700 "
            val n800 = "ring-offset-orange-800 "
            val n900 = "ring-offset-orange-900 "

            companion object {
                val instance: Orange = Orange()
            }
        }

        class Amber private constructor() {
            val n50 = "ring-offset-amber-50 "
            val n100 = "ring-offset-amber-100 "
            val n200 = "ring-offset-amber-200 "
            val n300 = "ring-offset-amber-300 "
            val n400 = "ring-offset-amber-400 "
            val n500 = "ring-offset-amber-500 "
            val n600 = "ring-offset-amber-600 "
            val n700 = "ring-offset-amber-700 "
            val n800 = "ring-offset-amber-800 "
            val n900 = "ring-offset-amber-900 "

            companion object {
                val instance: Amber = Amber()
            }
        }

        class Yellow private constructor() {
            val n50 = "ring-offset-yellow-50 "
            val n100 = "ring-offset-yellow-100 "
            val n200 = "ring-offset-yellow-200 "
            val n300 = "ring-offset-yellow-300 "
            val n400 = "ring-offset-yellow-400 "
            val n500 = "ring-offset-yellow-500 "
            val n600 = "ring-offset-yellow-600 "
            val n700 = "ring-offset-yellow-700 "
            val n800 = "ring-offset-yellow-800 "
            val n900 = "ring-offset-yellow-900 "

            companion object {
                val instance: Yellow = Yellow()
            }
        }

        class Lime private constructor() {
            val n50 = "ring-offset-lime-50 "
            val n100 = "ring-offset-lime-100 "
            val n200 = "ring-offset-lime-200 "
            val n300 = "ring-offset-lime-300 "
            val n400 = "ring-offset-lime-400 "
            val n500 = "ring-offset-lime-500 "
            val n600 = "ring-offset-lime-600 "
            val n700 = "ring-offset-lime-700 "
            val n800 = "ring-offset-lime-800 "
            val n900 = "ring-offset-lime-900 "

            companion object {
                val instance: Lime = Lime()
            }
        }

        class Green private constructor() {
            val n50 = "ring-offset-green-50 "
            val n100 = "ring-offset-green-100 "
            val n200 = "ring-offset-green-200 "
            val n300 = "ring-offset-green-300 "
            val n400 = "ring-offset-green-400 "
            val n500 = "ring-offset-green-500 "
            val n600 = "ring-offset-green-600 "
            val n700 = "ring-offset-green-700 "
            val n800 = "ring-offset-green-800 "
            val n900 = "ring-offset-green-900 "

            companion object {
                val instance: Green = Green()
            }
        }

        class Emerald private constructor() {
            val n50 = "ring-offset-emerald-50 "
            val n100 = "ring-offset-emerald-100 "
            val n200 = "ring-offset-emerald-200 "
            val n300 = "ring-offset-emerald-300 "
            val n400 = "ring-offset-emerald-400 "
            val n500 = "ring-offset-emerald-500 "
            val n600 = "ring-offset-emerald-600 "
            val n700 = "ring-offset-emerald-700 "
            val n800 = "ring-offset-emerald-800 "
            val n900 = "ring-offset-emerald-900 "

            companion object {
                val instance: Emerald = Emerald()
            }
        }

        class Teal private constructor() {
            val n50 = "ring-offset-teal-50 "
            val n100 = "ring-offset-teal-100 "
            val n200 = "ring-offset-teal-200 "
            val n300 = "ring-offset-teal-300 "
            val n400 = "ring-offset-teal-400 "
            val n500 = "ring-offset-teal-500 "
            val n600 = "ring-offset-teal-600 "
            val n700 = "ring-offset-teal-700 "
            val n800 = "ring-offset-teal-800 "
            val n900 = "ring-offset-teal-900 "

            companion object {
                val instance: Teal = Teal()
            }
        }

        class Cyan private constructor() {
            val n50 = "ring-offset-cyan-50 "
            val n100 = "ring-offset-cyan-100 "
            val n200 = "ring-offset-cyan-200 "
            val n300 = "ring-offset-cyan-300 "
            val n400 = "ring-offset-cyan-400 "
            val n500 = "ring-offset-cyan-500 "
            val n600 = "ring-offset-cyan-600 "
            val n700 = "ring-offset-cyan-700 "
            val n800 = "ring-offset-cyan-800 "
            val n900 = "ring-offset-cyan-900 "

            companion object {
                val instance: Cyan = Cyan()
            }
        }

        class Sky private constructor() {
            val n50 = "ring-offset-sky-50 "
            val n100 = "ring-offset-sky-100 "
            val n200 = "ring-offset-sky-200 "
            val n300 = "ring-offset-sky-300 "
            val n400 = "ring-offset-sky-400 "
            val n500 = "ring-offset-sky-500 "
            val n600 = "ring-offset-sky-600 "
            val n700 = "ring-offset-sky-700 "
            val n800 = "ring-offset-sky-800 "
            val n900 = "ring-offset-sky-900 "

            companion object {
                val instance: Sky = Sky()
            }
        }

        class Blue private constructor() {
            val n50 = "ring-offset-blue-50 "
            val n100 = "ring-offset-blue-100 "
            val n200 = "ring-offset-blue-200 "
            val n300 = "ring-offset-blue-300 "
            val n400 = "ring-offset-blue-400 "
            val n500 = "ring-offset-blue-500 "
            val n600 = "ring-offset-blue-600 "
            val n700 = "ring-offset-blue-700 "
            val n800 = "ring-offset-blue-800 "
            val n900 = "ring-offset-blue-900 "

            companion object {
                val instance: Blue = Blue()
            }
        }

        class Indigo private constructor() {
            val n50 = "ring-offset-indigo-50 "
            val n100 = "ring-offset-indigo-100 "
            val n200 = "ring-offset-indigo-200 "
            val n300 = "ring-offset-indigo-300 "
            val n400 = "ring-offset-indigo-400 "
            val n500 = "ring-offset-indigo-500 "
            val n600 = "ring-offset-indigo-600 "
            val n700 = "ring-offset-indigo-700 "
            val n800 = "ring-offset-indigo-800 "
            val n900 = "ring-offset-indigo-900 "

            companion object {
                val instance: Indigo = Indigo()
            }
        }

        class Violet private constructor() {
            val n50 = "ring-offset-violet-50 "
            val n100 = "ring-offset-violet-100 "
            val n200 = "ring-offset-violet-200 "
            val n300 = "ring-offset-violet-300 "
            val n400 = "ring-offset-violet-400 "
            val n500 = "ring-offset-violet-500 "
            val n600 = "ring-offset-violet-600 "
            val n700 = "ring-offset-violet-700 "
            val n800 = "ring-offset-violet-800 "
            val n900 = "ring-offset-violet-900 "

            companion object {
                val instance: Violet = Violet()
            }
        }

        class Purple private constructor() {
            val n50 = "ring-offset-purple-50 "
            val n100 = "ring-offset-purple-100 "
            val n200 = "ring-offset-purple-200 "
            val n300 = "ring-offset-purple-300 "
            val n400 = "ring-offset-purple-400 "
            val n500 = "ring-offset-purple-500 "
            val n600 = "ring-offset-purple-600 "
            val n700 = "ring-offset-purple-700 "
            val n800 = "ring-offset-purple-800 "
            val n900 = "ring-offset-purple-900 "

            companion object {
                val instance: Purple = Purple()
            }
        }

        class Fuchsia private constructor() {
            val n50 = "ring-offset-fuchsia-50 "
            val n100 = "ring-offset-fuchsia-100 "
            val n200 = "ring-offset-fuchsia-200 "
            val n300 = "ring-offset-fuchsia-300 "
            val n400 = "ring-offset-fuchsia-400 "
            val n500 = "ring-offset-fuchsia-500 "
            val n600 = "ring-offset-fuchsia-600 "
            val n700 = "ring-offset-fuchsia-700 "
            val n800 = "ring-offset-fuchsia-800 "
            val n900 = "ring-offset-fuchsia-900 "

            companion object {
                val instance: Fuchsia = Fuchsia()
            }
        }

        class Pink private constructor() {
            val n50 = "ring-offset-pink-50 "
            val n100 = "ring-offset-pink-100 "
            val n200 = "ring-offset-pink-200 "
            val n300 = "ring-offset-pink-300 "
            val n400 = "ring-offset-pink-400 "
            val n500 = "ring-offset-pink-500 "
            val n600 = "ring-offset-pink-600 "
            val n700 = "ring-offset-pink-700 "
            val n800 = "ring-offset-pink-800 "
            val n900 = "ring-offset-pink-900 "

            companion object {
                val instance: Pink = Pink()
            }
        }

        class Rose private constructor() {
            val n50 = "ring-offset-rose-50 "
            val n100 = "ring-offset-rose-100 "
            val n200 = "ring-offset-rose-200 "
            val n300 = "ring-offset-rose-300 "
            val n400 = "ring-offset-rose-400 "
            val n500 = "ring-offset-rose-500 "
            val n600 = "ring-offset-rose-600 "
            val n700 = "ring-offset-rose-700 "
            val n800 = "ring-offset-rose-800 "
            val n900 = "ring-offset-rose-900 "

            companion object {
                val instance: Rose = Rose()
            }
        }
    }

    class Slate private constructor() {
        val n50 = "ring-slate-50 "
        val n100 = "ring-slate-100 "
        val n200 = "ring-slate-200 "
        val n300 = "ring-slate-300 "
        val n400 = "ring-slate-400 "
        val n500 = "ring-slate-500 "
        val n600 = "ring-slate-600 "
        val n700 = "ring-slate-700 "
        val n800 = "ring-slate-800 "
        val n900 = "ring-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "ring-gray-50 "
        val n100 = "ring-gray-100 "
        val n200 = "ring-gray-200 "
        val n300 = "ring-gray-300 "
        val n400 = "ring-gray-400 "
        val n500 = "ring-gray-500 "
        val n600 = "ring-gray-600 "
        val n700 = "ring-gray-700 "
        val n800 = "ring-gray-800 "
        val n900 = "ring-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "ring-zinc-50 "
        val n100 = "ring-zinc-100 "
        val n200 = "ring-zinc-200 "
        val n300 = "ring-zinc-300 "
        val n400 = "ring-zinc-400 "
        val n500 = "ring-zinc-500 "
        val n600 = "ring-zinc-600 "
        val n700 = "ring-zinc-700 "
        val n800 = "ring-zinc-800 "
        val n900 = "ring-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "ring-neutral-50 "
        val n100 = "ring-neutral-100 "
        val n200 = "ring-neutral-200 "
        val n300 = "ring-neutral-300 "
        val n400 = "ring-neutral-400 "
        val n500 = "ring-neutral-500 "
        val n600 = "ring-neutral-600 "
        val n700 = "ring-neutral-700 "
        val n800 = "ring-neutral-800 "
        val n900 = "ring-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "ring-stone-50 "
        val n100 = "ring-stone-100 "
        val n200 = "ring-stone-200 "
        val n300 = "ring-stone-300 "
        val n400 = "ring-stone-400 "
        val n500 = "ring-stone-500 "
        val n600 = "ring-stone-600 "
        val n700 = "ring-stone-700 "
        val n800 = "ring-stone-800 "
        val n900 = "ring-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "ring-red-50 "
        val n100 = "ring-red-100 "
        val n200 = "ring-red-200 "
        val n300 = "ring-red-300 "
        val n400 = "ring-red-400 "
        val n500 = "ring-red-500 "
        val n600 = "ring-red-600 "
        val n700 = "ring-red-700 "
        val n800 = "ring-red-800 "
        val n900 = "ring-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "ring-orange-50 "
        val n100 = "ring-orange-100 "
        val n200 = "ring-orange-200 "
        val n300 = "ring-orange-300 "
        val n400 = "ring-orange-400 "
        val n500 = "ring-orange-500 "
        val n600 = "ring-orange-600 "
        val n700 = "ring-orange-700 "
        val n800 = "ring-orange-800 "
        val n900 = "ring-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "ring-amber-50 "
        val n100 = "ring-amber-100 "
        val n200 = "ring-amber-200 "
        val n300 = "ring-amber-300 "
        val n400 = "ring-amber-400 "
        val n500 = "ring-amber-500 "
        val n600 = "ring-amber-600 "
        val n700 = "ring-amber-700 "
        val n800 = "ring-amber-800 "
        val n900 = "ring-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "ring-yellow-50 "
        val n100 = "ring-yellow-100 "
        val n200 = "ring-yellow-200 "
        val n300 = "ring-yellow-300 "
        val n400 = "ring-yellow-400 "
        val n500 = "ring-yellow-500 "
        val n600 = "ring-yellow-600 "
        val n700 = "ring-yellow-700 "
        val n800 = "ring-yellow-800 "
        val n900 = "ring-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "ring-lime-50 "
        val n100 = "ring-lime-100 "
        val n200 = "ring-lime-200 "
        val n300 = "ring-lime-300 "
        val n400 = "ring-lime-400 "
        val n500 = "ring-lime-500 "
        val n600 = "ring-lime-600 "
        val n700 = "ring-lime-700 "
        val n800 = "ring-lime-800 "
        val n900 = "ring-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "ring-green-50 "
        val n100 = "ring-green-100 "
        val n200 = "ring-green-200 "
        val n300 = "ring-green-300 "
        val n400 = "ring-green-400 "
        val n500 = "ring-green-500 "
        val n600 = "ring-green-600 "
        val n700 = "ring-green-700 "
        val n800 = "ring-green-800 "
        val n900 = "ring-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "ring-emerald-50 "
        val n100 = "ring-emerald-100 "
        val n200 = "ring-emerald-200 "
        val n300 = "ring-emerald-300 "
        val n400 = "ring-emerald-400 "
        val n500 = "ring-emerald-500 "
        val n600 = "ring-emerald-600 "
        val n700 = "ring-emerald-700 "
        val n800 = "ring-emerald-800 "
        val n900 = "ring-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "ring-teal-50 "
        val n100 = "ring-teal-100 "
        val n200 = "ring-teal-200 "
        val n300 = "ring-teal-300 "
        val n400 = "ring-teal-400 "
        val n500 = "ring-teal-500 "
        val n600 = "ring-teal-600 "
        val n700 = "ring-teal-700 "
        val n800 = "ring-teal-800 "
        val n900 = "ring-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "ring-cyan-50 "
        val n100 = "ring-cyan-100 "
        val n200 = "ring-cyan-200 "
        val n300 = "ring-cyan-300 "
        val n400 = "ring-cyan-400 "
        val n500 = "ring-cyan-500 "
        val n600 = "ring-cyan-600 "
        val n700 = "ring-cyan-700 "
        val n800 = "ring-cyan-800 "
        val n900 = "ring-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "ring-sky-50 "
        val n100 = "ring-sky-100 "
        val n200 = "ring-sky-200 "
        val n300 = "ring-sky-300 "
        val n400 = "ring-sky-400 "
        val n500 = "ring-sky-500 "
        val n600 = "ring-sky-600 "
        val n700 = "ring-sky-700 "
        val n800 = "ring-sky-800 "
        val n900 = "ring-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "ring-blue-50 "
        val n100 = "ring-blue-100 "
        val n200 = "ring-blue-200 "
        val n300 = "ring-blue-300 "
        val n400 = "ring-blue-400 "
        val n500 = "ring-blue-500 "
        val n600 = "ring-blue-600 "
        val n700 = "ring-blue-700 "
        val n800 = "ring-blue-800 "
        val n900 = "ring-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "ring-indigo-50 "
        val n100 = "ring-indigo-100 "
        val n200 = "ring-indigo-200 "
        val n300 = "ring-indigo-300 "
        val n400 = "ring-indigo-400 "
        val n500 = "ring-indigo-500 "
        val n600 = "ring-indigo-600 "
        val n700 = "ring-indigo-700 "
        val n800 = "ring-indigo-800 "
        val n900 = "ring-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "ring-violet-50 "
        val n100 = "ring-violet-100 "
        val n200 = "ring-violet-200 "
        val n300 = "ring-violet-300 "
        val n400 = "ring-violet-400 "
        val n500 = "ring-violet-500 "
        val n600 = "ring-violet-600 "
        val n700 = "ring-violet-700 "
        val n800 = "ring-violet-800 "
        val n900 = "ring-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "ring-purple-50 "
        val n100 = "ring-purple-100 "
        val n200 = "ring-purple-200 "
        val n300 = "ring-purple-300 "
        val n400 = "ring-purple-400 "
        val n500 = "ring-purple-500 "
        val n600 = "ring-purple-600 "
        val n700 = "ring-purple-700 "
        val n800 = "ring-purple-800 "
        val n900 = "ring-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "ring-fuchsia-50 "
        val n100 = "ring-fuchsia-100 "
        val n200 = "ring-fuchsia-200 "
        val n300 = "ring-fuchsia-300 "
        val n400 = "ring-fuchsia-400 "
        val n500 = "ring-fuchsia-500 "
        val n600 = "ring-fuchsia-600 "
        val n700 = "ring-fuchsia-700 "
        val n800 = "ring-fuchsia-800 "
        val n900 = "ring-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "ring-pink-50 "
        val n100 = "ring-pink-100 "
        val n200 = "ring-pink-200 "
        val n300 = "ring-pink-300 "
        val n400 = "ring-pink-400 "
        val n500 = "ring-pink-500 "
        val n600 = "ring-pink-600 "
        val n700 = "ring-pink-700 "
        val n800 = "ring-pink-800 "
        val n900 = "ring-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "ring-rose-50 "
        val n100 = "ring-rose-100 "
        val n200 = "ring-rose-200 "
        val n300 = "ring-rose-300 "
        val n400 = "ring-rose-400 "
        val n500 = "ring-rose-500 "
        val n600 = "ring-rose-600 "
        val n700 = "ring-rose-700 "
        val n800 = "ring-rose-800 "
        val n900 = "ring-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }
}