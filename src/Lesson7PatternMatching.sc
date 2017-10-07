
object testObj
{
  val str = "I l1ve my boy"
  val i = 3
  str(i)
  var indicator: Int = 0
  var digit: Int = 0

  str(i) match {
    case '+' => indicator = 1
    case '-' => indicator = -1
    case ch if Character.isDigit(ch) => digit = Character.digit(ch, 10)
    case _ => println("Fell here")
  }

  digit

}

object testObj2 {

  val x = BigInt(1500)

//val b =  x match {
//    case y: Int => y
//    case s: String => Integer.parseInt(s)
//    case _: BigInt => Int.MaxValue
//    case _ => 0
//  }



}

val (uppercase, lowercase) = "Hello, World".partition(Character.isUpperCase(_))

uppercase
lowercase

val arr = Array(1,2,3,4,5,6,7)
// the first can second values of the array arr are assigned/extracted/ to val first and val second
val Array(first, second, _*) = arr


val Array(ffirst, ssecond, rest @ _*) = arr







