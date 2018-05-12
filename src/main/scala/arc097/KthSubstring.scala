package arc097

object KthSubstring extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val K = sc.nextInt

  // 全通りやってソート...?
  var list = List.empty[String]
  for (i <- 0 until s.length) {
    for (j <- i + 1 to s.length) {
      list = s.substring(i, j) :: list
    }
  }

  val ans = list.sorted.distinct
  println(ans(K - 1))
}
