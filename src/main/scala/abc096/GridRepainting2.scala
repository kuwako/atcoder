package abc096

object GridRepainting2 extends App {
  val H, W = MyPredef1.nextInt()
  val pict = Array.fill(H)(MyPredef1.next)

  for (i <- 0 until H) {
    for (j <- 0 until W) {
      if(check(i, j)) {
        println("No")
        sys.exit()
      }
    }
  }

  println("Yes")

  def check(i: Int, j: Int): Boolean = {
    if (pict(i)(j) == '.') return false

    val up = if (i == 0) '.' else pict(i - 1)(j)
    val under = if (i == H - 1) '.' else pict(i + 1)(j)
    val left = if (j == 0)'.' else pict(i)(j - 1)
    val right = if (j == W - 1)'.' else pict(i)(j + 1)

    if (up == '.' & under == '.' & left == '.' & right == '.') true
    else false
  }

}

object MyPredef1 {
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