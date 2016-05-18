package exercises1;

import java.util.*;

public class Ex11 {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please give me a line with regular and exotic characters!");
    String text = in.nextLine();

    int[] codePoints = text.codePoints().toArray();

    System.out.println("These are the characters that seem strange to me...");
    for (int point : codePoints) {
      if (point > 255) {
        System.out.println(Character.toChars(point));
      }
    }
  }
}

