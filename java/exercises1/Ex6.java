package exercises1;

import java.util.*;
import java.math.*;

public class Ex6 {

  public static void main (String[] args) {
    final int FACTOR = 15;

    BigInteger result = BigInteger.valueOf(1);

    for (int i = 1; i <= FACTOR; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }

    System.out.println("Result of " + FACTOR + "! is " + result.toString());
  }

}

