object Fibonacii {
  def fibonacii(n:Int):Int=
    if(n<=2) 1
    else fibonacii(n-1)+fibonacii(n-2)
  def main(args: Array[String]): Unit = {
    println(fibonacii(10))

  }

}
