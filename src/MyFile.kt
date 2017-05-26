import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>) {

    println("1 - Read \n2 - Write \n")
    val op = readLine()!!.toInt()

    when (op){
        1 -> ReadFromFile()

        2 -> {
            print("Write to File Text: ")
            var str:String = readLine().toString()
            WriteToFile(str)
        }
    }

}

fun WriteToFile(str:String){
    try {
        val fo = FileWriter("test.txt", true)
        fo.write(str + "\n")
        fo.close()
        print("Data is Saved!")
    } catch(ex: Exception){
        print(ex.message)
    }
}

fun ReadFromFile(){

    try {
        val fin = FileReader("test.txt")
        var c:Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while (c != -1)

    } catch (ex:Exception) {
        print(ex.message)
    }
}