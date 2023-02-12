object main extends App
{
    def ReadA( i :Int) : Array[Int] = {
        if(i<1) Array()
        else
            {
                println("Enter> ")
                Array(scala.io.StdIn.readInt()) ++ReadA(i-1)
            }
    }
    var marks = ReadA(4)

    def printA(x: Array[Int]): Any = if(!x.isEmpty)
    {
        println(x.head);
        printA(x.tail)
    }

    printA(marks)

    def add(x:Array[Int]): Int = if(x.isEmpty) 0 else
        x.head + add(x.tail)
        
}