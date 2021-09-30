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
fun fahToCel(fahD:Int?){
    val fahrenheit:Int? = fahD
    if (fahrenheit!=null)
    var celsius:Double = (5.0 *(fahrenheit.toDoubleOrNull() ?:991) - 32.0) / 9.0

    println("$fahrenheit degree Fahrenheit is equal to $celsius in Celsius.")
}
// END OF PART THREE
