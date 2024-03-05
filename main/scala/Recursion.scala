object Recursion {
  def sumofnumber(n: Int): Int=
    if(n==0) 0
    else {
      n + sumofnumber(n - 1)
    }

  def main(args: Array[String]): Unit = {
    println(sumofnumber(20))

  }

}
