package exercises1;

import java.util.*;

public class Ex7 {

  public static void main (String[] args) {
    System.out.println("Give two numbers");

    Scanner in = new Scanner(System.in);

    short a = in.nextShort();
    short b = in.nextShort();

    System.out.println((a + b));
    System.out.println((a - b));
    System.out.println((a * b));
    System.out.println((a / b));
    System.out.println((a % b));
  }

}

