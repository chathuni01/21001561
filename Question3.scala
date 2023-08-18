object StringFormattingExample {
  val toUpper: String => String = (input: String) => input.toUpperCase()

  val toLower: String => String = (input: String) => input.toLowerCase()

  val formatNames: (String, Int) => String = (name, index) => {
    val charToChange = name.charAt(index)
    val charModified = charToChange.toUpper
    name.patch(index, charModified.toString, 1)
  }

  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }
}