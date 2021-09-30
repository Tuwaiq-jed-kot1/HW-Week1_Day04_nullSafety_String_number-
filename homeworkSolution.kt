fun main(){
    ## Part I - Null Safety.
    In the code below, add an if statement to the beginning of getLength that returns zero if str is null:

    fun getLength(str: String?) : Int {
        // Add null check here

        return str.length;
    }

    fun main(args: Array<String>) {
        println(getLength('This is a string!'))
    }

     ##part 1 Solution:
    if (getLength() = null{
        println("zero")
        }else{
        println("this is a string")
    }

    ## Part II - Strings.
    Write a Kotlin program to get a substring of a given string between two specified positions.
    Sample Output:
    old = The quick brown fox jumps over the lazy dog
    new = brown fox jumps.

    ## Part II -Solution
    var old:String = "The quick brown fox jumps over the lazy dog."
    println(old.substring(10..25))


    ## Part III - Numbers.
    Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
    Input a degree in Fahrenheit: 212 Or Null
    Use this equation:
    C = (5 (F-32)) / 9.

    Expected Output:
    212.0 degree Fahrenheit is equal to 100.0 in Celsius.
.toFloaor

    ## Part III Solution
    //I couldn't get the right result
    //first idea
    val f="212".toDoubleOrNull() ?: 212.0
    val c:Double= (5 * (f-32)) / 9
    println(5*(f-32)/9)
    println("$f degree Fahrenheit is equal to $f in Celsius" )
    //seceond idea
    val f="212".toDoubleOrNull() ?: 212
    val c= (5 * (f-32)) / 9
    val result =(c.toDouble())
    println("$f degree Fahrenheit is equal to $result in Celsius" )

}