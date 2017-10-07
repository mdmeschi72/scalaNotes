class Time(h: Int, m: Int) {


  private val minutesToMidnight = (24 * 60) - minutes

  println("This.hours = " + this.hours + "\n")
  println("This.minutes = " + this.minutes + "\n")

  println("minutes to midnight = " + this.minutesToMidnight.toString)

  def hours =  h
  def minutes =  this.hours * 60 + m

  def minutes_=(newValue: Int) {
    if (newValue < 0 | newValue >59 )
      minutes
    else
      this.hours * 60 + newValue
  }

  def current = {this.hours.toString + ":" + this.minutes.toString}

  def < (other: Time) = {
    if ((this.hours < other.hours) | ((this.hours == other.hours) & (this.minutes < other.minutes))) true else false
  }

  def - (other: Time) = this.minutes - other.minutes

}

// companion object that overrides apply so that you don't need to use the new keyword
// to create an object.
object Time {
  def apply(h: Int, m: Int) = new Time(h,m)
}

val t1: Time = Time(12,22)
val t2: Time = Time(13,0)

t1 - t2
t2 - t1



t1 < t2
t2 < t1







