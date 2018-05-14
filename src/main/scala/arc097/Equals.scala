package arc097

import java.io._
import java.util.StringTokenizer
import scala.util.control.Breaks.{breakable,break}

object Equals extends App {
  val in = new InputReader(System.in)
  val pw = new PrintWriter(System.out)

  val N, M = in.next().toInt
  val p = new Array[Int](N + 1)
  val swaps = new Array[(Int, Int)](M)

  for (i <- 1 to N) {
    p(i) = in.next().toInt
  }
  for(i <- 0 until M){
    val a, b = in.next().toInt
    swaps(i) = (a, b)
  }

  val uf = new UnionFind(N + 1)

  for ((a, b) <- swaps) {
    uf.connect(a, b)
  }

  var ans = 0
  for(i <- 1 to N) {
    if(uf.isConnect(p(i), i))
      ans += 1
  }

  println(ans)
}


class UnionFind(v: Int){
  // 根であれば *そのグループの要素数(負)* が、子であれば親の番号が入る。
  val uni = Array.fill(v)(-1)

  // 頂点 v の所属するグループを調べる
  def root(v: Int): Int =
    uni(v) < 0 match{
      case true  =>  // v が親の場合
        return v
      case false =>  // v が子の場合
        uni(v) = root(uni(v))  // 親のrootを調べる
        return uni(v)
    }

  // 頂点 a と頂点 b をつなぐ。もともと同じグループのとき、False を返す
  def connect(a: Int, b: Int): Boolean = {
    // まずはそれぞれ根の番号に置き換える
    var ra = root(a)
    var rb = root(b)
    if(ra == rb)
      return false  // a と b がそもそも同じグループに属しているなら即終了

    // ra を大きなグループにしたいので、逆であれば入れ替える
    if(uni(ra) > uni(rb)) {  // rbの方が要素数が多ければ
      val tmp = ra
      ra = rb
      rb = tmp
    }

    // ra と rb を結合し、rb の親を ra とする
    uni(ra) += uni(rb)
    uni(rb) = ra
    println(a, b)
    println(ra, rb)
    println(uni(ra), uni(rb))
    println(uni.toList)
    return true
  }

  // 頂点 a, b が同じグループであるかを調べる
  def isConnect(a: Int, b: Int): Boolean =
    root(a) == root(b)

  // 頂点 a を含むグループの頂点数を調べる
  def size(a: Int): Int = -uni(root(a))
}

class InputReader(stream: InputStream) {
  private val reader = new BufferedReader(new InputStreamReader(stream))
  private var tokenizer: StringTokenizer = new StringTokenizer(reader.readLine())
  def next(): String = {
    while (!tokenizer.hasMoreTokens()) {
      tokenizer = new StringTokenizer(reader.readLine())
    }
    tokenizer.nextToken()
  }
}
