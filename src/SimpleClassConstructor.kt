class CarWithConstructor(){

    var Owner:String?=null
    var Price:Double?=null
    var Miles:Int?=null
    var Model:Int?=null
    var Type:String?=null

    constructor(Type:String, Model:Int,
                Price:Double, Miles:Int, Owner:String) : this() {
        this.Owner = Owner
        this.Price = Price
        this.Miles = Miles
        this.Model = Model
        this.Type = Type
    }

    constructor(Name:String) : this() {
        println("new class Instance")
    }

    fun GetPrice():Double? {
        return this.Price!! - (this.Miles!!.toDouble() * 10)
    }

    fun GetOwner():String? {
        return this.Owner
    }

    fun GetType():String? {
        return this.Type
    }
}

fun main(args:Array<String>){

    var c = CarWithConstructor("John")
}