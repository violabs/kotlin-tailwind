package ui.css.borders

val rounded = Rounded.instance

class Rounded private constructor() {
    val none = "rounded-none "
    val sm = "rounded-sm "
    val it = "rounded "
    val md = "rounded-md "
    val lg = "rounded-lg "
    val xl = "rounded-xl "
    val n2xl = "rounded-2xl "
    val n3xl = "rounded-3xl "
    val full = "rounded-full "

    val t = T.instance
    val r = R.instance
    val b = B.instance
    val l = L.instance
    val tl = TL.instance
    val tr = TR.instance
    val br = BR.instance
    val bl = BL.instance

    override fun toString(): String = it

    class T private constructor() {
        val none = "rounded-t-none "
        val sm = "rounded-t-sm "
        val n0 = "rounded-t "
        val md = "rounded-t-md "
        val lg = "rounded-t-lg "
        val xl = "rounded-t-xl "
        val n2xl = "rounded-t-2xl "
        val n3xl = "rounded-t-3xl "
        val full = "rounded-t-full "

        companion object {
            val instance = T()
        }
    }

    class R private constructor() {
        val none = "rounded-r-none "
        val sm = "rounded-r-sm "
        val n0 = "rounded-r "
        val md = "rounded-r-md "
        val lg = "rounded-r-lg "
        val xl = "rounded-r-xl "
        val n2xl = "rounded-r-2xl "
        val n3xl = "rounded-r-3xl "
        val full = "rounded-r-full "

        companion object {
            val instance = R()
        }
    }

    class B private constructor() {
        val none = "rounded-b-none "
        val sm = "rounded-b-sm "
        val n0 = "rounded-b "
        val md = "rounded-b-md "
        val lg = "rounded-b-lg "
        val xl = "rounded-b-xl "
        val n2xl = "rounded-b-2xl "
        val n3xl = "rounded-b-3xl "
        val full = "rounded-b-full "

        companion object {
            val instance = B()
        }
    }

    class L private constructor() {
        val none = "rounded-l-none "
        val sm = "rounded-l-sm "
        val n0 = "rounded-l "
        val md = "rounded-l-md "
        val lg = "rounded-l-lg "
        val xl = "rounded-l-xl "
        val n2xl = "rounded-l-2xl "
        val n3xl = "rounded-l-3xl "
        val full = "rounded-l-full "

        companion object {
            val instance = L()
        }
    }

    class TL private constructor() {
        val none = "rounded-tl-none "
        val sm = "rounded-tl-sm "
        val n0 = "rounded-tl "
        val md = "rounded-tl-md "
        val lg = "rounded-tl-lg "
        val xl = "rounded-tl-xl "
        val n2xl = "rounded-tl-2xl "
        val n3xl = "rounded-tl-3xl "
        val full = "rounded-tl-full "

        companion object {
            val instance = TL()
        }
    }

    class TR private constructor() {
        val none = "rounded-tr-none "
        val sm = "rounded-tr-sm "
        val n0 = "rounded-tr "
        val md = "rounded-tr-md "
        val lg = "rounded-tr-lg "
        val xl = "rounded-tr-xl "
        val n2xl = "rounded-tr-2xl "
        val n3xl = "rounded-tr-3xl "
        val full = "rounded-tr-full "

        companion object {
            val instance = TR()
        }
    }

    class BR private constructor() {
        val none = "rounded-br-none "
        val sm = "rounded-br-sm "
        val n0 = "rounded-br "
        val md = "rounded-br-md "
        val lg = "rounded-br-lg "
        val xl = "rounded-br-xl "
        val n2xl = "rounded-br-2xl "
        val n3xl = "rounded-br-3xl "
        val full = "rounded-br-full "

        companion object {
            val instance = BR()
        }
    }

    class BL private constructor() {
        val none = "rounded-bl-none "
        val sm = "rounded-bl-sm "
        val n0 = "rounded-bl "
        val md = "rounded-bl-md "
        val lg = "rounded-bl-lg "
        val xl = "rounded-bl-xl "
        val n2xl = "rounded-bl-2xl "
        val n3xl = "rounded-bl-3xl "
        val full = "rounded-bl-full "

        companion object {
            val instance = BL()
        }
    }

    companion object {
        val instance = Rounded()
    }
}