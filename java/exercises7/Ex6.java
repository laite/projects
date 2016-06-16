package exercises7;

import java.util.*;

public class Ex6 {
  public static void main(String[] args) {
    Map<String, Set<Integer>> contents = new HashMap<String, Set<Integer>>();
    Set<Integer> numbers = new HashSet<Integer>();

    numbers.add(1);
    numbers.add(2);
    contents.put("Numbers", numbers);

    System.out.println(contents.get("Numbers"));
  }
}
