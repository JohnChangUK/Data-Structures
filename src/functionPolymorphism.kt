fun show(name:String):Unit{

    println("Name: $name")
}

fun show(number:Int):Unit{

    println("number: $number")
}

fun show(numberD:Double):Unit{

    println("NumberD: $numberD")
}

fun main(args:Array<String>){

    show("John")
    show(10.21)
    show(100)
}