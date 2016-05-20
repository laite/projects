package exercises2;

import java.util.*;
import java.util.stream.*;

public class Ex10 {
  public static void main (String[] args) {
    int[] elems = { 1, 2, 3, 4 };
    List<Integer> elemsList = IntStream.of(elems).boxed().collect(Collectors.toList());

    System.out.println(RandomNumbers.randomElement(elems));
    System.out.println(RandomNumbers.randomElement(elemsList));
  }
}

