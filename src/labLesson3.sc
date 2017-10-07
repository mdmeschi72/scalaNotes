// remove all negative numbers from arrayBuffer except for the first one

import scala.collection.mutable.ArrayBuffer
val aBuff = new ArrayBuffer[Int]

aBuff += (-3,3,5,6,-7,11,12,0,-1)
// mark indexes where there is a negative number
val a = for (i <- 0 until aBuff.length if aBuff(i) < 0) yield i

// remove all but first neg num from ArrayBuffer
for (iii <- a.drop(1).reverse){
  aBuff.remove(iii)
}

aBuff









