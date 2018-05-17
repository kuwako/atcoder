package arc091

object RemainderReminder extends App {
  val sc = new java.util.Scanner(System.in)
  val N, K = sc.nextLong

  var sum :Long = 0
  if (K == 0) {
    println(N * N)
    sys.exit
  }

  for (b <- K + 1 to N) {
    val x = N % b
    if (x >= K) {
      sum += (b - K) * (N / b) + x + 1 - K
    } else {
      sum += (b - K) * (N / b)
    }
  }

  println(sum)
}
