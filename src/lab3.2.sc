// lab part 2

// word count
// read text and keep a count of how many times a word appears


val in = new java.util.Scanner(new java.net.URL( "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)

val count = scala.collection.mutable.Map[String, Int]()
while (in.hasNext) {
  val word = in.next()
  if( count.contains(word) ) count(word) += 1 else count(word) = 1
}

count("Alice")
count("Rabbit")

