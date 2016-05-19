package exercises1;

import java.util.*;

public class Ex13 {
  public static void main (String[] args) {
    ArrayList<Integer> pool = new ArrayList<>();
    ArrayList<Integer> picks = new ArrayList<>();

    for (int i = 1; i <= 49; i++) {
      pool.add(i);
    }

    Random r = new Random();
    for (int picked = 0; picked < 7; picked++) {
      int nextPickIndex = r.nextInt(pool.size());
      int nextPick = pool.get(nextPickIndex);
      picks.add(nextPick);
      pool.remove(nextPickIndex);
    }

    Collections.sort(picks);

    System.out.println("Lottery numbers are: " + picks);
  }
}

