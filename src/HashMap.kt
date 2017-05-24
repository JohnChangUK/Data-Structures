fun main(args:Array<String>){

    var map = HashMap<Int, String>()
    map.put(1, "John")
    map.put(2, "James")
    map.put(3, "Mark")

    println(map.get(1))

    map.put(12, "John Chang")
    for(k in map.keys) {
        println(map.get(k))
    }
}