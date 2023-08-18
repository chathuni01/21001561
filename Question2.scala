object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    println("Please provide an integer input.")
    val input = scala.io.StdIn.readInt()
    println("The integer you've input is " + message(input))
  }

  val message: Int => String = num => num match {
    case num if num <= 0 => "Negative or Zero"
    case num if num % 2 == 0 => "an Even number"
    case num => "an Odd number"
  }
}