class Time(val hours: Int = 12, val minutes: Int = 0) {

  if (hours > 23 | minutes > 59 | hours < 0 | minutes < 0)
    throw new IllegalArgumentException("The hours must be between 0 and 23 and minutes between 0 and 59")

  def current = {this.hours.toString + ":" + this.minutes.toString}

  def before(other: Time) = {
    if ((this.hours < other.hours) | ((this.hours == other.hours) & (this.minutes < other.minutes))) true else false
  }


}



  val t1: Time = new Time(12,22)
  val t2: Time = new Time(13,0)

  t1 before t2
  t2 before t1


