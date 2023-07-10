object SumCalculator {
    def main(args: Array[String]): Unit = {
        println("Please enter a number: ")
        val number = scala.io.StdIn.readInt()

        if (checkEvenOdd(number)) {
            println("The number you entered is even")
        }
        else {
            println("The number you entered is odd")
        }
    }

    def checkEvenOdd(n: Int): Boolean = {
        if (n == 0) {
        true
        }
        else if (n == 1) {
        false
        }
        else {
            checkEvenOdd(n - 2)
        }
    }
}