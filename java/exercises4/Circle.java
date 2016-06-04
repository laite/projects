package exercises4;

public class Circle extends Shape {

  private double radius;

  public Circle(Point center, double radius) {
    super(center);
    this.radius = radius;
  }

  public void moveBy(double dx, double dy) {
    this.p.setX(this.p.getX() + dx);
    this.p.setY(this.p.getY() + dy);
  }

  public Point getCenter() {
    return this.p;
  }
}

