package ui.css.backgrounds

val bg = Bg.instance

class Bg private constructor() {
    val blend = Blend.instance
    val clip = Clip.instance
    val origin = Origin.instance

    val none = "bg-none "

    // ATTACHMENT
    val fixed = "bg-fixed "
    val local = "bg-local "
    val scroll = "bg-scroll "

    // POSITION
    val bottom = "bg-bottom "
    val center = "bg-center "
    val left = "bg-left "
    val leftBottom = "bg-left-bottom "
    val right = "bg-right "
    val rightBottom = "bg-right-bottom "
    val top = "bg-top "

    // SIZE
    val auto = "bg-auto "
    val cover = "bg-cover "
    val contain = "bg-contain "

    // REPEAT
    val repeat = Repeat.instance
    val noRepeat = "bg-no-repeat "

    // COLORS
    val inherit = "bg-inherit "
    val current = "bg-current "
    val transparent = "bg-transparent "
    val black = "bg-black "
    val white = "bg-white "

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

    // GRADIENT
    val gradient = Gradient.instance

    class Repeat private constructor() {
        val it = "bg-repeat "
        val x = "bg-repeat-x "
        val y = "bg-repeat-y "
        val round = "br-repeat-round "
        val space = "br-repeat-space "

        override fun toString(): String = it
        companion object {
            val instance = Repeat()
        }
    }

    class Origin private constructor() {
        val border = "bg-origin-border "
        val padding = "bg-origin-padding "
        val content = "bg-origin-content "

        companion object {
            val instance = Origin()
        }
    }

    class Blend private constructor() {
        val normal = "bg-blend-normal "
        val multiply = "bg-blend-multiply "
        val screen = "bg-blend-screen "
        val overlay = "bg-blend-overlay "
        val darken = "bg-blend-darken "
        val lighten = "bg-blend-lighten "
        val colorDodge = "bg-blend-color-dodge "
        val colorBurn = "bg-blend-color-burn "
        val hardLight = "bg-blend-hard-light "
        val softLight = "bg-blend-soft-light "
        val difference = "bg-blend-difference "
        val exclusion = "bg-blend-exclusion "
        val hue = "bg-blend-hue "
        val saturation = "bg-blend-saturation "
        val color = "bg-blend-color "
        val luminosity = "bg-blend-luminosity "

        companion object {
            val instance = Blend()
        }
    }

    class Clip private constructor() {
        val border = "bg-clip-border "
        val padding = "bg-clip-padding "
        val content = "bg-clip-content "
        val bg = "bg-clip-bg "
        companion object {
            val instance = Clip()
        }
    }

    class Slate private constructor() {
        val n50 = "bg-slate-50 "
        val n100 = "bg-slate-100 "
        val n200 = "bg-slate-200 "
        val n300 = "bg-slate-300 "
        val n400 = "bg-slate-400 "
        val n500 = "bg-slate-500 "
        val n600 = "bg-slate-600 "
        val n700 = "bg-slate-700 "
        val n800 = "bg-slate-800 "
        val n900 = "bg-slate-900 "

        companion object {
            val instance: Slate = Slate()
        }
    }

    class Gray private constructor() {
        val n50 = "bg-gray-50 "
        val n100 = "bg-gray-100 "
        val n200 = "bg-gray-200 "
        val n300 = "bg-gray-300 "
        val n400 = "bg-gray-400 "
        val n500 = "bg-gray-500 "
        val n600 = "bg-gray-600 "
        val n700 = "bg-gray-700 "
        val n800 = "bg-gray-800 "
        val n900 = "bg-gray-900 "

        companion object {
            val instance: Gray = Gray()
        }
    }

    class Zinc private constructor() {
        val n50 = "bg-zinc-50 "
        val n100 = "bg-zinc-100 "
        val n200 = "bg-zinc-200 "
        val n300 = "bg-zinc-300 "
        val n400 = "bg-zinc-400 "
        val n500 = "bg-zinc-500 "
        val n600 = "bg-zinc-600 "
        val n700 = "bg-zinc-700 "
        val n800 = "bg-zinc-800 "
        val n900 = "bg-zinc-900 "

        companion object {
            val instance: Zinc = Zinc()
        }
    }

    class Neutral private constructor() {
        val n50 = "bg-neutral-50 "
        val n100 = "bg-neutral-100 "
        val n200 = "bg-neutral-200 "
        val n300 = "bg-neutral-300 "
        val n400 = "bg-neutral-400 "
        val n500 = "bg-neutral-500 "
        val n600 = "bg-neutral-600 "
        val n700 = "bg-neutral-700 "
        val n800 = "bg-neutral-800 "
        val n900 = "bg-neutral-900 "

        companion object {
            val instance: Neutral = Neutral()
        }
    }

    class Stone private constructor() {
        val n50 = "bg-stone-50 "
        val n100 = "bg-stone-100 "
        val n200 = "bg-stone-200 "
        val n300 = "bg-stone-300 "
        val n400 = "bg-stone-400 "
        val n500 = "bg-stone-500 "
        val n600 = "bg-stone-600 "
        val n700 = "bg-stone-700 "
        val n800 = "bg-stone-800 "
        val n900 = "bg-stone-900 "

        companion object {
            val instance: Stone = Stone()
        }
    }

    class Red private constructor() {
        val n50 = "bg-red-50 "
        val n100 = "bg-red-100 "
        val n200 = "bg-red-200 "
        val n300 = "bg-red-300 "
        val n400 = "bg-red-400 "
        val n500 = "bg-red-500 "
        val n600 = "bg-red-600 "
        val n700 = "bg-red-700 "
        val n800 = "bg-red-800 "
        val n900 = "bg-red-900 "

        companion object {
            val instance: Red = Red()
        }
    }

    class Orange private constructor() {
        val n50 = "bg-orange-50 "
        val n100 = "bg-orange-100 "
        val n200 = "bg-orange-200 "
        val n300 = "bg-orange-300 "
        val n400 = "bg-orange-400 "
        val n500 = "bg-orange-500 "
        val n600 = "bg-orange-600 "
        val n700 = "bg-orange-700 "
        val n800 = "bg-orange-800 "
        val n900 = "bg-orange-900 "

        companion object {
            val instance: Orange = Orange()
        }
    }

    class Amber private constructor() {
        val n50 = "bg-amber-50 "
        val n100 = "bg-amber-100 "
        val n200 = "bg-amber-200 "
        val n300 = "bg-amber-300 "
        val n400 = "bg-amber-400 "
        val n500 = "bg-amber-500 "
        val n600 = "bg-amber-600 "
        val n700 = "bg-amber-700 "
        val n800 = "bg-amber-800 "
        val n900 = "bg-amber-900 "

        companion object {
            val instance: Amber = Amber()
        }
    }

    class Yellow private constructor() {
        val n50 = "bg-yellow-50 "
        val n100 = "bg-yellow-100 "
        val n200 = "bg-yellow-200 "
        val n300 = "bg-yellow-300 "
        val n400 = "bg-yellow-400 "
        val n500 = "bg-yellow-500 "
        val n600 = "bg-yellow-600 "
        val n700 = "bg-yellow-700 "
        val n800 = "bg-yellow-800 "
        val n900 = "bg-yellow-900 "

        companion object {
            val instance: Yellow = Yellow()
        }
    }

    class Lime private constructor() {
        val n50 = "bg-lime-50 "
        val n100 = "bg-lime-100 "
        val n200 = "bg-lime-200 "
        val n300 = "bg-lime-300 "
        val n400 = "bg-lime-400 "
        val n500 = "bg-lime-500 "
        val n600 = "bg-lime-600 "
        val n700 = "bg-lime-700 "
        val n800 = "bg-lime-800 "
        val n900 = "bg-lime-900 "

        companion object {
            val instance: Lime = Lime()
        }
    }

    class Green private constructor() {
        val n50 = "bg-green-50 "
        val n100 = "bg-green-100 "
        val n200 = "bg-green-200 "
        val n300 = "bg-green-300 "
        val n400 = "bg-green-400 "
        val n500 = "bg-green-500 "
        val n600 = "bg-green-600 "
        val n700 = "bg-green-700 "
        val n800 = "bg-green-800 "
        val n900 = "bg-green-900 "

        companion object {
            val instance: Green = Green()
        }
    }

    class Emerald private constructor() {
        val n50 = "bg-emerald-50 "
        val n100 = "bg-emerald-100 "
        val n200 = "bg-emerald-200 "
        val n300 = "bg-emerald-300 "
        val n400 = "bg-emerald-400 "
        val n500 = "bg-emerald-500 "
        val n600 = "bg-emerald-600 "
        val n700 = "bg-emerald-700 "
        val n800 = "bg-emerald-800 "
        val n900 = "bg-emerald-900 "

        companion object {
            val instance: Emerald = Emerald()
        }
    }

    class Teal private constructor() {
        val n50 = "bg-teal-50 "
        val n100 = "bg-teal-100 "
        val n200 = "bg-teal-200 "
        val n300 = "bg-teal-300 "
        val n400 = "bg-teal-400 "
        val n500 = "bg-teal-500 "
        val n600 = "bg-teal-600 "
        val n700 = "bg-teal-700 "
        val n800 = "bg-teal-800 "
        val n900 = "bg-teal-900 "

        companion object {
            val instance: Teal = Teal()
        }
    }

    class Cyan private constructor() {
        val n50 = "bg-cyan-50 "
        val n100 = "bg-cyan-100 "
        val n200 = "bg-cyan-200 "
        val n300 = "bg-cyan-300 "
        val n400 = "bg-cyan-400 "
        val n500 = "bg-cyan-500 "
        val n600 = "bg-cyan-600 "
        val n700 = "bg-cyan-700 "
        val n800 = "bg-cyan-800 "
        val n900 = "bg-cyan-900 "

        companion object {
            val instance: Cyan = Cyan()
        }
    }

    class Sky private constructor() {
        val n50 = "bg-sky-50 "
        val n100 = "bg-sky-100 "
        val n200 = "bg-sky-200 "
        val n300 = "bg-sky-300 "
        val n400 = "bg-sky-400 "
        val n500 = "bg-sky-500 "
        val n600 = "bg-sky-600 "
        val n700 = "bg-sky-700 "
        val n800 = "bg-sky-800 "
        val n900 = "bg-sky-900 "

        companion object {
            val instance: Sky = Sky()
        }
    }

    class Blue private constructor() {
        val n50 = "bg-blue-50 "
        val n100 = "bg-blue-100 "
        val n200 = "bg-blue-200 "
        val n300 = "bg-blue-300 "
        val n400 = "bg-blue-400 "
        val n500 = "bg-blue-500 "
        val n600 = "bg-blue-600 "
        val n700 = "bg-blue-700 "
        val n800 = "bg-blue-800 "
        val n900 = "bg-blue-900 "

        companion object {
            val instance: Blue = Blue()
        }
    }

    class Indigo private constructor() {
        val n50 = "bg-indigo-50 "
        val n100 = "bg-indigo-100 "
        val n200 = "bg-indigo-200 "
        val n300 = "bg-indigo-300 "
        val n400 = "bg-indigo-400 "
        val n500 = "bg-indigo-500 "
        val n600 = "bg-indigo-600 "
        val n700 = "bg-indigo-700 "
        val n800 = "bg-indigo-800 "
        val n900 = "bg-indigo-900 "

        companion object {
            val instance: Indigo = Indigo()
        }
    }

    class Violet private constructor() {
        val n50 = "bg-violet-50 "
        val n100 = "bg-violet-100 "
        val n200 = "bg-violet-200 "
        val n300 = "bg-violet-300 "
        val n400 = "bg-violet-400 "
        val n500 = "bg-violet-500 "
        val n600 = "bg-violet-600 "
        val n700 = "bg-violet-700 "
        val n800 = "bg-violet-800 "
        val n900 = "bg-violet-900 "

        companion object {
            val instance: Violet = Violet()
        }
    }

    class Purple private constructor() {
        val n50 = "bg-purple-50 "
        val n100 = "bg-purple-100 "
        val n200 = "bg-purple-200 "
        val n300 = "bg-purple-300 "
        val n400 = "bg-purple-400 "
        val n500 = "bg-purple-500 "
        val n600 = "bg-purple-600 "
        val n700 = "bg-purple-700 "
        val n800 = "bg-purple-800 "
        val n900 = "bg-purple-900 "

        companion object {
            val instance: Purple = Purple()
        }
    }

    class Fuchsia private constructor() {
        val n50 = "bg-fuchsia-50 "
        val n100 = "bg-fuchsia-100 "
        val n200 = "bg-fuchsia-200 "
        val n300 = "bg-fuchsia-300 "
        val n400 = "bg-fuchsia-400 "
        val n500 = "bg-fuchsia-500 "
        val n600 = "bg-fuchsia-600 "
        val n700 = "bg-fuchsia-700 "
        val n800 = "bg-fuchsia-800 "
        val n900 = "bg-fuchsia-900 "

        companion object {
            val instance: Fuchsia = Fuchsia()
        }
    }

    class Pink private constructor() {
        val n50 = "bg-pink-50 "
        val n100 = "bg-pink-100 "
        val n200 = "bg-pink-200 "
        val n300 = "bg-pink-300 "
        val n400 = "bg-pink-400 "
        val n500 = "bg-pink-500 "
        val n600 = "bg-pink-600 "
        val n700 = "bg-pink-700 "
        val n800 = "bg-pink-800 "
        val n900 = "bg-pink-900 "

        companion object {
            val instance: Pink = Pink()
        }
    }

    class Rose private constructor() {
        val n50 = "bg-rose-50 "
        val n100 = "bg-rose-100 "
        val n200 = "bg-rose-200 "
        val n300 = "bg-rose-300 "
        val n400 = "bg-rose-400 "
        val n500 = "bg-rose-500 "
        val n600 = "bg-rose-600 "
        val n700 = "bg-rose-700 "
        val n800 = "bg-rose-800 "
        val n900 = "bg-rose-900 "

        companion object {
            val instance: Rose = Rose()
        }
    }

    class Gradient private constructor() {
        val to = To.instance
        val from = From.instance

        class To private constructor() {
            val t = "bg-gradient-to-t "
            val r = "bg-gradient-to-r "
            val b = "bg-gradient-to-b "
            val l = "bg-gradient-to-l "

            val inherit = "to-inherit "
            val current = "to-current "
            val transparent = "to-transparent "
            val black = "to-black "
            val white = "to-white "

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
                val instance = To()
            }

            class Slate private constructor() {
                val n50 = "to-slate-50 "
                val n100 = "to-slate-100 "
                val n200 = "to-slate-200 "
                val n300 = "to-slate-300 "
                val n400 = "to-slate-400 "
                val n500 = "to-slate-500 "
                val n600 = "to-slate-600 "
                val n700 = "to-slate-700 "
                val n800 = "to-slate-800 "
                val n900 = "to-slate-900 "

                companion object {
                    val instance: Slate = Slate()
                }
            }

            class Gray private constructor() {
                val n50 = "to-gray-50 "
                val n100 = "to-gray-100 "
                val n200 = "to-gray-200 "
                val n300 = "to-gray-300 "
                val n400 = "to-gray-400 "
                val n500 = "to-gray-500 "
                val n600 = "to-gray-600 "
                val n700 = "to-gray-700 "
                val n800 = "to-gray-800 "
                val n900 = "to-gray-900 "

                companion object {
                    val instance: Gray = Gray()
                }
            }

            class Zinc private constructor() {
                val n50 = "to-zinc-50 "
                val n100 = "to-zinc-100 "
                val n200 = "to-zinc-200 "
                val n300 = "to-zinc-300 "
                val n400 = "to-zinc-400 "
                val n500 = "to-zinc-500 "
                val n600 = "to-zinc-600 "
                val n700 = "to-zinc-700 "
                val n800 = "to-zinc-800 "
                val n900 = "to-zinc-900 "

                companion object {
                    val instance: Zinc = Zinc()
                }
            }

            class Neutral private constructor() {
                val n50 = "to-neutral-50 "
                val n100 = "to-neutral-100 "
                val n200 = "to-neutral-200 "
                val n300 = "to-neutral-300 "
                val n400 = "to-neutral-400 "
                val n500 = "to-neutral-500 "
                val n600 = "to-neutral-600 "
                val n700 = "to-neutral-700 "
                val n800 = "to-neutral-800 "
                val n900 = "to-neutral-900 "

                companion object {
                    val instance: Neutral =
                        Neutral()
                }
            }

            class Stone private constructor() {
                val n50 = "to-stone-50 "
                val n100 = "to-stone-100 "
                val n200 = "to-stone-200 "
                val n300 = "to-stone-300 "
                val n400 = "to-stone-400 "
                val n500 = "to-stone-500 "
                val n600 = "to-stone-600 "
                val n700 = "to-stone-700 "
                val n800 = "to-stone-800 "
                val n900 = "to-stone-900 "

                companion object {
                    val instance: Stone = Stone()
                }
            }

            class Red private constructor() {
                val n50 = "to-red-50 "
                val n100 = "to-red-100 "
                val n200 = "to-red-200 "
                val n300 = "to-red-300 "
                val n400 = "to-red-400 "
                val n500 = "to-red-500 "
                val n600 = "to-red-600 "
                val n700 = "to-red-700 "
                val n800 = "to-red-800 "
                val n900 = "to-red-900 "

                companion object {
                    val instance: Red = Red()
                }
            }

            class Orange private constructor() {
                val n50 = "to-orange-50 "
                val n100 = "to-orange-100 "
                val n200 = "to-orange-200 "
                val n300 = "to-orange-300 "
                val n400 = "to-orange-400 "
                val n500 = "to-orange-500 "
                val n600 = "to-orange-600 "
                val n700 = "to-orange-700 "
                val n800 = "to-orange-800 "
                val n900 = "to-orange-900 "

                companion object {
                    val instance: Orange = Orange()
                }
            }

            class Amber private constructor() {
                val n50 = "to-amber-50 "
                val n100 = "to-amber-100 "
                val n200 = "to-amber-200 "
                val n300 = "to-amber-300 "
                val n400 = "to-amber-400 "
                val n500 = "to-amber-500 "
                val n600 = "to-amber-600 "
                val n700 = "to-amber-700 "
                val n800 = "to-amber-800 "
                val n900 = "to-amber-900 "

                companion object {
                    val instance: Amber = Amber()
                }
            }

            class Yellow private constructor() {
                val n50 = "to-yellow-50 "
                val n100 = "to-yellow-100 "
                val n200 = "to-yellow-200 "
                val n300 = "to-yellow-300 "
                val n400 = "to-yellow-400 "
                val n500 = "to-yellow-500 "
                val n600 = "to-yellow-600 "
                val n700 = "to-yellow-700 "
                val n800 = "to-yellow-800 "
                val n900 = "to-yellow-900 "

                companion object {
                    val instance: Yellow = Yellow()
                }
            }

            class Lime private constructor() {
                val n50 = "to-lime-50 "
                val n100 = "to-lime-100 "
                val n200 = "to-lime-200 "
                val n300 = "to-lime-300 "
                val n400 = "to-lime-400 "
                val n500 = "to-lime-500 "
                val n600 = "to-lime-600 "
                val n700 = "to-lime-700 "
                val n800 = "to-lime-800 "
                val n900 = "to-lime-900 "

                companion object {
                    val instance: Lime = Lime()
                }
            }

            class Green private constructor() {
                val n50 = "to-green-50 "
                val n100 = "to-green-100 "
                val n200 = "to-green-200 "
                val n300 = "to-green-300 "
                val n400 = "to-green-400 "
                val n500 = "to-green-500 "
                val n600 = "to-green-600 "
                val n700 = "to-green-700 "
                val n800 = "to-green-800 "
                val n900 = "to-green-900 "

                companion object {
                    val instance: Green = Green()
                }
            }

            class Emerald private constructor() {
                val n50 = "to-emerald-50 "
                val n100 = "to-emerald-100 "
                val n200 = "to-emerald-200 "
                val n300 = "to-emerald-300 "
                val n400 = "to-emerald-400 "
                val n500 = "to-emerald-500 "
                val n600 = "to-emerald-600 "
                val n700 = "to-emerald-700 "
                val n800 = "to-emerald-800 "
                val n900 = "to-emerald-900 "

                companion object {
                    val instance: Emerald =
                        Emerald()
                }
            }

            class Teal private constructor() {
                val n50 = "to-teal-50 "
                val n100 = "to-teal-100 "
                val n200 = "to-teal-200 "
                val n300 = "to-teal-300 "
                val n400 = "to-teal-400 "
                val n500 = "to-teal-500 "
                val n600 = "to-teal-600 "
                val n700 = "to-teal-700 "
                val n800 = "to-teal-800 "
                val n900 = "to-teal-900 "

                companion object {
                    val instance: Teal = Teal()
                }
            }

            class Cyan private constructor() {
                val n50 = "to-cyan-50 "
                val n100 = "to-cyan-100 "
                val n200 = "to-cyan-200 "
                val n300 = "to-cyan-300 "
                val n400 = "to-cyan-400 "
                val n500 = "to-cyan-500 "
                val n600 = "to-cyan-600 "
                val n700 = "to-cyan-700 "
                val n800 = "to-cyan-800 "
                val n900 = "to-cyan-900 "

                companion object {
                    val instance: Cyan = Cyan()
                }
            }

            class Sky private constructor() {
                val n50 = "to-sky-50 "
                val n100 = "to-sky-100 "
                val n200 = "to-sky-200 "
                val n300 = "to-sky-300 "
                val n400 = "to-sky-400 "
                val n500 = "to-sky-500 "
                val n600 = "to-sky-600 "
                val n700 = "to-sky-700 "
                val n800 = "to-sky-800 "
                val n900 = "to-sky-900 "

                companion object {
                    val instance: Sky = Sky()
                }
            }

            class Blue private constructor() {
                val n50 = "to-blue-50 "
                val n100 = "to-blue-100 "
                val n200 = "to-blue-200 "
                val n300 = "to-blue-300 "
                val n400 = "to-blue-400 "
                val n500 = "to-blue-500 "
                val n600 = "to-blue-600 "
                val n700 = "to-blue-700 "
                val n800 = "to-blue-800 "
                val n900 = "to-blue-900 "

                companion object {
                    val instance: Blue = Blue()
                }
            }

            class Indigo private constructor() {
                val n50 = "to-indigo-50 "
                val n100 = "to-indigo-100 "
                val n200 = "to-indigo-200 "
                val n300 = "to-indigo-300 "
                val n400 = "to-indigo-400 "
                val n500 = "to-indigo-500 "
                val n600 = "to-indigo-600 "
                val n700 = "to-indigo-700 "
                val n800 = "to-indigo-800 "
                val n900 = "to-indigo-900 "

                companion object {
                    val instance: Indigo = Indigo()
                }
            }

            class Violet private constructor() {
                val n50 = "to-violet-50 "
                val n100 = "to-violet-100 "
                val n200 = "to-violet-200 "
                val n300 = "to-violet-300 "
                val n400 = "to-violet-400 "
                val n500 = "to-violet-500 "
                val n600 = "to-violet-600 "
                val n700 = "to-violet-700 "
                val n800 = "to-violet-800 "
                val n900 = "to-violet-900 "

                companion object {
                    val instance: Violet = Violet()
                }
            }

            class Purple private constructor() {
                val n50 = "to-purple-50 "
                val n100 = "to-purple-100 "
                val n200 = "to-purple-200 "
                val n300 = "to-purple-300 "
                val n400 = "to-purple-400 "
                val n500 = "to-purple-500 "
                val n600 = "to-purple-600 "
                val n700 = "to-purple-700 "
                val n800 = "to-purple-800 "
                val n900 = "to-purple-900 "

                companion object {
                    val instance: Purple = Purple()
                }
            }

            class Fuchsia private constructor() {
                val n50 = "to-fuchsia-50 "
                val n100 = "to-fuchsia-100 "
                val n200 = "to-fuchsia-200 "
                val n300 = "to-fuchsia-300 "
                val n400 = "to-fuchsia-400 "
                val n500 = "to-fuchsia-500 "
                val n600 = "to-fuchsia-600 "
                val n700 = "to-fuchsia-700 "
                val n800 = "to-fuchsia-800 "
                val n900 = "to-fuchsia-900 "

                companion object {
                    val instance: Fuchsia =
                        Fuchsia()
                }
            }

            class Pink private constructor() {
                val n50 = "to-pink-50 "
                val n100 = "to-pink-100 "
                val n200 = "to-pink-200 "
                val n300 = "to-pink-300 "
                val n400 = "to-pink-400 "
                val n500 = "to-pink-500 "
                val n600 = "to-pink-600 "
                val n700 = "to-pink-700 "
                val n800 = "to-pink-800 "
                val n900 = "to-pink-900 "

                companion object {
                    val instance: Pink = Pink()
                }
            }

            class Rose private constructor() {
                val n50 = "to-rose-50 "
                val n100 = "to-rose-100 "
                val n200 = "to-rose-200 "
                val n300 = "to-rose-300 "
                val n400 = "to-rose-400 "
                val n500 = "to-rose-500 "
                val n600 = "to-rose-600 "
                val n700 = "to-rose-700 "
                val n800 = "to-rose-800 "
                val n900 = "to-rose-900 "

                companion object {
                    val instance: Rose = Rose()
                }
            }
        }

        class From private constructor() {
            val inherit = "from-inherit "
            val current = "from-current "
            val transparent = "from-transparent "
            val black = "from-black "
            val white = "from-white "

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
                val instance = From()
            }

            class Slate private constructor() {
                val n50 = "from-slate-50 "
                val n100 = "from-slate-100 "
                val n200 = "from-slate-200 "
                val n300 = "from-slate-300 "
                val n400 = "from-slate-400 "
                val n500 = "from-slate-500 "
                val n600 = "from-slate-600 "
                val n700 = "from-slate-700 "
                val n800 = "from-slate-800 "
                val n900 = "from-slate-900 "

                companion object {
                    val instance: Slate =
                        Slate()
                }
            }

            class Gray private constructor() {
                val n50 = "from-gray-50 "
                val n100 = "from-gray-100 "
                val n200 = "from-gray-200 "
                val n300 = "from-gray-300 "
                val n400 = "from-gray-400 "
                val n500 = "from-gray-500 "
                val n600 = "from-gray-600 "
                val n700 = "from-gray-700 "
                val n800 = "from-gray-800 "
                val n900 = "from-gray-900 "

                companion object {
                    val instance: Gray = Gray()
                }
            }

            class Zinc private constructor() {
                val n50 = "from-zinc-50 "
                val n100 = "from-zinc-100 "
                val n200 = "from-zinc-200 "
                val n300 = "from-zinc-300 "
                val n400 = "from-zinc-400 "
                val n500 = "from-zinc-500 "
                val n600 = "from-zinc-600 "
                val n700 = "from-zinc-700 "
                val n800 = "from-zinc-800 "
                val n900 = "from-zinc-900 "

                companion object {
                    val instance: Zinc = Zinc()
                }
            }

            class Neutral private constructor() {
                val n50 = "from-neutral-50 "
                val n100 = "from-neutral-100 "
                val n200 = "from-neutral-200 "
                val n300 = "from-neutral-300 "
                val n400 = "from-neutral-400 "
                val n500 = "from-neutral-500 "
                val n600 = "from-neutral-600 "
                val n700 = "from-neutral-700 "
                val n800 = "from-neutral-800 "
                val n900 = "from-neutral-900 "

                companion object {
                    val instance: Neutral =
                        Neutral()
                }
            }

            class Stone private constructor() {
                val n50 = "from-stone-50 "
                val n100 = "from-stone-100 "
                val n200 = "from-stone-200 "
                val n300 = "from-stone-300 "
                val n400 = "from-stone-400 "
                val n500 = "from-stone-500 "
                val n600 = "from-stone-600 "
                val n700 = "from-stone-700 "
                val n800 = "from-stone-800 "
                val n900 = "from-stone-900 "

                companion object {
                    val instance: Stone =
                        Stone()
                }
            }

            class Red private constructor() {
                val n50 = "from-red-50 "
                val n100 = "from-red-100 "
                val n200 = "from-red-200 "
                val n300 = "from-red-300 "
                val n400 = "from-red-400 "
                val n500 = "from-red-500 "
                val n600 = "from-red-600 "
                val n700 = "from-red-700 "
                val n800 = "from-red-800 "
                val n900 = "from-red-900 "

                companion object {
                    val instance: Red = Red()
                }
            }

            class Orange private constructor() {
                val n50 = "from-orange-50 "
                val n100 = "from-orange-100 "
                val n200 = "from-orange-200 "
                val n300 = "from-orange-300 "
                val n400 = "from-orange-400 "
                val n500 = "from-orange-500 "
                val n600 = "from-orange-600 "
                val n700 = "from-orange-700 "
                val n800 = "from-orange-800 "
                val n900 = "from-orange-900 "

                companion object {
                    val instance: Orange =
                        Orange()
                }
            }

            class Amber private constructor() {
                val n50 = "from-amber-50 "
                val n100 = "from-amber-100 "
                val n200 = "from-amber-200 "
                val n300 = "from-amber-300 "
                val n400 = "from-amber-400 "
                val n500 = "from-amber-500 "
                val n600 = "from-amber-600 "
                val n700 = "from-amber-700 "
                val n800 = "from-amber-800 "
                val n900 = "from-amber-900 "

                companion object {
                    val instance: Amber =
                        Amber()
                }
            }

            class Yellow private constructor() {
                val n50 = "from-yellow-50 "
                val n100 = "from-yellow-100 "
                val n200 = "from-yellow-200 "
                val n300 = "from-yellow-300 "
                val n400 = "from-yellow-400 "
                val n500 = "from-yellow-500 "
                val n600 = "from-yellow-600 "
                val n700 = "from-yellow-700 "
                val n800 = "from-yellow-800 "
                val n900 = "from-yellow-900 "

                companion object {
                    val instance: Yellow =
                        Yellow()
                }
            }

            class Lime private constructor() {
                val n50 = "from-lime-50 "
                val n100 = "from-lime-100 "
                val n200 = "from-lime-200 "
                val n300 = "from-lime-300 "
                val n400 = "from-lime-400 "
                val n500 = "from-lime-500 "
                val n600 = "from-lime-600 "
                val n700 = "from-lime-700 "
                val n800 = "from-lime-800 "
                val n900 = "from-lime-900 "

                companion object {
                    val instance: Lime = Lime()
                }
            }

            class Green private constructor() {
                val n50 = "from-green-50 "
                val n100 = "from-green-100 "
                val n200 = "from-green-200 "
                val n300 = "from-green-300 "
                val n400 = "from-green-400 "
                val n500 = "from-green-500 "
                val n600 = "from-green-600 "
                val n700 = "from-green-700 "
                val n800 = "from-green-800 "
                val n900 = "from-green-900 "

                companion object {
                    val instance: Green =
                        Green()
                }
            }

            class Emerald private constructor() {
                val n50 = "from-emerald-50 "
                val n100 = "from-emerald-100 "
                val n200 = "from-emerald-200 "
                val n300 = "from-emerald-300 "
                val n400 = "from-emerald-400 "
                val n500 = "from-emerald-500 "
                val n600 = "from-emerald-600 "
                val n700 = "from-emerald-700 "
                val n800 = "from-emerald-800 "
                val n900 = "from-emerald-900 "

                companion object {
                    val instance: Emerald =
                        Emerald()
                }
            }

            class Teal private constructor() {
                val n50 = "from-teal-50 "
                val n100 = "from-teal-100 "
                val n200 = "from-teal-200 "
                val n300 = "from-teal-300 "
                val n400 = "from-teal-400 "
                val n500 = "from-teal-500 "
                val n600 = "from-teal-600 "
                val n700 = "from-teal-700 "
                val n800 = "from-teal-800 "
                val n900 = "from-teal-900 "

                companion object {
                    val instance: Teal = Teal()
                }
            }

            class Cyan private constructor() {
                val n50 = "from-cyan-50 "
                val n100 = "from-cyan-100 "
                val n200 = "from-cyan-200 "
                val n300 = "from-cyan-300 "
                val n400 = "from-cyan-400 "
                val n500 = "from-cyan-500 "
                val n600 = "from-cyan-600 "
                val n700 = "from-cyan-700 "
                val n800 = "from-cyan-800 "
                val n900 = "from-cyan-900 "

                companion object {
                    val instance: Cyan = Cyan()
                }
            }

            class Sky private constructor() {
                val n50 = "from-sky-50 "
                val n100 = "from-sky-100 "
                val n200 = "from-sky-200 "
                val n300 = "from-sky-300 "
                val n400 = "from-sky-400 "
                val n500 = "from-sky-500 "
                val n600 = "from-sky-600 "
                val n700 = "from-sky-700 "
                val n800 = "from-sky-800 "
                val n900 = "from-sky-900 "

                companion object {
                    val instance: Sky = Sky()
                }
            }

            class Blue private constructor() {
                val n50 = "from-blue-50 "
                val n100 = "from-blue-100 "
                val n200 = "from-blue-200 "
                val n300 = "from-blue-300 "
                val n400 = "from-blue-400 "
                val n500 = "from-blue-500 "
                val n600 = "from-blue-600 "
                val n700 = "from-blue-700 "
                val n800 = "from-blue-800 "
                val n900 = "from-blue-900 "

                companion object {
                    val instance: Blue = Blue()
                }
            }

            class Indigo private constructor() {
                val n50 = "from-indigo-50 "
                val n100 = "from-indigo-100 "
                val n200 = "from-indigo-200 "
                val n300 = "from-indigo-300 "
                val n400 = "from-indigo-400 "
                val n500 = "from-indigo-500 "
                val n600 = "from-indigo-600 "
                val n700 = "from-indigo-700 "
                val n800 = "from-indigo-800 "
                val n900 = "from-indigo-900 "

                companion object {
                    val instance: Indigo =
                        Indigo()
                }
            }

            class Violet private constructor() {
                val n50 = "from-violet-50 "
                val n100 = "from-violet-100 "
                val n200 = "from-violet-200 "
                val n300 = "from-violet-300 "
                val n400 = "from-violet-400 "
                val n500 = "from-violet-500 "
                val n600 = "from-violet-600 "
                val n700 = "from-violet-700 "
                val n800 = "from-violet-800 "
                val n900 = "from-violet-900 "

                companion object {
                    val instance: Violet =
                        Violet()
                }
            }

            class Purple private constructor() {
                val n50 = "from-purple-50 "
                val n100 = "from-purple-100 "
                val n200 = "from-purple-200 "
                val n300 = "from-purple-300 "
                val n400 = "from-purple-400 "
                val n500 = "from-purple-500 "
                val n600 = "from-purple-600 "
                val n700 = "from-purple-700 "
                val n800 = "from-purple-800 "
                val n900 = "from-purple-900 "

                companion object {
                    val instance: Purple =
                        Purple()
                }
            }

            class Fuchsia private constructor() {
                val n50 = "from-fuchsia-50 "
                val n100 = "from-fuchsia-100 "
                val n200 = "from-fuchsia-200 "
                val n300 = "from-fuchsia-300 "
                val n400 = "from-fuchsia-400 "
                val n500 = "from-fuchsia-500 "
                val n600 = "from-fuchsia-600 "
                val n700 = "from-fuchsia-700 "
                val n800 = "from-fuchsia-800 "
                val n900 = "from-fuchsia-900 "

                companion object {
                    val instance: Fuchsia =
                        Fuchsia()
                }
            }

            class Pink private constructor() {
                val n50 = "from-pink-50 "
                val n100 = "from-pink-100 "
                val n200 = "from-pink-200 "
                val n300 = "from-pink-300 "
                val n400 = "from-pink-400 "
                val n500 = "from-pink-500 "
                val n600 = "from-pink-600 "
                val n700 = "from-pink-700 "
                val n800 = "from-pink-800 "
                val n900 = "from-pink-900 "

                companion object {
                    val instance: Pink = Pink()
                }
            }

            class Rose private constructor() {
                val n50 = "from-rose-50 "
                val n100 = "from-rose-100 "
                val n200 = "from-rose-200 "
                val n300 = "from-rose-300 "
                val n400 = "from-rose-400 "
                val n500 = "from-rose-500 "
                val n600 = "from-rose-600 "
                val n700 = "from-rose-700 "
                val n800 = "from-rose-800 "
                val n900 = "from-rose-900 "

                companion object {
                    val instance: Rose = Rose()
                }
            }
        }

        companion object {
            val instance = Gradient()
        }
    }

    companion object {
        val instance = Bg()
    }
}