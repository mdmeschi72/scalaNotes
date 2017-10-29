
// function that tests whether a character is a vowel


def isVowel(ch: Char) = {
  val compare: String = "aeiou"

  compare.contains(ch)
}

isVowel('B')
isVowel('a')

// functon that, given a string, returns a strin gof all its vowels.
// use isVowel, use a for loop

def retVowels(str: String) = {

  // var is mutable
  var retStr: String = ""

  // iterate over string collection, checking if any of the
  // members are a vowel, if so, return them
  for ( ch <- str) {
    if (isVowel(ch))
      retStr += ch
  }
  // return the String, the return value of the function is inferred in scala
  retStr
}

retVowels("Martino")

// condensed version of function to return vowels
// this one iterates though collection (String is collection)
// and uses a guard.  The guard is the 'if' statement in the for loop
// definition.  Only iterate if the 'if' statement is TRUE.
def retVowelsYield(str: String) = {
  for (ch <- str if (isVowel(ch)) ) yield  ch
}

retVowelsYield("ILoveToHim")

// attempt to return the vowels in a string using a recursive function
// with recursive functions you have to name the return type.
// in scala there are no primitives.  All types are objects

// below recursive has base case - if str is 0
// and recursive case, if str has length, go through each char in str
// to check if it is a vowel

def retVowelsRecur(str: String):String = {

  if (str.length <= 0) ""
  else {
    val singleChar = str(0)
    val restOfStr = retVowelsRecur(str.substring(1))
    if(isVowel(singleChar)) singleChar + restOfStr else restOfStr
  }

}

retVowels("asshole")

// below is shows the use of default parameters and

def retVowelsYieldDefParms(str: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true) = {
  for (ch <- str if (isVowelDefParms(ch, vowelChars, ignoreCase)) ) yield  ch
}

def isVowelDefParms(ch: Char, vowelChars: String, ic: Boolean = true) = {

  if (ic == true)
     vowelChars.contains(ch.toLower)
  else
     vowelChars.contains(ch)


}

retVowelsYieldDefParms("FuckOff", "aei", false)

retVowelsYieldDefParms("FuckOff", "aeiu")

retVowelsYieldDefParms("FuckOff", "aeiou", true)










