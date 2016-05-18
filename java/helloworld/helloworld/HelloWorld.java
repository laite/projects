package helloworld;

import java.util.*;

public class HelloWorld {
  public static void main (String[] args) {

    final String[] FRIENDS = { "Tim Tom", "That cute girl from the cafeteria", "Mom" };

    Friends myFriends = new Friends(FRIENDS);
    Friends yourFriends = new Friends(new ArrayList<String>());
    yourFriends.addFriends("Me");
    yourFriends.addFriends("That crazy guy at the library", "Johnnie F");

    FriendViewer showFriends = friends -> {
      for (String f : friends) {
        System.out.println("  * " + f);
      }
    };

    System.out.println("My friends are:");
    showFriends.sayTheirNames(myFriends.getFriends());

    System.out.println("Your friends are:");
    showFriends.sayTheirNames(yourFriends.getFriends());
  }

  interface FriendViewer {
    void sayTheirNames(ArrayList<String> friends);
  }
}
