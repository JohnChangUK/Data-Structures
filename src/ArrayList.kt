fun main(args:Array<String>) {

    var arraylist = ArrayList<String>()
    arraylist.add("John")
    arraylist.add("James")
    arraylist.add("Mark")
    arraylist.add("Chelsea")

    println("First name: " + arraylist.get(0))
    arraylist.set(0, "John Chang")

    println(" all Elements by Object")

    for (item in arraylist) {
        println("item: " + item)
    }

    println(" All elements by Index")
    // size - 1 because we want the size but index MINUS 1
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    if (arraylist.contains("James")) {
        println(" The name is found")
    } else {
        println("Name NOT Found")
    }
}