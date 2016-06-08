package exercises6;

import java.util.*;

public class Ex10 {
  public static void main (String[] args) {

    Integer[] array = new Integer[]{ 1, 2, 9, 4, 5 };
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

    Pair<Integer> pair = MyArrays.firstLast(list);

    System.out.println(pair.first() + ", " + pair.second());
    System.out.println(pair.max());

    System.out.println(MyArrays.min(array));
    System.out.println(MyArrays.max(array));
  }
}

