import java.io.FileWriter

fun main(args:Array<String>) {

    print("Write to File Text: ")
    var str:String = readLine().toString()
    WriteToFile(str)
}

fun WriteToFile(str:String){
    try {
        var fo = FileWriter("test.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch(ex: Exception){
        print(ex.message)
    }
}