package exercises2;

import java.util.*;

public class Queue {
  private Node head;

  public class Node {
    String value;
    Node next;

    Node (String s) {
      this.value = s;
    }

    public String getValue () {
      return this.value;
    }
  }

  public class Iterator {
    private Node current;

    Iterator () {
      current = Queue.this.head;
    }

    public Node next () {
      Node current = this.current;
      this.current = this.current.next;

      return current;
    }

    public boolean hasNext () {
      return this.current != null;
    }
  }

  public Iterator iterator() {
    return new Iterator();
  }

  public void printNodes () {
    if (this.head == null) {
      System.out.println("No nodes!");
      return;
    }

    Node n = this.head;
    while (n.next != null) {
      System.out.println(n.value);
      n = n.next;
    }
    System.out.println(n.value);
  }

  private Node lastNode () {
    Node n = this.head;
    while (n.next != null) {
      n = n.next;
    }

    return n;
  }

  public void add (String s) {
    Node newNode = new Node(s);

    if (this.head != null) {
      Node last = lastNode();
      last.next = newNode;
    } else {
      this.head = newNode;
    }
  }

  public void remove () {
    this.head = this.head.next;
  }
}
