package exercises6;

import java.util.*;

public class Stack2<E> {
  E[] list;
  int size;

  public Stack2(E[] initialList) {
    this.list = initialList;
    this.size = initialList.length;
  }

  public void push(E element) {
    size++;
    if (this.list.length < size) {
      @SuppressWarnings("unchecked")
      E[] newArray = (E[]) java.lang.reflect.Array.newInstance(this.list.getClass().getComponentType(), size + 1);
      for (int i = 0; i < this.list.length; i++) {
        newArray[i] = this.list[i];
      }
      this.list = newArray;
    }
    list[size-1] = element;
  }

  public E pop() {
    ArrayList<E> asList = new ArrayList<E>(Arrays.asList(this.list));
    E first = asList.remove(0);

    @SuppressWarnings("unchecked")
    E[] newArray = (E[]) asList.toArray();

    this.list = newArray;
    this.size = this.list.length;

    return first;
  }

  public boolean isEmpty() {
    return this.list.length == 0;
  }
}

