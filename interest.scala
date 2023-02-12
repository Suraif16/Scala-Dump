object main extends App
{
    def interest(amount: Double): Double = 
        amount match{
            case a if amount <=1000 => a * 0.05
            case a if amount <=10000 => a * 0.06
            case a if amount <=100000 => a * 0.07
            case a if amount <=1000000 => a * 0.08
        }
        
    var interestAmount = interest(10000)
    print(interestAmount)

}