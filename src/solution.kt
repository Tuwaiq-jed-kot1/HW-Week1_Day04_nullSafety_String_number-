///     _______________\   Part 1   /_______________\ Solution 1 /_______________
fun getLength(str: String?) {
    if (str == null ){
        println("Zero")
    }else {
        println(str.length)
    }

}
fun main() {
    getLength("This is a string!")
    println(" \n\nsolved by Faisal Alharthi ")
}


///      _______________\   Part 1   /_______________\ Solution 2 /_______________
fun getLength(str: String?) {

    str == null

    val numberOfName: Int = str?.length ?: 0

    println(numberOfName)
}
fun main() {
    getLength("This is a string!")
    println(" \n\nsolved by Faisal Alharthi ")
}


////////////////////////////////////////////////////////////////////////////////////////////////////




///      _______________\   Part 2   /_______________\ Solution 1 /_______________
fun main(){
    val line = "The quick brown fox jumps over the lazy dog"
    println(line.substring(9,25))
    println(" \n\nsolved by Faisal Alharthi ")
}



////////////////////////////////////////////////////////////////////////////////////////////////////




///      _______________\   Part 3   /_______________\ Solution 1 /_______________

fun main() {

    println("\nenter fahrenheit degree to convert to Celsius: ")



    val f : Int =  Integer.valueOf(readLine())

    try {

        var c = ((5 * (f.toDouble()- 32)) / 9)
        println(" Celsius degree is ${"%.2f".format(c)}")

    }

    catch (e: Exception) {
        print(e)
    }
    println(" \nsolved by Faisal Alharthi ")
}

