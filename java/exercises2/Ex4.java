package exercises2;

import org.omg.CORBA.*;

public class Ex4 {
  public static void main (String[] args) {
    IntHolder a = new IntHolder(2);
    IntHolder b = new IntHolder(5);

    System.out.println(a.value + " / " + b.value);

    swap(a, b);

    System.out.println(a.value + " / " + b.value);
  }

  public static void swap (IntHolder a, IntHolder b) {
    int temp = a.value;
    a.value = b.value;
    b.value = temp;
  }
}

