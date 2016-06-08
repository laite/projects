package exercises6;

public class Ex2 {
  public static void main (String[] args) {
    Stack2<String> strings = new Stack2<String>(new String[0]);
    strings.push("Hello");
    strings.push("World");

    assert strings.isEmpty() == false;

    System.out.println(strings.pop());
    System.out.println(strings.pop());

    assert strings.isEmpty() == true;

    strings.push("Hello again");
    strings.push("1");
    strings.push("2");
    strings.push("3");

    System.out.println(strings.pop());
    System.out.println(strings.pop());

    assert strings.isEmpty() == false;
  }
}

