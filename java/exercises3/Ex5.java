package exercises3;

public class Ex5 {
  public static void main (String[] args) {

    IntSequence arbitrary = IntSequence.constant(1);

    int i = 0;
    while (i++ <= 10) {
      System.out.println(arbitrary.next());
    }
  }
}

