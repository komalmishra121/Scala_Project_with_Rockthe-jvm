/*object LeapYear {
  def main(args: Array[String]): Unit = {
    var year: Int=2005
    if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
      println("leap year")
    }
    else{
      println("NotLeap")
    }
  }
}

*/

// Nested if statement
object Test
{
  def main(args: Array[String])
  {
    var a: Int = 10;

    if(a % 2 == 0)
    {
      if(a % 5 == 0)
      {
        println("Number is divisible by 2 and 5\n")
      }
    }
  }
}