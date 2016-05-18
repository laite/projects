package exercises1;

import java.util.*;

public class Ex2 {
  public static void main (String[] args) throws InputMismatchException {
    System.out.print("Hey, give me an angle! ");

    Scanner in = new Scanner(System.in);
    int readAngle;

    try {
      readAngle = in.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("That's a *bad* angle.");
      return;
    }

    int formattedAngle = formatAngle(readAngle);
    System.out.printf("Your angle, formatted: %d degrees.\n", formattedAngle);
    
    formattedAngle = formatAngleWithFloorMod(readAngle);
    System.out.printf("Your angle, formatted as an positive: %d degrees.\n", formattedAngle);
  }

  public static int formatAngle (int angle) {
    return angle % 360;
  }

  public static int formatAngleWithFloorMod (int angle) {
    return Math.floorMod(angle, 360);
  }
}

