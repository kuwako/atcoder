package atcoder093

object SmallAndLargeIntegers extends App {
  val sc = new java.util.Scanner(System.in)
  val A = sc.nextInt
  val B = sc.nextInt
  val K = sc.nextInt - 1

  // AからA+Kまで出力(ただしBを超えたら終わり)
  for (i <- A to A + K) {
    if (i <= B) {
      println(i)
    }
  }

  // B-KからBまで出力(ただし、A+K以上である必要がある)
  for (j <- B - K to B) {
    if (j > A + K) {
      println(j)
    }
  }
}
