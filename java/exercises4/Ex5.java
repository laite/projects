package exercises4;

public class Ex5 {
  public static void main (String[] args) {

    Line l = new Line(new Point(10, 10), new Point(20, 20));
    System.out.println(l.getCenter());

    Line l2;
    try {
      l2 = l.clone();
    } catch (CloneNotSupportedException e) {
      return;
    }

    l.moveBy(1, 0);
    l2.moveBy(5, -5);
    System.out.println(l.getCenter());
    System.out.println(l2.getCenter());
  }
}

