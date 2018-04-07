package atcoder093

object WorstCase extends App {
  val sc = new java.util.Scanner(System.in)
  val Q = sc.nextInt

  // int型でいけるか微妙?
  for (i <- 0 until Q) {
    val a = sc.nextLong
    val b = sc.nextLong
    val m = a * b
    val s :Long = (Math.sqrt(a * b)).toLong

    var ans :Long = 2 * s - 1

    if (s * (s + 1) >= m) {
      ans -= 1
    }
    if (s * s == m & a != b) {
      ans -= 1
    }
    println(ans)
  }
}
