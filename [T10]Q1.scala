import scala.io.StdIn

object Tutorial10_Q1 {
  def main(args: Array[String]): Unit = {
    println("Number of temperature values:")
    val numTemps = StdIn.readInt()

    println(s"What are those $numTemps temperature values in Celsius:")
    val tempList: List[Double] = List.fill(numTemps)(StdIn.readDouble())

    println("Average Fahrenheit Temperature = " + calculateAverage(tempList))
  }

  val celciusToFahrenheit = (tempList: List[Double]) => { tempList.map(temp => temp * 1.8 + 32) }

  val totalTemp = (tempList: List[Double]) => {
    tempList.reduce((x, y) => x + y)
  }

  def calculateAverage(tempList: List[Double]): Double = {
    val sizeOfList = tempList.size
    val fahrenheitTempList = celciusToFahrenheit(tempList)
    val totalFahrenheitTemp = totalTemp(fahrenheitTempList)
    totalFahrenheitTemp / sizeOfList.toDouble
  }
}
