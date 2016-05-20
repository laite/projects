package exercises2;

public class Ex17 {
  public static void main (String[] args) {
    Queue q = new Queue();

    q.add("Test");
    q.add("Test2");
    q.add("Test3");

    Queue.Iterator iter = q.iterator();

    while (iter.hasNext()) {
      Queue.Node n = iter.next();
      System.out.println(n.getValue());
    }
  }
}

