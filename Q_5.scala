object Question {
   
  def main(args: Array[String]): Unit = { 
      val easyPaceDistance1 = 2.0 
      val easyPace = 8.0
      val easyPaceDistance2 = 2.0 
      val tempoDistance = 3.0 
      val tempoPace = 7.0 
      
      val easyPaceTime1 = calculateTime(easyPaceDistance1, easyPace) 
      val tempoTime = calculateTime(tempoDistance, tempoPace) 
      val easyPaceTime2 = calculateTime(easyPaceDistance2, easyPace) 
      
      val totalTime = easyPaceTime1 + tempoTime + easyPaceTime2 
      
      println("Total running time: " + totalTime + " minutes") 
  } 

  def calculateTime(distance: Double, pace: Double): Double = { 
      distance * pace 
    }
} 