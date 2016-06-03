package exercises3;

import java.io.*;

public class Ex11 {
  public static void main (String[] args) {
    listFilesEnding(".java");
  }

  public static void listFilesEnding (String suffix) {
    File path = new File("./exercises3/");

    File[] files = path.listFiles(f -> f.getName().endsWith(suffix));
    
    for (File f : files) {
      System.out.println(f.toString());
    }
  }
}

