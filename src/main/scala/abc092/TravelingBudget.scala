object TravelingBudget extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt
  val c = sc.nextInt
  val d = sc.nextInt

  val train = if (a > b) b else a
  val bus = if (c > d) d else c

  println(train + bus)
}
