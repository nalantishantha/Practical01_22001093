object Q_2 {
    def main(args : Array[String]) = {
        println("Enter the temperature in Celsius:")
        val Cel = scala.io.StdIn.readDouble()
        println("Value of fahrenheit : " + Temperature(Cel))
    }

    def Temperature(Cel : Double) : Double = {
        var F : Double = 0
        F = Cel*1.8 + 32.00
        return F
    }
}