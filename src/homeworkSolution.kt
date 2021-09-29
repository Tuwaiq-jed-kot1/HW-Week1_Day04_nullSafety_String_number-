import kotlin.NullPointerException

fun main() {
    println("--------------")

    //## Part I - Null Safety.
    //In the code below, add an if statement to the beginning of getLength that returns zero if str is null
    println("\n## Part I")

    println("String length is: ${getLength("This is a string!")}")
    println("--------------")

    println("String length is: ${getLength(null)}")
    println("--------------")

    //## Part II - Strings.
    //Write a Kotlin program to get a substring of a given string between two specified positions.
    println("\n## Part II")

    var old = "The quick brown fox jumps over the lazy dog."
    println(subString(6, 34, old))
    println("--------------")

    println(subString(-4, 34, old))
    println("--------------")

    //## Part III - Numbers.
    //Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
    println("\n## Part III")

    println(fahrenheitToCelsius(212))
    println("--------------")

    println(fahrenheitToCelsius(null))
    println("--------------")
}

//## Part III - Numbers.
fun fahrenheitToCelsius(F: Int?):String {
    try {
        F ?: throw NullPointerException()
        val c: Double = ((5 * (F - 32)) / 9).toDouble()
        return ("${F.toDouble()} degree Fahrenheit is equal to $c in Celsius.")
    } catch (e: NullPointerException) {
        return ("Please enter a valid Fahrenheit degree\n\tError: $e")
    }
}

//## Part II - Strings.
fun subString(index1: Int, index2: Int, old: String): String {
    try {
        var text = "New string is: ${old.substring(index1, index2)}"
        if (text.isEmpty()) text = "Selected text is Empty!"
        return text

    } catch (e: Exception) {
        return ("Please enter valid index numbers\n\tError: $e")

    }
}

//## Part I - Null Safety.
fun getLength(str: String?): Int {
    // Add null check here
    return str?.length ?: 0
}
