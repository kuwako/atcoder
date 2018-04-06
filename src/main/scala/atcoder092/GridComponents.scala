package atcoder092

object GridComponents extends App {
  val sc = new java.util.Scanner(System.in)
  val A = sc.nextInt
  val B = sc.nextInt

  var a = A - 1
  var b = B - 1
  // どんなA, Bがきても、100 x 100 のマスを考える
  println("100 100")

  printLines(".", "#", b)
  printLines("#", ".", a)

  // 半分の100 x 50はmanStr
  // そこにcntの数だけ、subStrを埋める。ここで、偶数行の偶数列目だけに埋めてcntをデクリメントする
  // 偶数行の奇数列目だけを埋めることで、自陣をかならず1つのmainStrの連結成分とする
  def printLines(mainStr :String, subStr :String, c :Int) :Unit = {
    var cnt = c
    for(h <- 1 to 50) {
      if (h % 2 == 1 | cnt == 0) {
        println(mainStr * 100)
      } else {
        for(w <- 1 to 100) {
          if (w % 2 == 0 && cnt > 0) {
            print(subStr)
            cnt -= 1
          } else {
            print(mainStr)
          }
        }
        println()
      }
    }
  }
 }
