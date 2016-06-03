package exercises3;

import java.util.*;

public class Ex9 {
  public static void main (String[] args) {
    Greeter tim = new Greeter(5, "Tim");
    Greeter bumber = new Greeter(5, "Bumbernickel");
    Greeter sam = new Greeter(5, "Sammy");
    Greeter philip = new Greeter(5, "Philip");

    runTogether(tim, bumber, sam, philip);

    System.out.println("--");

    runInOrder(sam, philip);
  }

  public static void runTogether (Runnable ...tasks) {
    ArrayList<Thread> threads = new ArrayList<>();

    for (Runnable task : tasks) {
        Thread t = new Thread(task);
        t.start();
        threads.add(t);
    }

    for (Thread t : threads) {
      try {
        t.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void runInOrder (Runnable ...tasks) {
    for (Runnable task : tasks) {
      task.run();
    }
  }
}

