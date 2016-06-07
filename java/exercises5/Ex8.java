package exercises5;

public class Ex8 {
  public static void main (String[] args) {
    try (Lock lock = new Lock()) {
      System.out.println(lock.isLocked());
    } catch (Exception e) {
      System.out.println("An exception " + e.getMessage());
    }
  }
}

