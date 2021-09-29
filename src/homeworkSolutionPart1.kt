fun main() {


//                       Part I - Null Safety.

    fun main() {


        println("Question 1 \n")

        //----------------------------------Solution1-----------------------------------------
        var str: String? = "albasil"


        fun getLengthName() {

            if (!str.isNullOrEmpty()) {
                println("length str is:${str!!.length}")
            } else {

                print("The str is null" + 0)
            }
        }

        getLengthName()


        //----------------------------------Solution 2-----------------------------------------


        str = null


        val lengthName: Int = str?.length ?: 0

        println(lengthName)


        //----------------------------------Solution 3-----------------------------------------


        str = "ail"

        if (str != null) {
            println("length str is:${str.length}")
        } else {

            println("The str is null  " + 0)

        }



        //                       Part II - Strings.

        println("Question2 \n")

        println("Please enter message \u2764 ...")

        var message: String? = readLine()!!


        //--------------------------------Soluetion 1------------------------

        try {
            println("substring : ${message!!.substring(4, 9)}")
            println("message length : ${message.length}")


        } catch (e: Exception) {

            println("0")
        }


        //--------------------------------Soluetion 2------------------------
        if (message != null) {

            println(" \n \n substring : ${message!!.substring(4, 6)}")

            println(" split :${message.split(" ")}")

        } else {

            println(0)
        }
    }