object Q_1 {
    def main(args: Array[String]) = {
        println("Enter the radius of the disk:")
        val radius = scala.io.StdIn.readDouble()
        println("The area of the disk: " + diskArea(radius))
    }

    import scala.math.Pi 
    def diskArea(radius: Double): Double = {
        Pi * radius * radius 
    }
}