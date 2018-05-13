package arc097

object KthSubstring extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val K = sc.nextInt
  val b1 = new scala.util.control.Breaks

  // 1 <= K <= 5だった...
  var list = List.empty[String]
  val len = if (s.length > 5) 5 else s.length
  for (i <- 0 until s.length) {
    b1.breakable {
      for (j <- i + 1 to s.length) {
        list = s.substring(i, j) :: list
        if (j == i + 5) b1.break()
      }
    }
  }

  val ans = list.sorted.distinct
  println(ans(K - 1))
}
