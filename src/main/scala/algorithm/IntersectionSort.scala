object IntersectionSort extends App {
  val N = readInt
  var A = readLine.split(" ").map(_.toInt)

  for (i <- 1 until N) {
    val v = A(i)
    var j = i - 1
    while (j >= 0 && A(j) > v) {
      A(j + 1) = A(j)
      j -= 1
    }

    A(j + 1) = v
    A.foreach(print(_))
    println()
  }
}
