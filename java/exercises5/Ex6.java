package exercises5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex6 {
  public static void main (String[] args) {
    optionA();
    optionC();
  }

  // Catch the exception in finally clause
  public static void optionA () {
    BufferedReader in = null;
    try {
      in = Files.newBufferedReader(Paths.get("./exercises5/words.txt"));
      
    } catch (IOException ex) {
      System.err.println("Caught IOException: " + ex.getMessage());
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {

        }
      }
    }
  }

  // try with recources
  public static void optionC () {
    try (BufferedReader in = Files.newBufferedReader(Paths.get("./exercises5/words.txt"))) {
      in.readLine();
    } catch (IOException ex) {
      System.err.println("Caught IOException: " + ex.getMessage());
    }
  }
}

