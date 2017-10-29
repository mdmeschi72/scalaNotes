// Remove all negative number elements in an arraybuffer except for the first one
// use until and for/yield
// collect all indexes
// drop the first index in the collection of indexes tracking negative numbers
// call a.remove(i) to remove the indexes left in the negative number index array
// this must be done in reverse order otherwise the indexes shift.
// use for and reverse
import scala.collection.mutable.ArrayBuffer
val ab = ArrayBuffer(1, 2, 4, -5, 8, -9, 20, -20, -30)

// loops through index of array and collects those index values
// where the element is < 0
val abNeg = for (i <- 0 until ab.length if ab(i) < 0) yield i

// drop the first 'n' elements from the vector abNeg - in this case
// the first index
val abNegWithoutFirst = abNeg.drop(1)

// traverse array of indexes without the first value in reverse order
// and remove them from the mutable ArrayBuffer
for (i <- abNegWithoutFirst.reverse)  ab.remove(i)

// we are DONE 
ab


