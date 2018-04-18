package arc095

object BinomialCoefficients extends App {
  import Math.abs
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val A = Array.fill(n)(sc.nextInt)

  val max = A.max
  var diff = Int.MaxValue
  var ans = A(0)
  val half = max / 2

  A.foreach(x => {
    if (abs(half - x) < diff & x != max) {
      diff = abs(half - x)
      ans = x
    }
  })
  println(max + " " + ans)
}
