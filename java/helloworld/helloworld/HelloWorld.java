package helloworld;

public class HelloWorld {
  public static void main (String[] args) {
    System.out.println("Hello, World!");

    Friends myFriends = new Friends();

    myFriends.addFriends("Tim Tom");
    myFriends.addFriends("That cute girl from the cafeteria");
    myFriends.showFriends();
  }
}
