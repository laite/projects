package exercises2;

public class Ex5Point {

  private double x;
  private double y;

  Ex5Point() { 
    this.x = 0;
    this.y = 0;
  }

  Ex5Point(double x, double y) {
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

  public Ex5Point translate (double x, double y) {
    return new Ex5Point(this.x + x, this.y + y);
  }

  public Ex5Point scale(double factor) {
    return new Ex5Point(this.x * factor, this.y * factor);
  }
}

