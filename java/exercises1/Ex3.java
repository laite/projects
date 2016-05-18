package exercises1;

import java.util.*;

public class Ex3 {

  static final int AMOUNT_OF_NUMBERS = 3;

  public static void main (String[] args) {
    System.out.println("Please give me numbers three");

    Scanner in = new Scanner(System.in);

    int[] numbers = new int[AMOUNT_OF_NUMBERS];

    for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
      numbers[i] = in.nextInt();
    }

    System.out.println("The largest of your numbers was " + max(numbers));
  }

  public static int max (int... numbers) {
    int max = Integer.MIN_VALUE;
    for (int number : numbers) {
      max = Math.max(number, max);
    }
    return max;
  }

}

