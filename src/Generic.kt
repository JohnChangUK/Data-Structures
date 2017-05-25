class UserAdmins<T> (credit:T){

    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){
    var userAdmin = UserAdmins<String>("John")
    var userAdmin2 = UserAdmins<Int>(22)
    var userAdmin3 = UserAdmins<Double>(3.14159)

    display<Int>(100)
    display<String>("Heya")
}
