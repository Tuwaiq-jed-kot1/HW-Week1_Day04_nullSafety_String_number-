
// part1-null safety

fun main(args: Array<String>){
    println(getLength("This is a string!"))
}

fun getLength(str: String?) : Int {
    if(str == null){
        return 0
    }
    else{
        return str.length;
    }
}

// part2-String

fun main(){
    val str = "The quick brown fox jumps over the lazy dog"
    println(str.substring(0..42))
    println(str.substring(10..24))
}


//part3-numbers

fun main(){
    val f:Double?= 212.0
    val c:Double? = (5  *(f!!- 32 ))/9
    print("$f degree fahrenheit is equal to $c in celsius")
}
