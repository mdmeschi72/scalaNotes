// lesson 7 lab part 2 case classes
// define two case classes, one for Article, one for Bundle
// both will extend super abstract class Item

abstract class Item
case class Article(description: String, price:Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item


val book = Article("Scala for Impatient", 39.95)
val booze = Article("Old Poerero Straight Rye", 40)
val gift = Bundle("booze and book", 10, book, booze)
//remember when pattern matching on case classes, if variable args, use the @ _* syntax.
def price(it: Item): Double = {
  it match {
    case Article(_, d) => d
    case Bundle(_, d, i @ _*) => i.map(price).sum - d
  }
}

val bookPrice = price(book)
val boozePrice = price(booze)
val bundlePrice = price(gift)

// another example of a bundle that contains an article and a bundle with two articles
// below we set (extract out)  descr, and price of the first article in the bundle
// using our exracting technique - pattern matching to pull it out from the special variable.

val special = Bundle("Father's day special", 20,
  Article("Scala for the impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old Potrero Straight Rye Whiskey", 79.95),
    Article("Junipero Gin", 23.95)))

val Bundle(_,_,Article(descr, pr), _*) = special


// final exercise, reimplment the optionType

class DoubleOption(d: Double) extends Option







