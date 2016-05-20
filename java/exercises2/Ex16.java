package exercises2;

public class Ex16 {
  public static void main (String[] args) {
    Queue q = new Queue();

    q.add("Test");
    q.add("Test2");

    q.printNodes();

    System.out.println("---");

    q.remove();
    q.add("Test3");

    q.printNodes();

    System.out.println("---");
    q.remove();
    q.remove();
    q.printNodes();
  }
}

