// define an array
// ten integers with value 0
val nums = new Array[Int](10)

// set the slot in the array in scala ()

nums(0) = 3

nums

nums(2) = 4

nums
//traverse the array indexes in the array
for (i <- 0 until nums.length) nums(i) = i*i

nums

//ArrayBuffer is a variable length array

import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer("Mary", "had", "a", "little", "lamb")

b += ", Its"
b += ("fleece", "was", "white", "as", "snow")
b ++= Array("blow", "me")

b.remove(3)
b

b.insert(3, "Medium-size")

b

val arr = Array(2,3,5,7,11)
val result = for(i <- arr) yield 2 * i

// you can use the guard to futher transform arrays
val result2 = for(i <- arr if i % 2 != 0 ) yield 2 * i

// you can use the methods in the collection model to tranform the colletion
// remember that we want to transform and return collections,
// not mutate.  Mutate is expensive
val sumSample = Array(1,3,4,5,6).sum
val maxSample = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
val sortSample = ArrayBuffer(1,7,22,2,5).sorted
val reverseSample = Array(1,7,3,4).reverse

reverseSample.mkString(", ")

// you can view the elements of an array with mkString, not toString
// because scala inherits the java toString methods

sortSample.mkString(",")









