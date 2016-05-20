package exercises2;

import java.util.*;

public class RandomNumbers {
  private static Random generator = new Random();

  public static int randomElement (int[] elements) {
    if (elements.length == 0) {
      return 0;
    }

    return elements[generator.nextInt(elements.length)];
  }

  public static int randomElement (List<Integer> elements) {
    if (elements.size() == 0) {
      return 0;
    }

    return elements.get(generator.nextInt(elements.size()));
  }
}
