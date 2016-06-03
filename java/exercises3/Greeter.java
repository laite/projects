package exercises3;

public class Greeter implements Runnable {
  private int n;
  private String target;

  Greeter (int n, String target) {
    this.n = n;
    this.target = target;
  }

  public void run () {
    for (int index = 0; index < this.n; index++) {
      System.out.println("Hello, " + this.target);
    }
  }
}

