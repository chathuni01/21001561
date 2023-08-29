class Rational(numerator: Int, denominator: Int) {
    require(denominator != 0)

    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = {
        val gcdValue = gcd(numerator, denominator)
        s"${numerator / gcdValue}/${denominator / gcdValue}"
    }

    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }
}

object RationalNumbers1 {
    def main(args: Array[String]): Unit = {
        val x = new Rational(1, 2)
        val y = x.neg

        println(y)
    }
}
