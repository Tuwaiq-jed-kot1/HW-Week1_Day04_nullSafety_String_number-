package Day4.HW4

//                               Part III - Numbers.


fun main() {

    println("Question3 \n")


    println("please enter fahrenheit degree : ")

    var fahrenheitDegree: Int = Integer.valueOf(readLine())


    try {

        var c = ((5 * (fahrenheitDegree.toDouble() - 32)) / 9)


        println("c degree is ${"%.2f".format(c)}")

    } catch (e: Exception) {

        print(e)


    }


}