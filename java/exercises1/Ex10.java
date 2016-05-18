package exercises1;

import java.util.*;

public class Ex10 {

  public static void main (String[] args) {
    Random r = new Random();
    final long crypt = r.nextLong();

    System.out.println(Long.toString(crypt, 36));
  }
}

