package exercises2;

public class Ex6Point {

  private double x;
  private double y;

  Ex6Point() { 
    this.x = 0;
    this.y = 0;
  }

  Ex6Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX () {
    return this.x;
  }

  public double getY () {
    return this.y;
  }

  public String toString () {
    return String.format("Point %.1f, %.1f", this.x, this.y);
  }

  public Ex6Point translate (double x, double y) {
    this.x += x;
    this.y += y;
    return this;
  }

  public Ex6Point scale(double factor) {
    this.x *= factor;
    this.y *= factor;
    return this;
  }
}

