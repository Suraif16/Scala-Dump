object main extends App
{
def power(x: Int, y: Int): Int = y match {
    case 0 => 1 
    case _ => x * power(x, y-1)
}
println(power(3,5))
}