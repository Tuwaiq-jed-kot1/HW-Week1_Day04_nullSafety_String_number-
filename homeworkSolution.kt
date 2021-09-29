fun main() {
    // In the code below, add an `if` statement to the beginning of `getLength` that
    //returns zero if `str` is null:

    fun getLength(str: String?): Int {
        // Add null check here
        var l = if (str != null) str.length else 0

        return l
    }

    println(getLength(null))
    println(getLength("This is a string!"))

    //  Part II - Strings.
    // Write a Kotlin program to get a substring of a given string between two specified positions.
    fun GetSubString(str: String, n1: Int, n2: Int): String {


        var str2: String = str.substring(n1, n2)

        return str2
    }

    println(GetSubString("Nadia Ali Almarashi", 0, 6))

    // Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
   //  Input a degree in Fahrenheit: 212 Or Null
  //Use this equation: ->> C = (5 (F-32)) / 9.
    fun temperature(num: Int?): Int {
        val Celsius: Int
        if (num != null)

            Celsius = 5 * (num - 32) / 9 else

            Celsius = 0

        return Celsius
    }
    println("degree Fahrenheit is equal to in Celsius:_" + temperature(null))
    println("degree Fahrenheit is equal to in Celsius:_" + temperature(600))
}
