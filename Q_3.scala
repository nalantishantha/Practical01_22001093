object Q_3{
    def main(args : Array[String]) = {
        println("Enter radius of sphere : ")
        val radius = scala.io.StdIn.readDouble()
        println("The volume of the sphere : " +  sphereVolume(radius))
    }
    import scala.math.Pi 
        def sphereVolume(radius: Double): Double = {
            var volume : Double = 0
            volume = 4/3 * Pi * radius * radius *radius
            return volume
        }

}