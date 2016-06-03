package exercises3;

public class Ex4 {
  public static void main (String[] args) {

    IntSequence arbitrary = IntSequence.of(1, 2, 3, 5, 9, 11);

    while (arbitrary.hasNext()) {
      System.out.println(arbitrary.next());
    }
  }
}

