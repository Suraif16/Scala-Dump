object main extends App
{
    def gcd(a: Int, b: Int): Int = b match{
        case 0 => a
        case x if x>a => gcd(x, a)
        case x => gcd(x, a%x)
    }

    println(gcd(15,35))

    }
