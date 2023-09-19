import scala.io.StdIn

object LetterCounter {
    def main(args: Array[String]): Unit = {
        val wordCount = getUserWordCount()
        val words: List[String] = getUserInputWords(wordCount)
        println("Total count of letter occurrences: " + countLetterOccurrences(words))
    }

    def getUserWordCount(): Int = {
        println("Enter the number of words:")
        val wordCount = StdIn.readInt()
        wordCount
    }

    def getUserInputWords(wordCount: Int): List[String] = {
        println(s"Enter those $wordCount words:")
        val words = List.fill(wordCount)(StdIn.readLine())
        words
    }

    def countLetterOccurrences(words: List[String]): Int = {
        val letterCounts = words.map(word => word.length)
        val totalLetterCount = letterCounts.reduce(_ + _)
        totalLetterCount
    }
}
