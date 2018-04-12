package arc092

/**
  * Created by mkuwako on 18/04/12.
  */
object TwoSequences extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val A = Array.fill(n)(sc.nextInt)
  val B = Array.fill(n)(sc.nextInt)

  var ans = 0

  for (i <- 0 to n - 1) {
    val a = A(i)
    for (j <- 0 to n - 1) {
      ans = ans ^ (a + B(j))
    }
  }
  println(ans)
}
