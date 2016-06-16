package exercises7;

import java.util.*;

public class Ex1 {
  public static void main(String[] args) {
    System.out.println(sieve(50));
  }

  public static HashSet<Integer> sieve(int n) {
    HashSet<Integer> result = new HashSet<>();
    
    for (int i = 2; i <= n; i++)
      result.add(i);

    for (int s = 2; Math.pow(s, 2) <= n; s++) {
      for (int next = s*s, increase = 0; next < n; increase++) {
        result.remove(next);
        next = s * (s + increase);
      }
    }

    return result;
  }
}
