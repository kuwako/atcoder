package arc092


/**
 * Created by mkuwako on 18/04/12.
 */
object TwoDplaneTwoNPoints extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val red :List[List[Int]] = List.fill(n, 2)(sc.nextInt)
  val blue :List[List[Int]] = List.fill(n, 2)(sc.nextInt)
  val sortedRed :List[List[Int]] = red.sortWith((a, b) => a(1) > b(1))
  val sortedBlue :List[List[Int]] = blue.sortBy(_(0))

  var cnt = 0
  var usedList :List[Int] = Nil

  sortedBlue.foreach(b => {
    var loop = true
    var index = 0
    sortedRed.foreach(r => {
      if (loop & !usedList.contains(index) & b(0) > r(0) & b(1) > r(1)) {
        cnt += 1
        loop = false
        usedList = index :: usedList
      }
      index += 1
    })
  })

  println(cnt)
}
