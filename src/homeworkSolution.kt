fun main(){

    //---------------------------------------------------------//
    //Part1//
    fun getLength(str: String?) : Int {

        //First we create a variable and assign null to them
        var checkNull : String? = null
        //Then, use an if statement to determine the nullabilty of str
        if(!checkNull.isNullOrEmpty()){
            println("This is not a null")

        }else{
            println(0)

        }
        //Finally, after returning 0 if its null we also return the length of the string which is 17
        return str!!.length
    }

    println(getLength("This is a string!"))


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