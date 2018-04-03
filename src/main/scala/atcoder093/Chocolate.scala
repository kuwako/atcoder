/**
  * Created by mkuwako on 18/04/03.
  */
object Chocolate extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val d = sc.nextInt
  val x = sc.nextInt
  val A: Array[Int] = Array.fill(n)(sc.nextInt)

  var cnt = x
  A.foreach({ i =>
    cnt = cnt + 1 + ((d - 1) / i)
  })

  println(cnt)
 }
