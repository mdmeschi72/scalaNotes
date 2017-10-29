import java.util.Scanner
// word count
// Read a file, a word at a time, keep a map that yields the
// frequency of each word.
// keys are the words, values are the frequencies

val in = new java.util.Scanner(new java.net.URL( "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)

  val count = scala.collection.mutable.Map[String, Int]()

  while (in.hasNext) {
    val word = in.next()

    if (word.contentEquals("Alice"))
     count(word) = count.getOrElse("Alice",0) + 1

    if (word.contentEquals("Rabbit"))
      count(word) = count.getOrElse("Rabbit", 0) + 1
  }

count

// get map of word count (index string, value int) with immutable map

val inImut = new java.util.Scanner(new java.net.URL( "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)

var countAlice: Int = 0
var countRabbit: Int = 0
while (inImut.hasNext) {
  val wordImut = inImut.next()



  if (wordImut.contentEquals("Alice"))
    countAlice = countAlice + 1

  if (wordImut.contentEquals("Rabbit"))
    countRabbit = countRabbit + 1

}

val countImut = Map("Alice" -> countAlice, "Rabbit" -> countRabbit)






