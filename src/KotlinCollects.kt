fun main(args:Array<String>){

    var map = hashMapOf(1 to "John", 2 to "James")

    map.put(3, "Layla")

    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,10,22,11)
    println(ar[0])
    // list is a Linked List, different from Array,can't select by Index
    var list = mutableListOf(11,22,33,22)
    list[0]=122
    for (item in list) {
        println(item)
    }
}