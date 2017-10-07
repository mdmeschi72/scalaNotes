class Time(val hours: Int = 12, val minutes: Int = 0) {
  val currentTime = hours.toString + ":" + minutes.toString

  def current = {
    currentTime
  }

  def before(other: Time) = {
    val isBefore: Boolean = true
    if (other.hours <= this.hours) {
      if ((other.hours == this.hours) & (other.minutes < this.minutes)) {
        val isBefore = true
      } else if ((other.hours == this.hours) & (other.minutes >= this.minutes)) {
        val isBefore = false
      } else {
        val isBefore = true
      } // end hours check
    }else {
      val isBefore = false
    }
    isBefore
  } // end before function

}

val t1: Time = new Time(12,22)
val t2: Time = new Time(13,0)

t1.currentTime
t2.currentTime

val isThisBefore = t1 before t2

val isT1BeforeT2 = t2 before t1
