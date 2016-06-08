package exercises6;

import java.util.*;
import java.util.function.*;

public class Ex15 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<String> newList = map(list, x -> "x: " + x.toString());

    System.out.println(list);
    System.out.println(newList);
  }

  public static <E, F> ArrayList<F> map(ArrayList<E> list, Function<E, F> mapFn) {
    ArrayList<F> newList = new ArrayList<>();
    for (E item : list) {
      newList.add(mapFn.apply(item));
    }

    return newList;
  }
}
