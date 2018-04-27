package sample

object Product extends App {
  val line = scala.io.StdIn.readLine()
  val num1 = line.split(" ")(0).toInt
  val num2 = line.split(" ")(1).toInt

  if (num1 * num2 % 2 == 0) println("Even")
  else println("Odd")
}
