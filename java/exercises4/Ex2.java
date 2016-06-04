package exercises4;

public class Ex2 {
  public static void main (String[] args) {
    Point p1 = new Point(10, 20);
    Point p2 = new Point(10, 20);

    System.out.println(p1 + " / " + p1.hashCode());
    System.out.println(p2 + " / " + p2.hashCode());

    if (p1.equals(p2) && p2.equals(p1)) {
      System.out.println("Points p1 and p2 are equal!");
    }

    LabeledPoint lp1 = new LabeledPoint("Test", 5, 6);
    LabeledPoint lp2 = new LabeledPoint("Test", 5, 6);
    LabeledPoint lp3 = new LabeledPoint("Test", 7, 6);

    System.out.println(lp1 + " / " + lp1.hashCode());
    System.out.println(lp2 + " / " + lp2.hashCode());
    System.out.println(lp3 + " / " + lp3.hashCode());

    if (lp1.equals(lp2) && lp2.equals(lp1)) {
      System.out.println("Points lp1 and lp2 are equal!");
    }

    if (!lp1.equals(lp3) && !lp3.equals(lp1)) {
      System.out.println("Points lp1 and lp3 are not equal!");
    }
  }
}

