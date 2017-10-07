// below is function that returns boolean true if passed a vowel

def isVowel(x: Char, vowelChars: String = "aeiou", ignoreCase: Boolean = true) = {
  if (ignoreCase == false) vowelChars.contains(x) else vowelChars.toLowerCase.contains(x)
}
isVowel('e')

// function that returns all of the vowels in a string that was passed
// to it

def vowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true  ) = {
  for (i <- s if isVowel(i, vowelChars, ignoreCase)) yield i
}

"I love that baby".substring(1)

def vowels2(s: String): String = {
  if(s.length == 0) ""
  else {
    val ch = s(0)
    val rest = vowels2(s.substring(1))
    if (isVowel(ch)) ch + rest else rest
  }
}

vowels("Mark is the best", "Mteb", false)

vowels2("Mark rules")

