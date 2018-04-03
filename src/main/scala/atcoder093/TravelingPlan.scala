/**
  * Created by mkuwako on 18/04/03.
  */
object TravelingPlan extends App {
  import scala.math.abs
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val A: Array[Int] = Array.fill(n)(sc.nextInt)
  // 全経路いった場合を計算
  var total = 0
  for (i <- 0 until n) {
    if (i == 0) total = abs(A(i))
    else {
      total += abs(A(i) - A(i - 1))
    }
  }
  total += abs(A(n - 1))

  // 端折る箇所がi-1 i+1の間だった場合は全経路いった場合と同じ、違った場合はi と i-1の絶対値の2倍の額を合計から引く
  for (i <- 0 until n) {
    var before = 0
    var after = 0
    if (i != 0) before = A(i - 1)
    if (i != (n - 1)) after = A(i + 1)

    if ((before <= A(i) & A(i) <= after) | (after <= A(i) & A(i) <= before)) {
      println(total)
    } else if (i == n - 1 & ((A(i - 2) > 0 & A(i - 1) < 0) | (A(i - 2) < 0 & A(i - 1) > 0))) {
      // 最後の正負が違った場合の処理
      println(total - 2 * abs(A(i) - before) + 2 * abs(A(i - 1)))
    } else {
      println(total - 2 * abs(A(i) - before))
    }
  }
 }
