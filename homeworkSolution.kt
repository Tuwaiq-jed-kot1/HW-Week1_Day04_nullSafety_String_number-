
fun main(args: Array<String>) {
// Part 1 - Call getLength
    println(getLength("This is a string!"))


// Part 2 substring
    val old = "The quick brown fox jumps over the lazy dog."
    var new = old.substring(9,25)
    println(new)

//Part 3 Numbers

    val fahrenheit:Double? =212.0
    val celsius:Double

    if (fahrenheit != null){
        celsius =(((fahrenheit - 32) * 5) / 9)
        println(" ${"%.2f".format(fahrenheit)} degree Fahrenheit is equal to ${"%.2f".format(celsius)} in Celsius")
    }
    else println("The program can't convert to Celsius because fahrenheit is null")

}

//------------------ function ----------------------

// check nullablety and return length of str or -1 if str is null
fun getLength(str: String?) : Int {
    if (str != null) return str.length else return -1
}
