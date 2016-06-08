package exercises6;

public class Ex8 {
  public static void main (String[] args) {

    Pair<Integer> pair = new Pair<>(1, 9);

    System.out.println(pair.first() + ", " + pair.second());
    System.out.println("Max: " + pair.max());
    System.out.println("Min: " + pair.min());
  }
}

