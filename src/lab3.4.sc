// using tuples (array that can multiple types

"New York".partition(_.isUpper)


import scala.collection.mutable.ArrayBuffer
val aBuff = new ArrayBuffer[Int]
aBuff += (-3,3,5,6,-7,11,12,0,-1)


val tupBuff = aBuff.partition(_ < 0)

val finalArrayBuff = tupBuff._1.drop(1) ++= tupBuff._2

finalArrayBuff

//val finalValue = tupBuff(0).drop(1)

val symbols = Array("<", "-", ">")

val counts = Array(2,10,2)

val pairs = symbols.zip(counts)

for (i <- pairs ) println(i._1 * i._2)

//or

for ((s,n) <- pairs) print(s*n)




