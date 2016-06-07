package exercises5;

import java.io.*;

public class Ex10 {
  public static void main (String[] args) {
    int value = factorial(6, 1);

    assert value == (6*5*4*3*2*1);

    System.out.println("Ok, value was " + value);
  }

  public static int factorial(int n, int value) {
    if (n == 0)
      return value;

    int newValue = value * n;

    Exception e = new Exception();
    System.out.println("Stack trace - n = " + n);
    e.printStackTrace(System.out);

    return factorial(n - 1, newValue);
  }
}

