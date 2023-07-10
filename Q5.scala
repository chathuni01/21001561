object SumEvenNumbers {
    def main(args: Array[String]): Unit = {
        println("Please enter a number: ")
        val number = scala.io.StdIn.readInt()
        println(s"Sum of even numbers less than $number:" + sumEven(number))
    }

    def sumEven(n: Int): Int = {
        if (n <= 2) {
            0
        } else {
            val previousSum = sumEven(n - 2)
            if (n % 2 == 0) {
                n - 2 + previousSum
            }
            else { 
                previousSum
            }
        }
    }
}
