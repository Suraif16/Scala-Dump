import scala.io.StdIn.readLine

object main extends App
{
    def iseven(number: Int): Boolean = 
        number%2 match {
            case 0 => true
            case _ => false
        }
    var Num1 : Int = readLine("Enter the number to check odd or even")    
    var result = iseven()
    if (result == true) print("The Number is Even") else 
        print("The Number is odd")
        
}