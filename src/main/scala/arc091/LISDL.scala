package arc091

object LISDL extends App {
  val sc = new java.util.Scanner(System.in)
  val N, A, B = sc.nextInt
  val X = N - A - B

  // A + B > N + 1 のとき実現不可能
  if ((A + B) > (N + 1) | N > A * B) {
    println(-1)
    sys.exit
  }

  // それ以外のとき、実現可能
  var arr = Array.emptyIntArray

  if (B != N) {
    for (i <- 1 to A) arr :+= i
  }

  if (A != N) {
    for (j <- N - B + 1 to N) arr +:= j
  }

  if (A > B) {
    for (k <- A + 1 to N - B) arr +:= k
  } else {
    for (k <- N - B to A + 1 by -1) arr +:= k
  }


  println(arr.mkString(" "))
}
