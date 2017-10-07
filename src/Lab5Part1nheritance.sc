
import java.awt._

val r = new Rectangle(5, 10, 20, 30)
//translage is mathematical term for 'move'
r.translate(10,20)
r

//the Ellipse2D.Double class was created without a translate method.
//we can create a trait 'translate' to fix this

trait RectangleLike {
  def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def translate(dx: Double, dy: Double) { setFrame(getX + dx, getY + dy, getWidth, getHeight)}
  // good practice to always have a good toString method for any class to display
  // data contents
  override def toString = ("X = " + getX + " Y = " + getY + " Width = " + getWidth + " Height = " + getHeight)
}

val egg = new geom.Ellipse2D.Double(10,20,30,40) with RectangleLike

egg.translate(5,10)

egg









