

/## Part I - Null Safety.
//In the code below, add an if statement to the beginning of getlength that returns zero if str is null.

fun main(){
    fun getLength(str: String?) : Int {
        val l = if (str != null) str.length
        else 0
    }
}
return str.length;
}

fun main(args: Array<String>) {
    println(getLength('This is a string!'))
}
}


//Part II - Strings.
//Write a kotlin program to get a substring of a given string between specified positions.

Sample out in the slide:
fun main(){
    val str = "The quick brown fox jumps over the lazy dog"
    val str2 = str.substring(str.indexOf("brown"),str.indexOf("over"))
    println(str2)
}
Or this Sample the same:
fun main(){
    val str1 = " The fast white Rabbit is not caught by a lazy person."
    val str2 = str1.substring(str1.indexOf("white Rabbit"),str1.indexOf("not caught "))
    println(str2)
}

## Part III - Numbers.
//Program to convert temperature from Fahrenheit to Celsius in Kotlin?
package com.includehelp

import java.util.*

//Main Function , Entry point of Program
fun main(args: Array<String>) {

    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input temperature in Fahrenheit
    print("Enter temperature into Fahrenheit : ")
    val fahrenheit = scanner.nextDouble()

    //Convert  Fahrenheit to Celsius
    val celsius =( (fahrenheit  -  32  ) *  5)/9

    //Print temperature in Celsius
    println("Temperature in Fahrenheit ($fahrenheit) = Celsius ($celsius)")
}