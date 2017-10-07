// word count with  immutable map


val in = new java.util.Scanner(new java.net.URL( "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)

var count = Map[String, Int]()
while (in.hasNext) {
  val word = in.next()
  count = count + (word -> (count.getOrElse(word, 0) +1 ))
}

count("Alice")
count("Rabbit")