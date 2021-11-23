// PART ONE
/*
## Part I - Null Safety.
In the code below, add an if statement to the beginning of getLength that returns zero if str is null
fun getLength(str: String?): Int {
    // Add null check here

    return str.length;
}

fun main(args: Array<String>) {
  println(getLength('This is a string!'))
}
*/

fun main() {

    println(getLength("This is a string"))
}

fun getLength(str: String?) : Int {
    var int:Int=0
    // Add null check here
    if (str != null) {
        int = str.length
    }
    return int
}
// END OF PART ONE





//PART TWO
/*
## Part II - Strings.
Write a Kotlin program to get a substring of a given string between two specified positions.
Sample Output:
old = The quick brown fox jumps over the lazy dog.
new = brown fox jumps.
*/

// Part II Solution
fun main(){
    var old:String = "The quick brown fox jumps over the lazy dog"
    println(old)
    println(old.substring(10,25))
}
// END OF PART TWO





// PART THREE
/*
## Part III - Numbers.
Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
Input a degree in Fahrenheit: 212 Or Null
Use this equation:
C = (5 (F-32)) / 9.

Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius.*/
fun main() {

    println(fahToCel(212))
}
fun intFahToCel(fah:Int?) {
    var cel = 0.0
    if (fah != null) {
        cel = ((5.0 * (fah - 32)) / 9)

        println("${fah.toDouble()} degree in Fahrenheit is equal to $cel in Celsius.")
    }
    else println("$fah is null, operation can't be done.")
}
// END OF PART THREE
