//      ----->>>> Part 1 <<<<-----
fun getLength(str: String?) {
    if (str == null ){
        println("Zero")
    }else {
        println(str.length)
    }
}
fun main(args: Array<String>) {
    getLength("This is a string!")
}

//      ----->>>> Part 2 <<<<-----
fun main(){
    var str = "The quick brown fox jumps over the lazy dog"
    println(str.substring(9,25))
}

//      ----->>>> Part 3 <<<<-----
fun main() {
    var F  = 212.0
    if (F == null){
        println("i can't do the math:(")
    }
    var c = (5 * (F - 32))/9
    println("$F degree Fahrenheit is equal to $c in Celsius")
}