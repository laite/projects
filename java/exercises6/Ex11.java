package exercises6;

import java.util.*;

public class Ex11 {
  public static void main (String[] args) {

    Integer[] array = new Integer[]{ 1, 2, 9, 4, 5 };
    Pair<Integer> pair = MyArrays.minMax(array);

    System.out.println(pair.first() + ", " + pair.second());
  }
}

