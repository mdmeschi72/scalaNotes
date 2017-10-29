// partitions and zips

// below partitions if upper case, if falls into first partition,
// if lower case it falls into second partition
"New York".partition(_.isUpper)

import scala.collection.mutable.ArrayBuffer
val ab = ArrayBuffer(1, 2, 4, -5, 8, -9, 20, -20, -30)

// define variable for first negative number by partitioning by negative and
// positive numbers, then taking the first value in the negative number tuple
val firstNeg = ab.partition(_<0)._1(0)

// get the Array buffer of non negative numbers
val abFinal = ab.partition(_<0)._2

// append the first negative number to the end of the ArrayBuffer
abFinal.append(firstNeg)

abFinal

// zip takes two collections of the same legnth, and then combines them into
// a tuple.

val symbols = Array("<", "-", ">")

val counts = Array(2, 10, 2)

val pairs = symbols.zip(counts)
var str: String = ""

for (i <- pairs) str += (i._1 * i._2 )
println(str)






















