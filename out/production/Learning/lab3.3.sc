val words = Array("Mary", "had", "a", "little", "lamb", "its", "fleece", "was", "white", "as", "snow")


val wordsMap = words.groupBy(_.substring(0,1))

val wordsLength = words.groupBy(_.length)

wordsMap("a")
wordsMap("l")
wordsMap("w")
wordsMap("M")

wordsLength(1)
wordsLength(3)

