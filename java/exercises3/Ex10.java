package exercises3;

import java.io.*;

public class Ex10 {
  public static void main (String[] args) {
    listFilesIn(".");
  }

  public static void listFilesIn (String pathname) {
    File path = new File(pathname);

    File[] files = listFilesWithLambda(path); // listFilesWithAnonymousClass(path);
    
    for (File f : files) {
      System.out.println(f.toString());
    }
  }

  public static File[] listFilesWithLambda (File path) {
    return path.listFiles(f -> f.isDirectory());
  }

  public static File[] listFilesWithAnonymousClass (File path) {
    return path.listFiles(new FileFilter () {
      public boolean accept (File f) {
        return f.isDirectory();
      }
    });

  }

}

