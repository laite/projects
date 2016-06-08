package exercises6;

public class Ex1 {
  public static void main (String[] args) {
    Stack<String> strings = new Stack<>();
    strings.push("Hello");
    strings.push("World");

    assert strings.isEmpty() == false;
  }
}

