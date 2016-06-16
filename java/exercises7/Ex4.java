package exercises7;

import java.util.*;

public class Ex4 {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < 32000; i++)
      list.add(i);

    ListIterator<Integer> a = list.listIterator();
    ListIterator<Integer> b = list.listIterator();

    // Produces ConcurrentModificationException
    while (a.hasNext()) {
      a.next();
      b.next();
      b.add(45);
    }
  }
}
