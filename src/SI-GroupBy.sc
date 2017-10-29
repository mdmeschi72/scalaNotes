// take a large dataset and group by first letter


val words = Array("Mary", "Fuck", "blowme", "Iloveshim", "tohimselfs", "andhisleggy, " +
  "and", "to", "his", "otherleggy")

// group by the first letter of each String element in the array
// _ represents every element in the arry, traversing through it.
val output = words.groupBy(_.substring(0,1))
output("t")
output("F")
// this example groups by the length of each string in the array
val output2 = words.groupBy(_.length)













