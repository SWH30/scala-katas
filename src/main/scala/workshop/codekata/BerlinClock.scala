package workshop.codekata

object BerlinClock {

  def convertToBerlinTime(time: String): Array[String] = {
    val parts = time.split(":").map(_.toInt)
    Array(
      seconds(parts(2)),
      topHours(parts(0)),
      bottomHours(parts(0)),
      topMinutes(parts(1)),
      bottomMinutes(parts(1))
    )
  }

  def seconds(number: Int): String = if(number % 2 == 0) "Y" else "O"

  def topHours(number: Int): String = onOff(4, topNumberOfOnSigns(number))

  def bottomHours(number: Int): String = onOff(4, number % 5)

  def topMinutes(number: Int): String = onOff(11, topNumberOfOnSigns(number), 'Y').replaceAll("YYY", "YYR")

  def bottomMinutes(number: Int): String = onOff(4, number % 5, 'Y')

  private def onOff(numberOfLamps: Int, onSigns: Int, onSign: Char = 'R'): String =
    new StringBuilder().append(repeatChar(onSign, onSigns)).append(repeatChar('O', numberOfLamps - onSigns)).toString()

  private def topNumberOfOnSigns(number: Int): Int = (number - (number % 5)) / 5

  private def repeatChar(char:Char, n:Int) = List.fill(n)(char).mkString
}
