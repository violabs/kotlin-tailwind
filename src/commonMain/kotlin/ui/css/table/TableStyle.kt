package ui.css.table

val tableStyle = TableStyle.instance

class TableStyle private constructor() {
    val border = Border.instance
    val auto = "table-auto "
    val fixed = "table-fixed"

    companion object {
        val instance: TableStyle = TableStyle()
    }

    class Border private constructor() {
        val collapse = "border-collapse"
        val separate = "border-separate"
        val spacing = Spacing.instance

        companion object {
            val instance = Border()
        }

        class Spacing private constructor() {
            val n0 = "border-spacing-0 "
            val n0_5 = "border-spacing-0.5 "
            val n1 = "border-spacing-px "
            val px = "border-spacing-px "
            val n1_5 = "border-spacing-1.5 "
            val n2 = "border-spacing-2 "
            val n2_5 = "border-spacing-2.5 "
            val n3 = "border-spacing-3 "
            val n3_5 = "border-spacing-3.5 "
            val n4 = "border-spacing-4 "
            val n5 = "border-spacing-5 "
            val n6 = "border-spacing-6 "
            val n7 = "border-spacing-7 "
            val n8 = "border-spacing-8 "
            val n9 = "border-spacing-9 "
            val n10 = "border-spacing-10 "
            val n11 = "border-spacing-11 "
            val n12 = "border-spacing-12 "
            val n14 = "border-spacing-14 "
            val n16 = "border-spacing-16 "
            val n20 = "border-spacing-20 "
            val n24 = "border-spacing-24 "
            val n28 = "border-spacing-28 "
            val n32 = "border-spacing-32 "
            val n36 = "border-spacing-36 "
            val n40 = "border-spacing-40 "
            val n44 = "border-spacing-44 "
            val n48 = "border-spacing-48 "
            val n52 = "border-spacing-52 "
            val n56 = "border-spacing-56 "
            val n60 = "border-spacing-60 "
            val n64 = "border-spacing-64 "
            val n72 = "border-spacing-72 "
            val n80 = "border-spacing-80 "
            val n96 = "border-spacing-96 "

            val x = X.instance
            val y = Y.instance

            companion object {
                val instance = Spacing()
            }

            class X private constructor() {
                val n0 = "border-spacing-x-0 "
                val n0_5 = "border-spacing-x-0.5 "
                val n1 = "border-spacing-x-px "
                val px = "border-spacing-x-px "
                val n1_5 = "border-spacing-x-1.5 "
                val n2 = "border-spacing-x-2 "
                val n2_5 = "border-spacing-x-2.5 "
                val n3 = "border-spacing-x-3 "
                val n3_5 = "border-spacing-x-3.5 "
                val n4 = "border-spacing-x-4 "
                val n5 = "border-spacing-x-5 "
                val n6 = "border-spacing-x-6 "
                val n7 = "border-spacing-x-7 "
                val n8 = "border-spacing-x-8 "
                val n9 = "border-spacing-x-9 "
                val n10 = "border-spacing-x-10 "
                val n11 = "border-spacing-x-11 "
                val n12 = "border-spacing-x-12 "
                val n14 = "border-spacing-x-14 "
                val n16 = "border-spacing-x-16 "
                val n20 = "border-spacing-x-20 "
                val n24 = "border-spacing-x-24 "
                val n28 = "border-spacing-x-28 "
                val n32 = "border-spacing-x-32 "
                val n36 = "border-spacing-x-36 "
                val n40 = "border-spacing-x-40 "
                val n44 = "border-spacing-x-44 "
                val n48 = "border-spacing-x-48 "
                val n52 = "border-spacing-x-52 "
                val n56 = "border-spacing-x-56 "
                val n60 = "border-spacing-x-60 "
                val n64 = "border-spacing-x-64 "
                val n72 = "border-spacing-x-72 "
                val n80 = "border-spacing-x-80 "
                val n96 = "border-spacing-x-96 "

                companion object {
                    val instance = X()
                }
            }

            class Y private constructor() {
                val n0 = "border-spacing-y-0 "
                val n0_5 = "border-spacing-y-0.5 "
                val n1 = "border-spacing-y-px "
                val px = "border-spacing-y-px "
                val n1_5 = "border-spacing-y-1.5 "
                val n2 = "border-spacing-y-2 "
                val n2_5 = "border-spacing-y-2.5 "
                val n3 = "border-spacing-y-3 "
                val n3_5 = "border-spacing-y-3.5 "
                val n4 = "border-spacing-y-4 "
                val n5 = "border-spacing-y-5 "
                val n6 = "border-spacing-y-6 "
                val n7 = "border-spacing-y-7 "
                val n8 = "border-spacing-y-8 "
                val n9 = "border-spacing-y-9 "
                val n10 = "border-spacing-y-10 "
                val n11 = "border-spacing-y-11 "
                val n12 = "border-spacing-y-12 "
                val n14 = "border-spacing-y-14 "
                val n16 = "border-spacing-y-16 "
                val n20 = "border-spacing-y-20 "
                val n24 = "border-spacing-y-24 "
                val n28 = "border-spacing-y-28 "
                val n32 = "border-spacing-y-32 "
                val n36 = "border-spacing-y-36 "
                val n40 = "border-spacing-y-40 "
                val n44 = "border-spacing-y-44 "
                val n48 = "border-spacing-y-48 "
                val n52 = "border-spacing-y-52 "
                val n56 = "border-spacing-y-56 "
                val n60 = "border-spacing-y-60 "
                val n64 = "border-spacing-y-64 "
                val n72 = "border-spacing-y-72 "
                val n80 = "border-spacing-y-80 "
                val n96 = "border-spacing-y-96 "

                companion object {
                    val instance = Y()
                }
            }
        }
    }
}