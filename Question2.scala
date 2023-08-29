class Rationals(numerator: Int, denominator: Int) {
    require(denom != 0)

    def numer: Int = numerator
    def denom: Int = denominator

    def neg: Rationals = new Rationals(-numer, denom)

    def sub(other: Rationals): Rationals = {
        val newNumerator = numer * other.denom - other.numer * denom
        val newDenominator = denom * other.denom
        new Rationals(newNumerator, newDenominator)
    }

    override def toString: String = {
        val gcdValue = gcd(numer, denom)
        s"${numer / gcdValue}/${denom / gcdValue}"
    }

    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }
}

object RationalNumbers2 {
    def main(args: Array[String]): Unit = {
        val x = new Rationals(3, 4)
        val y = new Rationals(5, 8)
        val z = new Rationals(2, 7)

        val result = x.sub(y).sub(z)

        println(result)
    }
}