package arc096

object StaticSushi extends App {
  val N, C = MyPredef.nextInt
  val sushi = Array.fill(N, 2)(MyPredef.nextInt)
  var rMax = 0
  var lMax = 0

  var sum = 0
  var pos = 0
  var ind = 0
  // 時計回り
  for (i <- 0 until N) {
    val tCal = sushi(i)(1)
    val tPos = sushi(i)(0)
    sum += tCal
    if (rMax < sum - tPos) {
      rMax = sum - tPos
      pos = tPos
      ind = i
    }
  }

  sum = rMax - pos
  println(sum, rMax, pos)
  for (i <- N - 1 to ind + 1 by -1) {
    val tCal = sushi(i)(1)
    val tPos = C - sushi(i)(0)
    if (rMax < sum - tPos) {
      rMax = sum - tPos
    }

    sum += tCal
  }


  sum = 0
  pos = 0
  ind = N - 1
  // 反時計回り

  if (rMax > lMax) println(rMax)
  else println(lMax)
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
