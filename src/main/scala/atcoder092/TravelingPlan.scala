object TravelingPlan extends App {
  import scala.math.abs
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var A: Array[Int] = Array.fill(n)(sc.nextInt)
  A = 0 +: A :+ 0
  // 全経路いった場合を計算
  var total = 0
  for (i <- 1 to n + 1) {
      total += abs(A(i) - A(i - 1))
  }

  for (i <- 1 to n) {
    val before = A(i - 1)
    val after = A(i + 1)

    println(total - abs(A(i) - before) - abs(after - A(i)) + abs(after - before))
  }
 }
