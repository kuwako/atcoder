package atcoder093

object SmallIntegers extends App {
  val sc = new java.util.Scanner(System.in)
  val A = sc.nextInt
  val B = sc.nextInt
  val C = sc.nextInt
  val X = Array(A, B, C).sorted

  val cntCA = (X(2) - X(0)) / 2
  val cntCB = (X(2) - X(1)) / 2

  val Y = Array(X(2), X(1) + cntCB * 2, X(0) + cntCA * 2)

  val cnt = Y.count(_ == X(2))

  if (cnt == 3) {
    println(cntCA + cntCB)
  } else if  (cnt == 2) {
    println(cntCA + cntCB + 2)
  } else {
    println(cntCA + cntCB + 1)
  }


}
