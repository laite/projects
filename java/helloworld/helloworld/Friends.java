package helloworld;

import java.util.*;

public class Friends {

  ArrayList<String> friends = new ArrayList<>();

  Friends(String[] friends) {
    for (String f : friends) {
      this.addFriend(f);
    }
  }

  public void addFriend (String friend) {
    friends.add(friend);
  }

  public void showFriends() {
    System.out.println("My friends are:");
    for (String f : friends) {
      System.out.println("  * " + f);
    }
  }
}

