package helloworld;

import java.util.*;

public class Friends {

  ArrayList<String> friends = new ArrayList<>();

  public void addFriends (String friend) {
    friends.add(friend);
  }

  public void showFriends() {
    System.out.println("My friends are:");
    for (String a : friends) {
      System.out.println(a);
    }
  }
}

