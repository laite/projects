package exercises6;

import java.util.*;

public class Ex6 {
  public static void main (String[] args) {
    ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(new String[] { "A", "B"}));
    ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(new String[] { "C", "D"}));

    System.out.println(append(list1, list2));
    System.out.println(appendSuper(list1, list2));
  }

  public static <E> ArrayList<E> append(ArrayList<? extends E> to, ArrayList<? extends E> from) {
    ArrayList<E> result = new ArrayList<E>(to);

    for (E item : from) {
      result.add(item);
    }

    return result;
  }

  public static <E> ArrayList<Object> appendSuper(ArrayList<? super E> to, ArrayList<? super E> from) {
    ArrayList<Object> result = new ArrayList<Object>(to);

    for (Object item : from) {
      result.add(item);
    }

    return result;
  }

}

