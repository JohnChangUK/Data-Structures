class Outer {

    private val bar: Int = 1

    inner class Nested {

        fun Show() = bar
    }
}

fun main(args:Array<String>){

    var demo = Outer().Nested().Show()
    println(demo)
}