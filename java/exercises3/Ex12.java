package exercises3;

import java.io.*;
import java.util.*;

public class Ex12 {
  public static void main (String[] args) {
    sortFiles();
  }

  public static void sortFiles () {
    File path = new File(".");

    File[] files = path.listFiles();
    
    Arrays.sort(files, (a, b) -> {
      if (a.isDirectory() && !b.isDirectory()) {
        return -1;
      } else if (b.isDirectory() && !a.isDirectory()) {
        return 1;
      } else {
        return a.getName().compareTo(b.getName());
      }
    });

    for (File f : files) {
      String suffix = "";
      if (f.isDirectory()) {
        suffix = "/";
      }

      System.out.println(f.getName() + suffix);
    }
  }
}

