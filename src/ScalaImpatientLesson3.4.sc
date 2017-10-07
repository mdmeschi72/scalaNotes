
// create map with key value pairs (alice = 10, Peter = 3, etc)
val mdm = Map( "Alice" -> 10, "Peter" -> 3, "Bobby" -> 4 )
// accessing value in the map with a key
mdm("Alice")

// use getOrElse method of Map object to be careful.
// this will allow you to return a value without an error
// if the key your looking for does not exist in the Map
mdm.getOrElse("Peter", 9)
mdm.getOrElse("Marcia", 99)


// mutable Map shown below
var mutscores = scala.collection.mutable.Map("Bob" -> 5, "Marty" -> 7, "Jerry" -> 9)


mutscores += ("Enid" -> 14)
mutscores -= "Bob"

mutscores

// for loop with Map data type example in scala
for ((k,v) <- mdm)
  println(  k + " has score " + v)

// can use yeild to return key/value as a set
for ((k, v) <- mdm) yield (k, v)