object main extends App{
    def getStudent():(String, Int, String) = {
    val name = scala.io.StdI.readLine("Enter the Name: ");
    print("Enter the mark: ")
    val mark = scala.io.StdIn.readInt()
    (name, mark, grade(mark))
    }

def printRecord(r:(String,Int,String))={
    print("Name\t: %s\n", r._1)
    print("Mark\t: %d\n", r._2)
    print("Grade\t: %s\n", r._3)
    }
    
var Student1 = getStudent()
printRecord(Student1)
}