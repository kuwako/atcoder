object dogcat extends App {
  val line1, line2, line3 = scala.io.StdIn.readLine
  val lines: Array[String] = Array(line1, line2, line3)

  var dogCnt = 0
  var catCnt = 0

  lines.foreach(line => {
    if (line == "dog") dogCnt += 1
    else catCnt += 1
  })

  if (dogCnt > 1) println("cat")
  else println("cat")
}
