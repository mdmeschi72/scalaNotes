// example scala for loop

for (i <- 1 to 10 ) {
  println("blah")
}
// for loop works with any collection
for (c <- "hello") println(c)

// <- is called a generator, can have multiple generators
// in a for loop

for(i <- 1 to 3; j <- 1 to 3) print((10 * i +j) + " ")

// using guard in loop

for (i <- 1 to 3; j <- 1 to 3; if i != j) print((10 * i + j) + " ")

// using yield to have loop return collection of results
// more useful later with condensed functional programming

for (i <- 1 to 10) yield i % 3


// example of function declaration
// function name is abs
// function parameter is x of type Double
// return value is inferred, in this case double
// must have "=" after function name an parms if returning a value
def abs(x: Double) = if (x>=0) x else -x


// recursive functions must have return type defined since scala cannot
// infer the return type.

def fac(n: Int):Int = if (n <= 0) 1 else n*fac(n-1)

fac(12)

//named and default arguments
// you can name arguments when calling a function
// you can also set default input arguments

def decorate( str:String, left:String = "[", right:String = "]") = left + str + right

// note that the function automatically uses the default parameters that are set
decorate("blah")

// note parameter passed in is used instead of default
decorate("blah", "********||*******")














