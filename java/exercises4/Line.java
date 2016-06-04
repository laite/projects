package exercises4;

import java.lang.Math;

public class Line extends Shape implements Cloneable {

  private Point to;

  public Line(Point from, Point to) {
    super(from);
    this.to = to;
  }

  public void moveBy(double dx, double dy) {
    this.p.setX(this.p.getX() + dx);
    this.p.setY(this.p.getY() + dy);

    this.to.setX(this.to.getX() + dx);
    this.to.setY(this.to.getY() + dy);
  }

  public Point getCenter() {
    double x = Math.min(this.p.x, this.to.x) + (Math.max(this.p.x, this.to.x) - Math.min(this.p.x, this.to.x))/2;
    double y = Math.min(this.p.y, this.to.y) + (Math.max(this.p.y, this.to.y) - Math.min(this.p.y, this.to.y))/2;
    return new Point(x, y);
  }

  public Line clone() throws CloneNotSupportedException {
    try {
      Line cloned = (Line) super.clone();
      cloned.p = this.p.clone();
      cloned.to = this.to.clone();
      return cloned;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

