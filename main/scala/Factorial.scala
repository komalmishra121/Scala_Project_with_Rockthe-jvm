object Factorial {
  def factorial(n:Int):Int= {
    if(n<=0) 0
    else if(n==1) 1
    else n*factorial(n-1)
  }

  def main(args: Array[String]): Unit = {
    println(factorial(6))

  }

}
