object sheet1 {
  println("Scala worksheet, intelliJ style")

  val answer = 8*5+2

  1.to(10)

  "Hello".intersect("World")

  1 to 10

  val res = 1.+(10)

  "hello".length  // don't use parens because length does not mutate the object

  "hello".apply(4) // scalla, you don't have to write .apply() for apply method

  "hello"(4)  // example of 'not' writing .apply() for apply method

  // first exercise is to play with worksheet

  val a = 6* 7

  a

  val b: BigInt = 21

  b.pow(100)

 import scala.math._

  sqrt(10)

  1 to 10

  (1 to 10).map(sqrt(_))  // important, the wildcard _ is the value passed into the
                        // map method which applies the sqrt function
                        // to each of the values in teh range
  6.*(7)

  val sample = Int.MaxValue

  // samples of using StringOps (wrapper of String) in scala
  "Mississippi".distinct


  "Mark".permutations.toArray

  "ABC".sum.toInt


}