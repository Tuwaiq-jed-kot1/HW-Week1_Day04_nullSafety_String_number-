
fun main(){
/// quesstion 1////////
    fun getLength(str: String?):Int {
        return if (str == null) 0 else str.toInt()
    }
    println("the length is ${getLength("3870")} ")
    fun main(args: Array<String>) {
        println(getLength("This is a string!"))
    }

    /////// quesstion 2///////////

    fun main() {

        var old = " The quick brown fox jumps over the lazy dog"
        var new = old.length

        println(old.subSequence(10, 27))
    }

///////  /////// quesstion 3///////////

    fun main(){

        var Fahrenheit :Int? =212
        var Celsius : Double =(5 * (Fahrenheit?.toDouble()!! -32) )/9

        println("the degree in Celsius is $Celsius so you will die soon")

    }







}
