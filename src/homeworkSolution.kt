// HW_Week1_Day4_StringsAndNumbers 😃 ..


fun main(args: Array<String>) {
    println(getLength("This is a string!"))
    println("-----------------------------------------------------")
    substringToAnyText("King Faisal bin Abdulaziz was a visionary innovator with a great respect for tradition. " +
            "He initiated the first of a series of economic and social development plans that would transform Saudi Arabia’s infrastructure," +
            " especially industry, and set the Kingdom on a path of rapid growth. He also established the first public schools" +
            " for girls. In foreign policy, King Faisal showed a firm commitment to the Islamic world. He was a central force behind" +
            " the establishment in Jeddah in 1971 of the Organization of the Islamic Conference (OIC), a group of 56 Islamic countries" +
            " that promotes Islamic unity and cooperation. Throughout the turbulent period of the 1960s and 1970s," +
            " which included two Arab-Israeli wars and the oil crisis of 1973, King Faisal was a voice for moderation, " +
            "peace and stability.",26,220)
    println("-----------------------------------------------------")
    convertFromFahrenheitToCelsius(120.0)
}

                            //Part I - Null Safety.
//This function tells you the length of any string, And it checks first if it's null.
fun getLength(str: String?) : Int {
    // Add null check here
    if(str == null){
        return 0
    }else{
        return str.length;
    }
}

                            // Part II - Strings.
//This function will print a substring from any string when you give it two specified positions.
fun substringToAnyText(text:String ,firstIndex:Int,secondindex:Int):Unit{
    try{
        var newText : String = text.substring(firstIndex,secondindex)
        println(newText)
    }catch(e: Exception){
        println("Your text is null")
    }
}

                            //Part III - Numbers.
//This function will receive a Fahrenheit degree then it will convert it to Celsius degree and print it to the console
fun convertFromFahrenheitToCelsius(fTemp:Double):Unit{
    var cTemp = (5*(fTemp-32))/9
    println("$fTemp degree Fahrenheit is equal to $cTemp in Celsius.")
}