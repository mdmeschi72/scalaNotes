// lesson 2.4 named argument

// below is example of default parameter values

def decorator(str: String, left: String = "[", right: String = "]" ) =
  left + str + right

decorator("Mark")

// her with the *, you can give any number of arguemnts into this
// function as long as they are ints
def sum(args: Int*) = { // args is a Seq[Int]
var result = 0
  for (arg <- args) result += arg
  result
}

sum(1,3,4,8)

val s = sum(1 to 5: _*)

"I love that baby".substring(1)

