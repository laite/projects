package exercises6;

import java.util.*;

public class Ex12 {
  public static void main (String[] args) {
    minmax(Arrays.asList(1, 2, 3, 9, 0, 4), Integer::compareTo, new ArrayList<Object>());
  }

  public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
    Collections.sort(elements, comp);
    result.add(elements.get(0));
    result.add(elements.get(elements.size() - 1));

    System.out.println(result);
  }
}

