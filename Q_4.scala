object BookWholesaleCost {
    def main(args: Array[String]) = {
        println("Enter the number of copies:")
        val numberOfCopies = scala.io.StdIn.readInt()

        val coverPrice = 24.95
        val discount = 0.40
        val shippingFirst50 = 3.00
        val shippingAdditional = 0.75

        val discountedPrice = coverPrice * (1 - discount)
        
        val totalDiscountedPrice = discountedPrice * numberOfCopies
        
        val totalShippingCost = if (numberOfCopies > 50) {
            shippingFirst50 + (numberOfCopies - 50) * shippingAdditional
        } 
        else {
            shippingFirst50
        }

        val totalWholesaleCost = totalDiscountedPrice + totalShippingCost

        println(f"The total wholesale cost for $numberOfCopies%d copies is Rs. $totalWholesaleCost%.2f")
    }
}
