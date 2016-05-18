package helloworld;

import java.util.*;

public class Friends {

  ArrayList<String> friends = new ArrayList<>();

  Friends(String[] originalFriends) {
    friends = new ArrayList<String>(Arrays.asList(originalFriends));
  }

  Friends(ArrayList<String> originalFriends) {
    friends = originalFriends;
  }

  public void addFriends(String... friends) {
    for (String friend : friends) {
      this.friends.add(friend);
    }
  }

  public ArrayList<String> getFriends() {
    return friends;
  }

}
