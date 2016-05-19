package exercises1;

import java.util.*;

public class Ex15 {
  public static void main (String[] args) {
    final int N = 10;

    ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
    ArrayList<Integer> firstRow = new ArrayList<Integer>();

    firstRow.add(1);
    triangle.add(firstRow);

    for (int i = 0; i < N; i++) {
      ArrayList<Integer> nextRow = getNextRow(triangle.get(i));
      triangle.add(nextRow);
    }

    for (ArrayList<Integer> i : triangle) {
      System.out.println(i);
    }
  }

  public static ArrayList<Integer> getNextRow (ArrayList<Integer> previous) {
    ArrayList<Integer> next = new ArrayList<>();

    next.add(previous.get(0));

    for (int i = 0; i < previous.size() - 1; i++) {
      next.add(previous.get(i) + previous.get(i + 1));
    }

    next.add(previous.get(previous.size() - 1));

    return next;
  }
}

