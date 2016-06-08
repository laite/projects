package exercises6;

import java.util.*;
import java.io.*;

public class Ex14 {

  public static class Closer implements AutoCloseable {
    private String name;

    Closer(String name) {
      this.name = name;
    }

    @Override
    public void close() throws IOException {
      throw new IOException("Test" + this.name);
    }
  }

  public static void main (String[] args) {
    ArrayList<Closer> elems = new ArrayList<>();
    elems.add(new Ex14.Closer("1"));
    elems.add(new Ex14.Closer("2"));
    elems.add(new Ex14.Closer("3"));

    try {
      closeAll(elems);
    } catch (Exception e) {
      System.out.println("Caught error: " + e.getMessage());
      Throwable[] suppressed = e.getSuppressed();
      if (suppressed.length > 0) {
        System.out.println("There are suppressed errors!");
      }

      for (Throwable t : suppressed) {
        System.out.println(t.getMessage());
      }
    }
    
  }

  public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
    Exception exception = null;
    for (T elem : elems) {
      try {
        elem.close();
      } catch (Exception e) {
        if (exception == null) {
          exception = new Exception(e);
        } else {
          exception.addSuppressed(e);
        }
      }
    }

    if (exception != null) {
      throw exception;
    }
  }
}

