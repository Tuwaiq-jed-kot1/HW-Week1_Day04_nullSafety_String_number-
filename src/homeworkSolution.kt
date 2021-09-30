//           P1
fun getLength(str: String?) {

    if(!str.isNullOrEmpty()){
        println("This is a string")
    } else{
        println("It is a nullable")
    }
}
fun main(){
    getLength("Abdulaziz")
}


//           P2

fun main(){

    var sentnce = "The quick brown fox jumps over the lazy dog."
    println(sentnce.substring(10,25))


}


//            P3
fun main(){
    var f : Double = "212.0".toDoubleOrNull()?: -1.0
    var c : Double = (5 * (f-32)) / 9
    println("$f degree Fahrenheit is equal to ${"%.1f".format(c)} in Celsius.")

}