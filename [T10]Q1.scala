import scala.io.StdIn

object TemperatureConverter {
    def main(args: Array[String]): Unit = {
        println("Number of temperature values:")
        val numTemps = StdIn.readInt()

        println(s"What are those $numTemps temperature values in Celsius:")
        val temperatures: List[Double] = List.fill(numTemps)(StdIn.readDouble())

        val averageFahrenheit = calculateAverage(temperatures)

        println(s"Average Fahrenheit Temperature = $averageFahrenheit")
    }

    

    def calculateAverage(temperatures: List[Double]): Double = {
        val fahrenheitTemperatures = temperatures.map(celsiusToFahrenheit)
        val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
        val averageFahrenheit = totalFahrenheit.toDouble / fahrenheitTemperatures.length
        averageFahrenheit
    }

    def celsiusToFahrenheit(celsius: Double): Double = {
        (celsius * 9.0 / 5.0) + 32.0
    }
}
