package exercises7;

import java.util.*;

public class Ex5 {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("Tim");
    list.add("Tom");
    swap(list, 0, 1);
  }

  public static <T> void swap(List<T> list, int i, int j) {

    // Didn't really understand the exercise description, so here's the same implementation twice :/
    if (list instanceof RandomAccess) {
      T temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j, temp);
    } else {
      System.out.println("We're on a strange country");
      T temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j, temp);
    }
    
    System.out.println(list);
  }
}
