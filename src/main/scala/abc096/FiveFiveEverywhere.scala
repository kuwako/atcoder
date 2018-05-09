package abc096

object FiveFiveEverywhere extends App {
  val sc = new java.util.Scanner(System.in)
  val N = sc.nextInt
  def isPrime(p: Int) = (2 to math.sqrt(p).toInt).forall(p % _ != 0)
  var ans = Array.emptyIntArray

  for (i <- 2 to 55555) {
    if (ans.length == N) {
      println(ans.mkString(" "))
      sys.exit()
    }
    if (isPrime(i) & i % 5 == 1) {
      ans :+= i
    }
  }
}
