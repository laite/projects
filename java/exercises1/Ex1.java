package exercises1;

import java.util.*;

public class Ex1 {
  public static void main (String[] args) {
    System.out.print("Yep, give me an int! ");

    Scanner in = new Scanner(System.in);
    int readInt = in.nextInt();
    System.out.printf("Your number as a hexadecimal: %x\n", readInt);
    System.out.printf("Your number as a octal: %o\n", readInt);
  }
}

