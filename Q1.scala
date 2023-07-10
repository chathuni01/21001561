object PrimeChecker { 
  def main(args: Array[String]): Unit = {
    println("Please enter a number: ")
    val number = scala.io.StdIn.readInt()
    println("The number you entered is a prime number: " + prime(number))
  }

  def prime(n: Int): Boolean = {
    if (n <= 1) {
      false
    }
    else {
      def isDivisibleBy(i: Int): Boolean = {
        if (i <= 1) {
          true       // If we reach 1, the number is prime
        }
        else if (n % i == 0) {
          false      // If n is divisible by i, it's not prime
        }
        else {
          isDivisibleBy(i - 1)
        }
      } 

      // Start checking divisibility from n-1
      isDivisibleBy(n - 1)
    }
  }
}