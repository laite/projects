package exercises2;

public class Ex13 {
  public static void main (String[] args) {
    Network myFace = new Network();
    Network.Member tim = myFace.enroll("Tim Tom");

    tim.leave();
  }
}

