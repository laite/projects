package exercises7;

import java.util.*;

public class Ex2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Tim");
    list.add("Tom");
    list.add("R2-D2");

    System.out.println(lowerCaseIterator(new ArrayList<>(list)));
    System.out.println(lowerCaseLoop(new ArrayList<>(list)));
    System.out.println(lowerCaseReplace(new ArrayList<>(list)));
  }

  public static ArrayList<String> lowerCaseIterator(ArrayList<String> list) {
    ListIterator<String> iter = list.listIterator();

    while (iter.hasNext()) {
      String next = iter.next();
      iter.set(next.toLowerCase());
    }
    return list;
  }

  public static ArrayList<String> lowerCaseLoop(ArrayList<String> list) {
    for (int index = 0; index < list.size(); index++) {
      list.set(index, list.get(index).toLowerCase());
    }
    return list;
  }

  public static ArrayList<String> lowerCaseReplace(ArrayList<String> list) {
    list.replaceAll(String::toLowerCase);
    return list;
  }
}
