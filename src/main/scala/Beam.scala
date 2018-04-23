object Beam extends App {
  val H, W = MyPredef.nextInt
  val mirror = Array.fill(H)(MyPredef.next)
  // 進む方向
  var dire = "r" // right, left, up, down

  def calc(dire: String, ans: Int, x: Int, y: Int): Int = {
    if (x >= W | y >= H | x < 0 | y < 0) ans
    else {
      val nAns = ans + 1
      val nDire = getNewDire(dire, mirror(y)(x))
      val nPos = getNewPos(nDire, x, y)
      calc(nDire, nAns, nPos(0), nPos(1))
    }
  }

  def getNewPos(dire: String, x: Int, y: Int): Array[Int] = {
    dire match {
      case "r" => Array(x + 1, y)
      case "l" => Array(x - 1, y)
      case "u" => Array(x, y - 1)
      case "d" => Array(x, y + 1)
    }
  }

  def getNewDire(dire: String, obj: Char): String = {
    if (obj == '/') {
      dire match {
        case "r" => "u"
        case "l" => "d"
        case "u" => "r"
        case "d" => "l"
      }
    } else if (obj == '\\') {
      dire match {
        case "r" => "d"
        case "l" => "u"
        case "u" => "l"
        case "d" => "r"
      }
    } else {
      dire
    }
  }

  println(calc(dire, 0, 0, 0))
}

object MyPredef {
  @inline def rep(n: Int, f: => Unit): Unit = { var c = 0; while (c < n) { f; c += 1 } }
  @inline def rep(n: Int, f: Int => Unit): Unit = { var c = 0; while (c < n) { f(c); c += 1 } }

  private val buf = new Array[Byte](1024); private var ptr = 0; private var len = 0
  @inline private def isPrintableChar(c: Int): Boolean = 33 <= c && c <= 126
  @inline private def hasNextByte(): Boolean =
    if (ptr >= len) { ptr = 0; len = System.in.read(buf); len > 0 } else { true }
  @inline private def hasNext(): Boolean = {
    while (hasNextByte() && !isPrintableChar(buf(ptr))) ptr += 1
    hasNextByte()
  }
  @inline private def readByte(): Byte =
    if (hasNextByte()) { val res = buf(ptr); ptr += 1; res } else { -1 }
  def next(): String = {
    if(!hasNext()) ???
    val sb = new StringBuilder; var b = readByte()
    while (isPrintableChar(b)) { sb.append(b.toChar); b = readByte() }
    sb.toString
  }
  def nextInt(): Int = {
    val n = nextLong()
    if (n < Int.MinValue || Int.MaxValue < n) ???
    n.toInt
  }
  def nextLong(): Long = {
    if(!hasNext()) ???
    var minus = false; var b = readByte()
    if (b == '-') { minus = true; b = readByte() }
    def go (b: Byte, n: Long = 0): Long =
      if ('0' <= b && b <= '9') { go(readByte(), n * 10 + b - '0') }
      else if (minus) { -n } else { n }
    go(b)
  }
  def nextDouble(): Double = next.toDouble
}

