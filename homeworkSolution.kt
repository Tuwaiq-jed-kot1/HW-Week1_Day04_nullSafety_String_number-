fun main(args: Array<String>) {
    //part1:
    println(getLength("This is a string!"))
    //part2:
    var sub = "You have to be a dreamer" //the sentence that I want to substring from
    if (sub.length > 20) {
        println("Old: $sub")
        println("New: " + sub.substring(17)) //substring by a chosen number
    } else if (sub.length > 1) {
        println("Old: $sub")
        println("New: " + sub.substring(sub.length - 2, sub.length))  //another way to substring by the length
    } else                                                    //in case of one caracter
        println("The length is too short to substring")

    //part3:
    val fah: Double = 212.0
    val cel = (5 * (fah - 32) / 9)
    if (fah == null) {
        println("null value cannot be converted")
    } else
        println("$fah degree Fahrenheit is equal to $cel in Celsius.")
}

//part1:
fun getLength(str: String?): Int {
    // null check to return 0
    if(str == null) {
        return 0
    } else
        return str.length;
}

