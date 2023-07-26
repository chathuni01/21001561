object Fibonacci {
    def main(args: Array[String]): Unit = {
        println("Please enter a number: ")
        val n = scala.io.StdIn.readInt()
        println(s"First $n Fibonacci numbers: " + printFibonacci(n))
    }

    def printFibonacci(n: Int): String = {
        val fibonacciNumbers = for (i <- 0 to n-1) yield fibonacci(i)
        fibonacciNumbers.mkString(" ")
    }

    def fibonacci(n: Int): Int = {
        if (n <=1) {
            n
        } else {
            fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}
