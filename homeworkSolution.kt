fun main(){

    //q1
    fun getLength(str: String?) : Int{
        val l: Int = str?.length ?: 0
        return(l)


    }
    println(getLength("This is a string!"))

    //q2
        val sentence: String = " The quick brown fox jumps over the lazy dog."
        var dot = sentence.substring(sentence.length-1)
        println(sentence)
        println(sentence.substring(10,26).plus(dot))

    //q3
    val f: Double = "212.0".toDoubleOrNull()?: -1.0
    var c: Double =(5 *(f-32)) / 9

    try{
        println("$f degree Fahrenheit is equal to ${"%.1f".format(c)} in Celsius ")
    }catch (e: Exception){
        println(e)
    }

}