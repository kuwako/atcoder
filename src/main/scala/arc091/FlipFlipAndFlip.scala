package arc091

object FlipFlipAndFlip extends App {
  val sc = new java.util.Scanner(System.in)
  var N,M = sc.nextLong()

  if (N == 1) N = 3
  if (M == 1) M = 3
  println((N - 2) * (M - 2))
}
