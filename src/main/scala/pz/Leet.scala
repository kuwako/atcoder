object Leet extends App {
  val line = io.StdIn.readLine
  val ans = line.map(x => {
    x match {
      case 'A' => '4'
      case 'E' => '3'
      case 'G' => '6'
      case 'I' => '1'
      case 'O' => '0'
      case 'S' => '5'
      case 'Z' => '2'
      case _ => x
    }
  })

  println(ans)
}

