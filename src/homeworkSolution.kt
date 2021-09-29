/*
Name : Husam Talal Metro
Homework : HW , Week 1 , Day 04
 */
fun main() {
    // Question 1 We called the method twice one with string , the other with null
    println("str = (This is a string!) , result = ${getLength("This is a string!")}")
    println("str = null , result = ${getLength(null)}")
    // println To separate between the answers
    println()
    // Question 2 :: note :: the method can be called by 2 parameters (str , startIndex) or by 3 parameters (str, startIndex, endIndex)
    println(getSubstring("The quick brown fox jumps over the lazy dog", 10, 25))
    println() // added line so the answers appear clearer
    println(getSubstring("The method can be called by 2 parameters (str , startIndex) with default value for endIndex = str.length ",
        27))
    // println To separate between the answers
    println()
    // Question 3 calling the function fahrenheitToCelsius to print the celsius value from fahrenheit
    fahrenheitToCelsius(212.0)
    fahrenheitToCelsius(180.0)
    fahrenheitToCelsius(null)
}


// Q1 Function
fun getLength(str: String?): Int {
    // Solved in one Line which actually Amazing!! from Kotlin
    return str?.length ?: 0
}

// Q2 Function :: note :: the method can be called by 2 parameters (str , startIndex) and by 3 parameters (str, startIndex, endIndex)
fun getSubstring(originalStr: String, startIndex: Int, endIndex: Int = originalStr.length): String {
    // all types of errors are handled here and solved without causing an Exception
    if (startIndex < 0 || startIndex > originalStr.length || startIndex > endIndex) {
        return "-- Error 1 -- The start index = $startIndex , cannot be less than 0 , or greater than the length = ${originalStr.length} , or higher than the end index = $endIndex"
    } else if (endIndex > originalStr.length) {
        return "-- Error 2 -- The end index = $endIndex , cannot be greater than the length of the String = ${originalStr.length}"
    }
    println("old = $originalStr")
    return "new = ${originalStr.substring(startIndex, endIndex)}"
}

// Q3 Function
fun fahrenheitToCelsius(fara: Double?) {
    // I used the if option for handling the null because I have more than one line to execute
    if (fara != null) {
        val c = (5 * (fara - 32)) / 9
        return println("$fara degree Fahrenheit is equal to ${"%.2f".format(c)} in Celsius.")
        // I used format to reduce the number after the decimal point
    }
    // If null is used it will indicate the Error for the user
    println("-- Error -- Your Fahrenheit value is null , Please use a Double value")
}