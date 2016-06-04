package exercises4;

public abstract class Shape {

  protected Point p;

  public Shape(Point p) {
    this.p = p;
  }

  public abstract void moveBy(double dx, double dy);
  public abstract Point getCenter();
}
