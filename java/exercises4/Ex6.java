package exercises4;

public class Ex6 {
  public static void main (String[] args) {
    Item book = new Item("Book", 19);

    DiscountedItem disc = new DiscountedItem("Book", 19, 50);
    DiscountedItem disc2 = new DiscountedItem("Book", 19, 20);

    // Transition fails here
    // disc == book,
    // book == disc2,
    // but disc != disc2
    System.out.println(disc.equals(book));
    System.out.println(book.equals(disc2));
    System.out.println(disc.equals(disc2));

  }
}

