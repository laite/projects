package exercises6;

import java.util.*;

public class MyArrays {
  public static <E extends Integer> Pair<E> firstLast(ArrayList<E> list) {
    return new Pair<E>(list.get(0), list.get(list.size() - 1));
  }

  public static <E extends Integer> E min(E[] arr) {
    if (arr.length == 0)
      return null;

    E min = arr[0];
    for (E element : arr) {
      if (element < min) {
        min = element;
      }
    }

    return min;
  }

  public static <E extends Integer> E max(E[] arr) {
    if (arr.length == 0)
      return null;

    E max = arr[0];
    for (E element : arr) {
      if (element > max) {
        max = element;
      }
    }

    return max;
  }

  public static <E extends Integer> Pair<E> minMax(E[] arr) {
    E smallest = min(arr);
    E largest = max(arr);

    return new Pair<E>(smallest, largest);
  }
}

