package exercises6;

public class Ex3 {
  public static void main (String[] args) {
    Table<String, Integer> table = new Table<>();

    table.put("Test", 15);
    table.put("Another", 2);

    System.out.println(table.get("Test"));
    System.out.println(table.get("Test"));
    System.out.println(table.get("Another"));

    table.remove("Test");
    assert table.get("Test") == null;
    assert table.get("Another") == 2;
  }
}

