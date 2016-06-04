package exercises4;

public class Ex4 {
  public static void main (String[] args) {
    Circle c = new Circle(new Point(10, 20), 10);

    System.out.println(c.getCenter());
    c.moveBy(5, -5);
    System.out.println(c.getCenter());

    Rectangle r = new Rectangle(new Point(10, 20), 10, 10);
    System.out.println(r.getCenter());
    r.moveBy(5, -5);
    System.out.println(r.getCenter());

    Line l = new Line(new Point(10, 10), new Point(20, 20));
    System.out.println(l.getCenter());
    l.moveBy(5, -5);
    System.out.println(l.getCenter());
  }
}

