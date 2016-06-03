package exercises3;

import java.util.*;

public class Ex7 {

  private static final int MAX_COUNTER = 15;

  public static void main (String[] args) {
    List<String> strings = Arrays.asList("T-1000", "Commodore", "iPad", "subsonic overdriver");
    Comparator<String> orderComparator = (x, y) -> x.length() - y.length();

    luckySort(strings, orderComparator);
  }

  public static void luckySort(List<String> strings, Comparator<String> comp) {
    int counter = 0;

    while (counter < MAX_COUNTER) {
      Collections.shuffle(strings);
      counter++;

      System.out.println(strings);

      if (areInOrder(strings, comp)) {
        break;
      }
    }

    if (counter < MAX_COUNTER) {
      System.out.println("Found the correct order after " + counter + " iterations!");
    } else {
      System.out.println("Couldn't found the correct order in " + MAX_COUNTER + " iterations :(");
    }
  }

  public static boolean areInOrder (List<String> strings, Comparator<String> comp) {
    for (int i = 0; i < strings.size() - 1; i++ ) {
      int result = comp.compare(strings.get(i), strings.get(i+1));
      if (result > 0) {
        return false;
      }
    }
    return true;
  }
}

