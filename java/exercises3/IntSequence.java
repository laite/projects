package exercises3;

public interface IntSequence {
  default boolean hasNext() {
    return true;
  }

  int next();

  public static IntSequence of (int ...arguments) {
    return new IntSequence() {
      private int index = 0;

      public boolean hasNext () {
        return index != arguments.length;
      }
      public int next () {
        return arguments[index++];
      }
    };
  }

  public static IntSequence constant (int value) {
    return () -> value;
  }
}

