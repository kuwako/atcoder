object PlacingMarbles extends App{
  val line = scala.io.StdIn.readLine()

  line.map(x => {
    if (x == "0") println("a")
    else if (x == 0) println("c")
    else println("b")
  })

  println(line.count({_ == "1"}).toString)
}
