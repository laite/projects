package exercises2;

public class Ex5 {
  public static void main (String[] args) {
    Ex5Point p = new Ex5Point(3, 4).translate(1, 3).scale(0.5);

    System.out.println(p);
  }
}

