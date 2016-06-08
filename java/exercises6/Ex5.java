package exercises6;

import java.util.*;

public class Ex5 {
  public static void main (String[] args) {
    Double[] result = swap(0, 1, new Double[]{1.5, 2.0, 3.0});

    System.out.println(result[0]);
    System.out.println(result[1]);
  }

  public static <T> T[] swap(int i, int j, T[] values) {
    T temp = values[i];
    values[i] = values[j];
    values[j] = temp;
    return values;
  }
}

