// Higher order functions Lesson 6
// Scala for the impatient
//

// part 1, no loops w/ map and filter

val zones = java.util.TimeZone.getAvailableIDs
// first you split each country/city pair
// then you take the city portion
// note that you have to clean the data because some country city pairs
// do not have the city portion

zones.map(_.split("/"))
// this brings an error, have to filter out elements of array that are array that have only
// 1 element
//zones.map(_.split("/")).map(_(1))


// you must comment these long, complicated lines of scala code for maintenance.
// the below does the following:

// 1. splits the zones by "/" and returns an array of arrays with two values.
// 2. the arrays in the array do not all have 2 elements, we will filter out
//    those that have < 2 elements with filter.  remember, the _ is like x = x.lenght < 1
// 3. We will only take the first element of each array.
// 4. we want to takea  sample of the result, so we will use the grouped function.
//    In order to view the results since grouped returns an iterator, you have to use the
//    toArray call.
// 5. Since grouped groups consecutive elements in the array into smaller arrays of length 10,
//    you can take a sample of this by only picking out the first element in the array.
//    in scala, like java, arrays start with # 0

zones.map(_.split("/")).filter(_.length > 1).map(_(1)).grouped(10).toArray.map(_(0))


// part 2, reductions

// reduce left function in this case essentially multiplies the values of the array
// with eachother from the leftmost element in the array to the rightmost

1.to(10).reduceLeft(_ * _)


// 10! (10 factorial) is 10*9*8*7*6*5*4*3*2*1
// you can use reduceRight

1.to(10).reduceRight(_ * _)

// create function that takes in Int and creates its factorial

def fact(in: Int) = 1.to(in).reduceRight(_ * _)

fact(3)

fact(10)

// compute 2 to the nth power
// need n copies of the number 2

1.to(5).map((x: Int) => 2).reduceLeft(_ * _)

// the function below does the following:
// 1) takes in an integer, creates a collection in order
// of 1 to that integer
// 2) maps the number 2 to every element in the array, so it creates 'n' copies of 2
// 3) calls the reduce left method with _ * _ to muliply 2 * 2 n times
def raiseToPower(n: Int) = {1.to(n).map((x: Int) => 2).reduceLeft(_ * _)}

raiseToPower(6)

// the function below does the following:
// 1) takes in a Sequence of strings, and a separator string.
// 2) runs map over the array of strings and uses the string operator '+' to concat
// the separator.
// 3) runs the reduceLeft function and to concat each of the new strings on to each other
// to send up with all strings in array of strings with separator in between them
def concat(strings: Seq[String], sep: String) = strings.map(_ + sep).reduceLeft(_ + _)

concat(Array("Mary", "had", "a", "little", "lamb"), "|")


// playing around with control abstraction below.
// this did not work well in INettliJ CE compiler,  but sleepy eye says it should work though.
// the function While does the following:
// 1) takes in two functions, one that returns boolean, the other doesn't return anything.
// 2) if the condition in the first function passed in is true, it executes the block and then
// calls iteself again to check the condition again - probobably after incrementing iterator.
// This simulates the while loop
def While(condition: () => Boolean, block: () => Unit): Unit = {
  if ( condition() ) { block; While(condition, block) }

}

val n = 10
var i = 1
var f = 1

While(() => i < n, () => {f *= i; i += 1; println("f = " + f.toString)})


// you can make syntax nicer by doint the following
// 1) use the call by name methodology to remove the () in the function code and the => and() in the calling
// code

def While2(condition: => Boolean, block: => Unit): Unit = {
  if ( condition ) { block; While2(condition, block) }

}

val nn = 10
var ii = 1
var ff = 1

While2( ii < nn, {ff *= ii; ii += 1; println("f = " + ff.toString)})

// you can even make it extra nice by currying (converting into two functions instead
// of a function with two parameters).  You can do that easily by using the
// 'dense method' by having two parameters in separate (), and then you call with
// while(){}

def While3(condition: => Boolean)( block: => Unit) = {
  if ( condition ) { block; While3(condition, block) }

}

val nnn = 10
var iii = 1
var fff = 1

While3( iii < nnn) {fff *= iii; iii += 1; println("f = " + fff.toString)})