object PrimeSequence {
    def main(args: Array[String]): Unit = {
        println("Please enter a number: ")
        val number = scala.io.StdIn.readInt()
        println(s"Prime numbers less than $number:")
        primeSeq(number)
    }

    def primeSeq(n: Int): Unit = {
        def isPrime(num: Int, divisor: Int): Boolean = {
            if (divisor <= 1) {
                true
            } else if (num % divisor == 0) {
                false
            } else {
                isPrime(num, divisor - 1)
            }
        }

    if (n > 2) {
        primeSeq(n - 1)
        if (isPrime(n, n - 1)) {
            println(n)
        }
    }
    else if (n == 2) {
        println(n)
    }
  }
}
