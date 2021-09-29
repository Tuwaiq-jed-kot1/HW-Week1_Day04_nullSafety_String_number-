fun main(){

// Q 1 / function return the length of the String or zero in case of passing null (nullable)
    var getLen :(str:String?)->Int= {str -> str?.length ?: 0}

    println("--- Answer Of Question 2 ---  :${getLen("asmaa")}")
    println("--- Answer Of Question 2 ---  : ${subText("Hello World")}")
    println("--- Answer Of Question 3 ---  : ${convertTemp(212)}")
    println("\n null input")
    println("Q1 -> "+getLen(null))
    println("Q2 -> "+subText(null))
    println("Q3 ->"+convertTemp(null))
}

// Q 2 / function return the first half ot the String using {substring()} (nullable)

fun subText(str:String?):String{
    var a:String =""
    try{
        checkNotNull(str){" invalid input : null"}
        a= str.substring(0,str.length-(str.length/2))

    }catch (e: Exception){
        println(e.localizedMessage)
    }
    return a
}

// Q 3 / function return String template contains the equivalent of fahrenheit degree in celsius  (nullable)

fun convertTemp(feh:Int?):String{

    var textOutput:String=" "
    try {
        if(feh!! >= 32 && feh <=212){
            val clesuis: Double = (5.0 * (feh!! - 32)) / 9
            textOutput ="${"%.1f".format(feh.toDouble())} degree Fahrenheit is equal to ${"%.1f".format(clesuis)} "}

        else return "out of Fahrenheit scale range"

    }catch (e: Exception){
        println("invalid input: null, Exception $e")
    }
    return textOutput
}
