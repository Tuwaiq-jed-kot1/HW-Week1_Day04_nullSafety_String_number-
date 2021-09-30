fun main(){

    //---------------------------------------------------------//
    //Part1 - Recoded(NEW!!)//

    fun getLengthName() {
        val str: String? = "Second time is the charm"

        if (!str.isNullOrEmpty()) {
            println("The length of the sentence is:${str!!.length}")
        } else {

            print("This sentence is null" + 0)
        }
    }

    getLengthName()


    //---------------------------------------------------------//
    //Part2//

    //We create a function called quote to substring the sentence and return string
    fun quote():String{
        var sentence = "The quick brown fox jumps over the lazy dog"
        return(sentence.substring(9,25))
    }
    //We call the function to print the altered phrase
    println(quote())


    //---------------------------------------------------------//
    //Part3//

    //There are 2 solutions for it, this one directly or by calling a function
    //The question asks if the value is either 212 or null, so we make it nullable by using strict operator !!
    val fahrenheit:Double? = 212.0
    val celsius: Double? = (5*(fahrenheit!! -32))/9
    print("$fahrenheit degree Fahrenheit is equal to $celsius in Celsius.")


    //The other solution is using a function then calling it back
    //    fun tempreture(fahrenheit:Double):Double{
    //        var celsius:Double = (5*(fahrenheit-32))/9
    //        return celsius
    //    }




}