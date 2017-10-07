class Time(val hours: Int = 12, val minutes: Int = 0) {

  if (hours > 23 | minutes > 59 | hours <0 | minutes < 0 )
    throw new IllegalArgumentException("The hours must be between 0 and 23 and minutes between 0 and 59")

  val currentTime = hours.toString + ":" + minutes.toString

  def current = {
    currentTime
  }

  def before(other: Time) = {
    //  var isBefore: Boolean = true

    val isBefore = if (other.hours > this.hours | (other.hours == this.hours & other.minutes > this.minutes))
  }
 //   if (other.hours >= this.hours) {
 //     if ((other.hours == this.hours) & (other.minutes > this.minutes)) {
 //       isBefore = true
 //     } else if ((other.hours == this.hours) & (other.minutes <= this.minutes)) {
 //       isBefore = false
 //     } else {
 //       isBefore = true
 //     } // end hours check
 //   }else {
 //     isBefore = false
 //   }
 //   isBefore



val t1: Time = new Time(12,22)
val t2: Time = new Time(13,0)

t1.currentTime
t2.currentTime

val isThisBefore = t1 before t2

val isT1BeforeT2 = t2 before t1

val t3: Time = new Time(24,3)
