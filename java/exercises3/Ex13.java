package exercises3;

import java.io.*;
import java.util.*;

public class Ex13 {
  public static void main (String[] args) {
    Runnable tim = () -> System.out.println("Timmy!");
    Runnable tom = () -> System.out.println("Tom!");
    Runnable philip = () -> System.out.println("Philip?");

    combineRunnables(tim, tom, philip).run();
  }

  public static Runnable combineRunnables (Runnable ...tasks) {
    return () -> {
      for (Runnable task : tasks) {
        task.run();
      }
    };
  }

}

