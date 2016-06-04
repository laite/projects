package exercises4;

public class Rectangle extends Shape {

  private double width;
  private double height;

  public Rectangle(Point topLeft, double width, double height) {
    super(topLeft);
    this.width = width;
    this.height = height;
  }

  public void moveBy(double dx, double dy) {
    this.p.setX(this.p.getX() + dx);
    this.p.setY(this.p.getY() + dy);
  }

  public Point getCenter() {
    return new Point(this.p.getX() + (width / 2), this.p.getY() + (height / 2));
  }
}

