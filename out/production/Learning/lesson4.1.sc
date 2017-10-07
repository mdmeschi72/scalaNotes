class Point(val x: Double, val y: Double) {
def move (dx: Double, dy: Double) = new Point(x + dx, y + dy)
def distanceFromOrigin = math.sqrt(x*x + y*y)
override def toString = f"(${x}, ${y})"

}

val p = new Point(3,4)

p.move(10,20)

p.distanceFromOrigin

// note that p.move returns a whole new object of type point.
// p is immutable

p.x

p.y



