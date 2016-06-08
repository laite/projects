package exercises6;

import java.util.*;

public class Ex9 {
  public static void main (String[] args) {

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    Pair<Integer> pair = MyArrays.firstLast(list);

    System.out.println(pair.first() + ", " + pair.second());
    System.out.println(pair.max());
  }
}

