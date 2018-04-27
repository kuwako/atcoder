package algorithm

import scala.collection.mutable.Stack

object stack extends App {
  val sc = new java.util.Scanner(System.in)
  val line = sc.next
  val s1 = new Stack[Int]
  val s2 = new Stack[(Int, Int)] // 位置、合計値のタプル
  var sum = 0

  for (i <- 0 until line.length) {
    val c = line(i)
    if (c == '\\') s1.push(i)
    else if (c == '/' && s1.size > 0) {
      val j = s1.pop
      var a = i -j
      sum += a
      while(s2.size > 0 && s2.top._1 > j) {
        a += s2.pop._2
      }
      s2.push((j, a))
    }
  }

  println(sum)
  val s3 = s2.reverse.toList
  println(s2.size)
  s3.foreach(x => println(x._2))
}
