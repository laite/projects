package exercises6;

public class Pair<E extends Integer> {

  private E first;
  private E second;

  public Pair(E first, E second) {
    this.first = first;
    this.second = second;
  }

  public E first() {
    return this.first;
  }

  public E second() {
    return this.second;
  }

  public E max() {
    return (this.first > this.second) ? this.first : this.second;
  }

  public E min() {
    return (this.first < this.second) ? this.first : this.second;
  }
}
