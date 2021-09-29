//## Part I - Null Safety.
fun getLength(str: String?) : Int {
    // Add null check here
    if (str == null) return 0;
    return str.length;
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
    println(getLength(null))
}

//===================================================
//## Part II - Strings.
fun main(){
    val str = "This is a string"
    println(substring(str, 0, 5))
}

fun substring(str: String, firstIndex: Int, lastIndex: Int): String{
    return str.substring(firstIndex, lastIndex)
}
//====================================================
//## Part III - Numbers.

fun main(){
    var degreeInFahrenheit: Float? = 212f

    println("${"%.1f".format(degreeInFahrenheit)} degree Fahrenheit is equal to ${"%.1f".format(fahrenheitToCelcius(degreeInFahrenheit))} in Celsius.")
}

fun fahrenheitToCelcius(degreeInFahrenheit: Float?): Float?{
    if (degreeInFahrenheit == null) return null
    return (5 * (degreeInFahrenheit-32)) / 9
}