import scala.io.StdIn

object Tutorial10_Q2 {
  def main(args: Array[String]): Unit = {
    val wordCount = getUserWordCount()
    val strList: List[String] = getUserInputWords(wordCount)
    println("Total count of letter occurrences: " + countLetterOccurrences(strList))
  }

  def getUserWordCount(): Int = {
    println("Enter the number of words:")
    val wordCount = StdIn.readInt()
    wordCount
  }

  def getUserInputWords(wordCount: Int): List[String] = {
    println(s"Enter those $wordCount words:")
    val strList = List.fill(wordCount)(StdIn.readLine())
    strList
  }

  def countLetterOccurrences(strList: List[String]): Int = {
    val strList_lengths = strList.map(str => str.length())
    val totalLength = strList_lengths.reduce((x, y) => x + y)
    totalLength
  }
}
