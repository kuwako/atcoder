package atcoder093

object WorstCase extends App {
  val sc = new java.util.Scanner(System.in)
  val Q = sc.nextInt

  // int型でいけるか微妙?
  for (i <- 0 until Q) {
    val a = sc.nextInt
    val b = sc.nextInt
    val m = a * b
    val s :Int = (Math.sqrt(a * b)).toInt

    var ans :Int = 2 * s - 1

    if (s * (s + 1) >= m) {
      ans -= 1
    }
    if (s * s == m & a != b) {
      ans -= 1
    }
    println(ans)
  }
}
