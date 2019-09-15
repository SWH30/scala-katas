package workshop.codekata

object FizzBuzz {
  def getResult(i: Int): String =
    i % 3 -> i % 5 match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => i.toString
    }
}
