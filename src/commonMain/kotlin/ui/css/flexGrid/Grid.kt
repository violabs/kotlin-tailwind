package ui.css.flexGrid

val grid = Grid.instance

class Grid private constructor() {
    val cols = Cols.instance
    val col = Col.instance
    val rows = Rows.instance
    val row = Row.instance
    val flow = Flow.instance
    val auto = Auto.instance

    companion object {
        val instance: Grid = Grid()
    }

    class Cols private constructor() {
        val n1 = "grid-cols-1 "
        val n2 = "grid-cols-2 "
        val n3 = "grid-cols-3 "
        val n4 = "grid-cols-4 "
        val n5 = "grid-cols-5 "
        val n6 = "grid-cols-6 "
        val n7 = "grid-cols-7 "
        val n8 = "grid-cols-8 "
        val n9 = "grid-cols-9 "
        val n10 = "grid-cols-10 "
        val n11 = "grid-cols-11 "
        val n12 = "grid-cols-12 "
        val none = "grid-cols-none "

        companion object {
            val instance = Cols()
        }
    }
    
    class Col private constructor() {
        val auto = "col-auto "
        val span = Span.instance
        val start = Start.instance
        val end = End.instance
        
        companion object {
            val instance = Col()
        }
        
        class Span private constructor() {
            val n1 = "col-span-1 "
            val n2 = "col-span-2 "
            val n3 = "col-span-3 "
            val n4 = "col-span-4 "
            val n5 = "col-span-5 "
            val n6 = "col-span-6 "
            val n7 = "col-span-7 "
            val n8 = "col-span-8 "
            val n9 = "col-span-9 "
            val n10 = "col-span-10 "
            val n11 = "col-span-11 "
            val n12 = "col-span-12 "
            val full = "col-span-full"

            companion object {
                val instance = Span()
            }
        }

        class Start private constructor() {
            val n1 = "col-start-1 "
            val n2 = "col-start-2 "
            val n3 = "col-start-3 "
            val n4 = "col-start-4 "
            val n5 = "col-start-5 "
            val n6 = "col-start-6 "
            val n7 = "col-start-7 "
            val n8 = "col-start-8 "
            val n9 = "col-start-9 "
            val n10 = "col-start-10 "
            val n11 = "col-start-11 "
            val n12 = "col-start-12 "
            val n13 = "col-start-13 "
            val auto = "col-start-auto"

            companion object {
                val instance = Start()
            }
        }

        class End private constructor() {
            val n1 = "col-end-1 "
            val n2 = "col-end-2 "
            val n3 = "col-end-3 "
            val n4 = "col-end-4 "
            val n5 = "col-end-5 "
            val n6 = "col-end-6 "
            val n7 = "col-end-7 "
            val n8 = "col-end-8 "
            val n9 = "col-end-9 "
            val n10 = "col-end-10 "
            val n11 = "col-end-11 "
            val n12 = "col-end-12 "
            val n13 = "col-end-13 "
            val auto = "col-end-auto"

            companion object {
                val instance = End()
            }
        }
    }

    class Rows private constructor() {
        val n1 = "grid-rows-1 "
        val n2 = "grid-rows-2 "
        val n3 = "grid-rows-3 "
        val n4 = "grid-rows-4 "
        val n5 = "grid-rows-5 "
        val n6 = "grid-rows-6 "
        val none = "grid-rows-none "

        companion object {
            val instance = Rows()
        }
    }

    class Row private constructor() {
        val auto = "row-auto "
        val span = instance
        val start = instance
        val end = instance

        companion object {
            val instance = Row()
        }

        class Span private constructor() {
            val n1 = "row-span-1 "
            val n2 = "row-span-2 "
            val n3 = "row-span-3 "
            val n4 = "row-span-4 "
            val n5 = "row-span-5 "
            val n6 = "row-span-6 "
            val n7 = "row-span-7 "
            val n8 = "row-span-8 "
            val n9 = "row-span-9 "
            val n10 = "row-span-10 "
            val n11 = "row-span-11 "
            val n12 = "row-span-12 "
            val full = "row-span-full"

            companion object {
                val instance = Span()
            }
        }

        class Start private constructor() {
            val n1 = "row-start-1 "
            val n2 = "row-start-2 "
            val n3 = "row-start-3 "
            val n4 = "row-start-4 "
            val n5 = "row-start-5 "
            val n6 = "row-start-6 "
            val n7 = "row-start-7 "
            val n8 = "row-start-8 "
            val n9 = "row-start-9 "
            val n10 = "row-start-10 "
            val n11 = "row-start-11 "
            val n12 = "row-start-12 "
            val n13 = "row-start-13 "
            val auto = "row-start-auto"

            companion object {
                val instance = Start()
            }
        }

        class End private constructor() {
            val n1 = "row-end-1 "
            val n2 = "row-end-2 "
            val n3 = "row-end-3 "
            val n4 = "row-end-4 "
            val n5 = "row-end-5 "
            val n6 = "row-end-6 "
            val n7 = "row-end-7 "
            val n8 = "row-end-8 "
            val n9 = "row-end-9 "
            val n10 = "row-end-10 "
            val n11 = "row-end-11 "
            val n12 = "row-end-12 "
            val n13 = "row-end-13 "
            val auto = "row-end-auto"

            companion object {
                val instance = End()
            }
        }
    }

    class Flow private constructor() {
        val row = instance
        val col = instance
        val dense = "grid-flow-dense "

        class Row private constructor() {
            val it = "grid-flow-row "
            val dense = "grid-flow-row-dense "

            companion object {
                val instance = Row()
            }
        }

        class Col private constructor() {
            val it = "grid-flow-col "
            val dense = "grid-flow-col-dense "

            companion object {
                val instance = Col()
            }
        }

        companion object {
            val instance = Flow()
        }
    }

    class Auto private constructor() {
        val cols = instance
        val rows = instance

        companion object {
            val instance = Auto()
        }

        class Cols private constructor() {
            val auto = "auto-cols-auto "
            val min = "auto-cols-min "
            val max = "auto-cols-max "
            val fr = "auto-cols-fr "

            companion object {
                val instance = Cols()
            }
        }

        class Rows private constructor() {
            val auto = "auto-rows-auto "
            val min = "auto-rows-min "
            val max = "auto-rows-max "
            val fr = "auto-rows-fr "

            companion object {
                val instance = Rows()
            }
        }
    }
}