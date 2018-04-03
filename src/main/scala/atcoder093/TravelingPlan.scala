/**
  * Created by mkuwako on 18/04/03.
  */
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

  // 端折る箇所がi-1 i+1の間だった場合は全経路いった場合と同じ、違った場合はi と i-1の絶対値の2倍の額を合計から引く
  for (i <- 1 to n) {
    val before = A(i - 1)
    val after = A(i + 1)

    println(total - abs(A(i) - before) - abs(after - A(i)) + abs(after - before))
  }
 }
