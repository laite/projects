package exercises2;

public class Ex6 {
  public static void main (String[] args) {
    Ex6Point p = new Ex6Point(3, 4).translate(1, 3).scale(0.5);

    System.out.println(p);
  }
}

