
  val x = 4

  val result = if (x > 0) "something" else -1

  val y = 6

  val x0 = 3
  val y0 = 2

  import scala.math._

  val distance = {
    val dx = x - x0
    val dy = y - y0
    sqrt(dx * dx + dy * dy)
  }

  // sample for each loop

  val n = 10
  for ( i <- 1 to n) println(i)

  // sample fo each loop over string
  for (c<- "Hello") println(c)

  // can have mulitple generators (<-) in for loop
  for (i <- 1 to 3; j <- 1 to 3 ) print((10 * i + j) + " ")

  // another example of multiple generators in for each loop
  // notice output is driven by the 1 to 3, no the 1 to 10 part
  for (i <- 1 to 3; j <- 1 to 10) print((10 * i + j) + " ")

  // you can use guard statements in scala for each loops
  // guard statements are basically if statements
  for ( i <- 1 to 3; j <- 1 to 3 if i != j) println ((10*i + j) + " ")

  // example of the powerful yield command out of for each loops.
  // this returns a collection (vector)
  for (i <- 1 to 10) yield i % 3

  // Functions (defining functions lesson 2.3

  def abs(x: Double) = if (x >= 0) x else -x

  val inVar = 3

  abs(inVar)

  // In recursion, scala can't infer a functions return type
  // below is recursive function (factorial), shows you cannot
  // infer return type
  def fac(n: Int): Int = if(n <= 0) 1 else n * fac(n - 1)

  fac(inVar)

  // procedure example, does not return a value.

  def box(s : String) {

    val border = '-' * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }

  val inVarString = "Mark"
  box(inVarString)

  




