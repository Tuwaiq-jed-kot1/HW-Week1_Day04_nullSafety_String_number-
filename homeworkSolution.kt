//Part|
fun main(){
    fun getLength(str: String?) : Int {
        val l = if (str != null) str.length else 0
        }//null check

        return str.length;
    }

    fun main(args: Array<String>) {
        println(getLength('This is a string!'))
    }
}
//end Part|




//Part||
fun main(){
    val str = "The quick brown fox jumps over the lazy dog"
    val str2 = str.substring(str.indexOf("brown"),str.indexOf("over"))
    println(str2)
}
//end Part||




//Part|||
fun main() {
    val f: Double? = "212".toDoubleOrNull()
    try {
        val c = ((5 * (f!! - 32)) / 9)
        println("$f degree Fahrenheit is equal to $c in Celsius.")
    } catch (e: Exception) {
        println("Your error is: $e")
    }
}
//end Part|||