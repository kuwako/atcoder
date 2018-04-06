package atcoder092

/**
  * Created by mkuwako on 18/04/03.
  */
object GridComponents extends App {
  val sc = new java.util.Scanner(System.in)
  val A = sc.nextInt
  val B = sc.nextInt

  var a = A - 1
  var b = B - 1
  // どんなA, Bがきても、100 x 100 のマスを考える
  println("100 100")

  // 上半分の100 x 50は白 = .
  for(h <- 1 to 50) {
    if (h % 2 == 0 | b == 0) {
      println("." * 100)
    } else {
      for(w <- 1 to 100) {
        if (w % 2 == 1 && b > 0) {
          print("#")
          b -= 1
        } else {
          print(".")
        }
      }
      println()
    }
  }
  println("#" * 100)
  // 下半分の100 x 50は黒 = #
  for(h <- 1 to 49) {
    if (h % 2 == 0 | a == 0) {
      println("#" * 100)
    } else {
      for(w <- 1 to 100) {
        if (w % 2 == 1 && a > 0) {
          print(".")
          a -= 1
        } else {
          print("#")
        }
      }
      println()
    }
  }
 }
