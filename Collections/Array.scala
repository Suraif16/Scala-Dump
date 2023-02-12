object main extends App
{
    var n = Array(10, 20, 30)
    print(n(0))

    var m : Array[Int] = new Array[Int](10)
    var printString: String = m.mkString(" , ")
    print("\n" + printString)
}