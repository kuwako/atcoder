object BubbleSort extends App {
  val N = readInt
  var A = readLine.split(" ").map(_.toInt)

  var flag = true
  var cnt = 0
  while (flag) {
    flag = false
    for (j <- N - 1 to 1 by -1) {
      if (A(j) < A(j - 1)) {
        val e = A(j)
        A(j) = A(j - 1)
        A(j - 1) = e

        flag = true
        cnt += 1
      }
    }
  }

  A.foreach(print(_))
  println()
  println(cnt)
}
