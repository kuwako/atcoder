object PlacingMarbles extends App{
  val line = scala.io.StdIn.readLine()

  var cnt = 0
  if (line(0) == '1') cnt += 1
  if (line(1) == '1') cnt += 1
  if (line(2) == '1') cnt += 1

  println(cnt)
}
