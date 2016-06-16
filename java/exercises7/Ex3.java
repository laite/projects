package exercises7;

import java.util.*;

public class Ex3 {
  public static void main(String[] args) {
    Set<String> a = new HashSet<String>();
    Set<String> b = new HashSet<String>();
    a.add("Tim");
    a.add("Batman");
    b.add("Tim");
    b.add("Robin");

    System.out.println("A: " + a);
    System.out.println("B: " + b);
    System.out.println("Union: " + union(new HashSet<>(a), new HashSet<>(b)));
    System.out.println("Intersection: " + intersection(new HashSet<>(a), new HashSet<>(b)));
    System.out.println("Difference: " + difference(new HashSet<>(a), new HashSet<>(b)));
  }

  public static Set<String> union(Set<String> a, Set<String> b) {
    a.addAll(b);
    return a;
  }

  public static Set<String> intersection(Set<String> a, Set<String> b) {
    a.retainAll(b);
    return a;
  }

  public static Set<String> difference(Set<String> a, Set<String> b) {
    Set<String> temp = new HashSet<String>(a);
    a.removeAll(b);
    b.removeAll(temp);
    return union(a, b);
  }
}
