package exercises5;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Ex5 {
  public static void main (String[] args) {
    try {
      Scanner in = new Scanner(Paths.get("./exercises5/words.txt"));
      PrintWriter out = new PrintWriter("./exercises5/output-ex5-5.txt");

      try {
        while (in.hasNext()) {
          String word = in.next();
          out.println(word.toLowerCase());
        }
      } catch (Exception e) {
        System.out.println("Error in the read-loop: " + e.getMessage());
      } finally {
        try {
          in.close();
          out.close();
        } catch (Exception e) {
          System.out.println("Error in closing the in/out: " + e.getMessage());
        }
      }
    } catch (Exception e) {
      System.out.println("Error in creating scanner/printwriter: " + e.getMessage());
    }

  }
}

