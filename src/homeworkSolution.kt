fun main(args: Array<String>) {
    println(getLength("This is a string!"))
    println("-----------------------------------------------------")
    substringToAnyText("Kotlin is a general purpose, free, open source," +
            " statically typed “pragmatic” programming language" +
            " initially designed for the JVM (Java Virtual Machine) " +
            "and Android that combines object-oriented and functional",26,220)
    println("-----------------------------------------------------")
    convertFromFahrenheitToCelsius(120.0)
}

//Part 1 - Null Safety.
fun getLength(str: String?) : Int {
    // Add null check here
    if(str == null){
        return 0
    }else{
        return str.length;
    }
}

// Part 2 - Strings.
fun substringToAnyText(text:String ,firstIndex:Int,secondindex:Int):Unit{
    try{
        var newText : String = text.substring(firstIndex,secondindex)
        println(newText)
    }catch(e: Exception){
        println("Your text is null")
    }
}

//Part 3 - Numbers.
fun convertFromFahrenheitToCelsius(fTemp:Double):Unit{
    var cTemp = (5*(fTemp-32))/9
    println("$fTemp degree Fahrenheit is equal to $cTemp in Celsius.")
}