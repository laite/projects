package exercises3;

public class Ex8 {
  public static void main (String[] args) {
    Greeter tim = new Greeter(10, "Tim");
    Greeter tom = new Greeter(3, "Tom");

    new Thread(tim).start();
    new Thread(tom).start();
  }
}

