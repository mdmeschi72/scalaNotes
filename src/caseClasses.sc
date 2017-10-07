// Lab 7
// Pattern matching


// create a function - swap - that receives a pair of integers and returns the pair with the
// components swapped.

def swap(x: Int, y: Int): Unit = {

val newx =  x match {
              case c1 if (c1 == x) => y
              case c2 if (c2 == y) => x
            }

 val newy = y match {
   case c1 if (c1 == y) => x
   case c2 if (c2 == x) => y
 }

  println("Input x = " + x + " Input y = " + y )
  println("Swapped x = " + newx + " Sapped y = " + newy )

}