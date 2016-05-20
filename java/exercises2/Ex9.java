package exercises2;

import java.util.*;

public class Ex9 {
  public static void main (String[] args) {
    Car mazda = new Car(4.7, 50);
    Car hummer = new Car(14.9, 120);

    Random r = new Random();
    while (mazda.drive(r.nextInt(100))) { ; }
    while (hummer.drive(r.nextInt(100))) { ; }

    System.out.println("Total driven with Mazda: " + mazda.getDistance() + " kilometres.");
    System.out.println("Total driven with Hummer: " + hummer.getDistance() + " kilometres.");
  }
}

