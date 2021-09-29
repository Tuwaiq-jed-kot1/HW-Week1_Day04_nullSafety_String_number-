//Q1
fun main (){
        val b: String? = null
        if (b != null && b.length > 0) {
                print("String of length ${b.length}")
        } else {
                print("zero")
 }
//Q2
fun main(){
        var sentence = " The quick brown fox jumps over the lazy dog "
        var newSentence = sentence.substring(11,27)
        println(newSentence) // انا جلست اعد عشان اعرف القيم اللي اكتبها ونا عارفة انو غلط بس ماعرفت كيف
}
//Q3
fun main () {
        var F = "212.0".toDoubleOrNull()?: "Null"
        var c:Double = (5 * (F-32)/9) //  الناقص يطلعلي ايرور ماعرفت السبب
        println("$F Fehrenheit is  $c in celsius")
}