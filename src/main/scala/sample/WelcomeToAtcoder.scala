package sample

object WelcomeToAtcoder extends App {
  var a = readInt
  var num = readLine
  var s = readLine
  var sum = a + num.split(" ")(0).toInt + num.split(" ")(1).toInt
  println(sum + " " + s);
}