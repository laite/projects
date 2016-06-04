package exercises4;

public class Point {

	protected double x;
	protected double y;

  public Point(double x, double y) { 
		this.x = x;
		this.y = y;
  }

	public double getX() {  
		return x;
	}

  public void setX(double x) {
    this.x = x;
  }

	public double getY() {  
		return y;
	}

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) return true;

    if (otherObject == null) return false;

    if (getClass() != otherObject.getClass()) return false;

    Point other = (Point) otherObject;
    return this.x == other.x && this.y == other.y;
  }

  @Override
  public int hashCode() {
    return (int)this.x ^ (int)this.y;
  }

  @Override
  public Point clone() {
    return new Point(this.x, this.y);
  }
}
