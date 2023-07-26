object SumCalculator {
    def main(args: Array[String]): Unit = {
        println("Please enter a number: ")
        val number = scala.io.StdIn.readInt()
        println(s"Addition of from 1 to $number: " + sum(number))
    }

    def sum(n: Int): Int = {
        if (n <= 0) {
            0 // Base case: When n is 0 or negative, return 0
        }
        else {
            n + sum(n - 1) // Recursive case: Add n to the sum of numbers from 1 to n-1
        }
    }
}
