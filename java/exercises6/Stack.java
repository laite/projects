package exercises6;

import java.util.*;

public class Stack<E> {
  ArrayList<E> list;

  public void push(E element) {
    list.add(element);
  }

  public E pop() {
    return list.remove(0);
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }
}

