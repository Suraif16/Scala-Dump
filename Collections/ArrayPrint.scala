object main extends App
{
    def printA(x: Array[Int]): Any = if(!x.isEmpty)
    {
    println(x.head);
    printA(x.tail)
    }
}