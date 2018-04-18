package arc095

object ManyMedians extends App {
  import java.util.Arrays

  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val X = Array.fill(n)(sc.nextInt)
  val Xs = X.clone()
  Arrays.sort(Xs)
  val halfB = Xs(n / 2 - 1) // before
  val halfA = Xs(n / 2) // after

  for (i <- 0 until n) {
    if (X(i) <= halfB) {
      println(halfA)
    } else {
      println(halfB)
    }
  }
}
