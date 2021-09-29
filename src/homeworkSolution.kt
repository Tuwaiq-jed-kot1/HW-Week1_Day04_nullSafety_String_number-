//Solution Part I - Null Safety.

fun getLength(str: String?) : Int {
    // Add null check here

    val l = if (str != null ) str.length else -1
    if (str != null && str.length > 0)

        println("str of length ${str.length}")
// if str is null
    else { println(" is zero") }



    return str!!.length
}

fun main(args: Array<String>) {


    println(getLength("This is a string!"))

    // Part II - Strings.
    var sentance = "The quick brown fox jumps over the lazy dog."
    print(sentance.substring(10, 25))

    // Part III - Numbers.

    val f = 212.0
    val c = (5 *(f - 32)) / 9

    println("\n ${"%.1f".format(f)} degree Fahrenheit is equal to $c in Celsius ")

}

