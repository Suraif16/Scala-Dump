object main extends App
{
    def fibonacci(n: Int): Int = n match {
    case x if x == 0 => 0
    case x if x == 1 => 1
    case x => fibonacci(x-1) + fibonacci(x-2)
}

    var value: Int = fibonacci(12)
    println(value)
}
