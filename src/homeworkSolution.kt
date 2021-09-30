//-------------------------------------## Part I - Null Safety----------------------------------
fun getLength(str: String?): Int {
    // Add null check here
    if (str == null) {
        //returns zero if str is null
        return 0
    }
    return str.length;
}


//-------------------------------------## Part II - Strings-------------------------------------
//subStr() is a function that returns a substring of a given string depends on the existing spaces in the given string.

fun subStr(oldStr: String?) {
//check if the String is not Null and has 4 spaces or more.
    if (oldStr != null && oldStr.filter { it == ' ' }.count() > 3) {
        val newStr = oldStr.substring(oldStr.indexOf(' '), oldStr.lastIndexOf(' '))
        subStr(newStr)

    } else {
        println("new = $oldStr.")
    }
}

//-------------------------------------## Part III - Numbers-------------------------------------
//tempFToTempC() is a function that takes temperature degree and convert it from Fahrenheit to Celsius degree.
fun tempFToTempC(tempF: Float?) {
    if (tempF != null) {
        val tempC: Float = (5 * (tempF - 32)) / 9
        println("${"%.1f".format(tempF)} degree Fahrenheit is equal to $tempC in Celsius.")
    }
}

fun main() {


    println(getLength("This is a string!"))
    tempFToTempC(212.0f)
    val str = "The quick brown fox jumps over the lazy dog"
    println("old = $str")
    subStr(str)
}