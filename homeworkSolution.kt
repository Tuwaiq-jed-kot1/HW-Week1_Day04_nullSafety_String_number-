//Part| -function
fun getLength(str: String?) : Int {
    // Add null check here
    if (str != null) {
        return str.length
    }else return 0
}
fun main() {
    //part| -function call
    println(getLength("This is a string!"))

    //part||
    val str = "The quick brown fox jumps over the lazy dog"
    val str2 = str.substring(str.indexOf("brown"),str.indexOf("over"))
    println(str2)

    //part|||
    val f: Double? = "212".toDoubleOrNull()
    try {
        val c = ((5 * (f!! - 32)) / 9)
        println("$f degree Fahrenheit is equal to $c in Celsius.")
    } catch (e: Exception) {
        println("Your error is: $e")
    }
}
