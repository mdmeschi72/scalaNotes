import scala.math._

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
// and uses .25 as input parameter for these functions, special syntax to add the
// underscore to specify to compiler that this is indeed a function.

valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _)

valueAtOneQuarter(x => 3 * x)

valueAtOneQuarter(x => 45 + x)

valueAtOneQuarter(3 * _)





