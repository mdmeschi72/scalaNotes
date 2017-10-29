// fixed length array
val a = new Array[Int](10)

for (i <- 0 until a.length) a(i) = i * i
a

// mutable array buffer (variable length array)

import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer("Mary", "Had", "A", "Little", "Lamb")

b

// add element at the end
b += "its"

b += ("fleece", "was", "White")

// add a whole array
b ++= Array("as", "snow")

b.remove(3)

b

// can use insert
b.insert(3, "fuck")

b

// can use trimend
b.trimEnd(5)

b

// samples with Maps - key value pairs in scala
// note the -> operater assigns the value to the key

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// you can create a mutable map, maps are normally immutable
val mscores = scala.collection.mutable.Map("Alice" -> 10)

val bobScore = scores("Bob")

// getOrElse method is great for accessing Map values because if the
// key doesn't exist, you can return a default value

scores.getOrElse("Fred", 0)

val switharoo = for ((k,v) <- scores) yield (v,k)


// Tuple - array of different type

val t = (1, 3.14, "asswipe")

// you can look up elements in a tuple:
// ._<num> gives you the numth element in a tuple
t._2

// can assign value to the using the tuple
// below, the underscore means to skip 1st element in the tuple,
// the vals second and thrid are assigned the 2nd and 3rd elements in the tuple
val(_, second, third) = t







