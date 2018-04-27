package pz

object dogcat extends App {
  val start = System.currentTimeMillis
  val ct1 = System.currentTimeMillis
  val line1, line2, line3 = scala.io.StdIn.readLine
  val interval = System.currentTimeMillis - ct1
  val lines: Array[String] = Array(line1, line2, line3)

  var dogCnt = 0
  var catCnt = 0

  lines.foreach(line => {
    if (line == "dog") dogCnt += 1
    else catCnt += 1
  })

  if (dogCnt > 1) println("dog")
  else println("cat")
  println(System.currentTimeMillis - start - interval)
}
