// lesson 7 lab
// pattern matching (match statement) case classes


// create a function that takes a 'pair' of ints and swaps them using pattern matching.
// the below just shows how to 'extract' variable we are matching and using in expression
// after match.

def swap1(int1: Int, int2: Int): Unit = {

  var newInt1 = 0
  var newInt2 = 0

  int1 match{
    case a if (a == int1) => newInt2 = a
  }

  int2 match {
    case a if (a == int2) => newInt1 = a
  }

  println("Original Int 1 = " + int1 )
  println("Original Int 2 = " + int2 )
  println("New Int 1 = " + newInt1)
  println("New Int 2 = " + newInt2)

}

// the above is what I wrote, below is more concise using th pair notation
// note we take var p of type (Int, Int)

def horsSwap(p: (Int, Int) ) = p match { case (x, y) => (y,x )}

horsSwap(3,4)


// the above does the same thing, just more elegantly.



swap1( 3, 8)

def swap2(arr2: Array[Int]) = {

  if ((arr2.length < 2) || (arr2.length > 2)) println("Array not of correct lenght ")

  arr2 match{
    case a => Array(a(1), a(0))
  }

}

val arr2 = swap2(Array(1,2))

arr2

// the above is what I wrote, the below is a more elegant interpretation
// note that we want to only swap the first to elements of the integer array,
// and leave the rest in tact.  That was ignored in the above attempt.
// note the @ _* syntax to pick up rest of array untouched, and the ++ to concatonate two
// arrays

def horsSwap(a: Array[Int]) = a match { case Array(x, y, rest @ _*) => Array(y,x) ++ rest}

horsSwap(Array(1,2,8,9,56))








