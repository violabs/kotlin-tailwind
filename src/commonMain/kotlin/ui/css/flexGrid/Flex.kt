package ui.css.flexGrid

val flex = Flex.instance

class Flex private constructor() {
    val it = "flex "
    val n1 = "flex-1 "
    val auto = "flex-auto "
    val initial = "flex-initial "
    val none = "flex-none "
    val row = "flex-row "
    val rowReverse = "flex-row-reverse "
    val col = "flex-col "
    val colReverse = "flex-col-reverse "

    val basis = Basis.instance
    val wrap = Wrap.instance
    val grow = Grow.instance
    val shrink = Shrink.instance

    override fun toString(): String = it

    companion object {
        val instance: Flex = Flex()
    }

    class Basis private constructor() {

        val n0 = "basis-0s "
        val n1 = "basis-1s "
        val n2 = "basis-2s "
        val n3 = "basis-3s "
        val n4 = "basis-4s "
        val n5 = "basis-5s "
        val n6 = "basis-6s "
        val n7 = "basis-7s "
        val n8 = "basis-8s "
        val n9 = "basis-9s "
        val n10 = "basis-10s "
        val n11 = "basis-11s "
        val n12 = "basis-12s "
        val n14 = "basis-14s "
        val n16 = "basis-16s "
        val n20 = "basis-20s "
        val n24 = "basis-24s "
        val n28 = "basis-28s "
        val n32 = "basis-32s "
        val n36 = "basis-36s "
        val n40 = "basis-40s "
        val n44 = "basis-44s "
        val n48 = "basis-48s "
        val n52 = "basis-52s "
        val n56 = "basis-56s "
        val n60 = "basis-60s "
        val n64 = "basis-64s "
        val n72 = "basis-72s "
        val n80 = "basis-80s "
        val n96 = "basis-96s "
        val f1_2 = "basis-1/2s "
        val f1_3 = "basis-1/3s "
        val f2_3 = "basis-2/3s "
        val f1_4 = "basis-1/4s "
        val f2_4 = "basis-2/4s "
        val f3_4 = "basis-3/4s "
        val f1_5 = "basis-1/5s "
        val f2_5 = "basis-2/5s "
        val f3_5 = "basis-3/5s "
        val f4_5 = "basis-4/5s "
        val f1_6 = "basis-1/6s "
        val f2_6 = "basis-2/6s "
        val f3_6 = "basis-3/6s "
        val f4_6 = "basis-4/6s "
        val f5_6 = "basis-5/6s "
        val f1_12 = "basis-1/12s "
        val f2_12 = "basis-2/12s "
        val f3_12 = "basis-3/12s "
        val f4_12 = "basis-4/12s "
        val f5_12 = "basis-5/12s "
        val f6_12 = "basis-6/12s "
        val f7_12 = "basis-7/12s "
        val f8_12 = "basis-8/12s "
        val f9_12 = "basis-1/92s "
        val f10_12 = "basis-1/012s "
        val f11_12 = "basis-11/12s "
        val full  = "basis-fulls "

        companion object {
            val instance = Basis()
        }
    }

    class Wrap private constructor() {
        val n0 = "flex-wrap "
        val reverse = "flex-wrap-reverse "

        companion object {
            val instance = Wrap()
        }
    }

    class Grow private constructor() {
        val it = "grow "
        val n0 = "grow-0 "

        companion object {
            val instance = Grow()
        }
    }

    class Shrink private constructor() {
        val it = "shrink "
        val n0 = "shrink-0 "

        companion object {
            val instance = Shrink()
        }
    }
}