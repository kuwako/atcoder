package atcoder093

object WorstCase extends App {
  val sc = new java.util.Scanner(System.in)
  val Q = sc.nextInt
  val A: Array[Long] = Array.fill(2 * Q)(sc.nextInt)

  // int型でいけるか微妙?
  for (i <- 0 until Q) {
    val a:Long = A(i * 2)
    val b:Long = A(i * 2 + 1)
    calc(a, b)
  }

  def calc(a:Long, b:Long):Unit = {
    val c: Long = a * b
    var cnt = 0

    // 4分円の格子点の数を数えたいが...方法がわからん..
  }
}
