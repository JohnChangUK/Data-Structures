class Car(Type:String, Model:Int,
          Price:Double, Miles:Int, Owner:String){

        var Owner:String?=null
        var Price:Double?=null
        var Miles:Int?=null
        var Model:Int?=null
        var Type:String?=null

        init {
            this.Owner = Owner
            this.Price = Price
            this.Miles = Miles
            this.Model = Model
            this.Type = Type
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

    var lambo = Car("Lambo", 2017, 10000.0, 100, "John")
    println("Owner:" + lambo.GetOwner())
    println("Price:" + lambo.GetPrice())
    println("Type:" + lambo.GetType())

    var ferrari = Car("Ferrari", 2016, 5000.0, 100, "Frank")
    println("Owner:" + ferrari.GetOwner())
    println("Price:" + ferrari.GetPrice())
    println("Type:" + ferrari.GetType())
}