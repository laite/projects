package exercises2;

import java.util.*;

public class Network {
  public class Member {
    private String name;
    private ArrayList<Member> friends;

    public Member(String name) {
      this.name = name;
      friends = new ArrayList<>();
    }

    public void leave () {
      System.out.println("Leaving...");
      members.remove(this);
    }
  }

  public Network() {
    members = new ArrayList<>();
  }

  public Member enroll (String name) {
    Member newMember = new Member(name);
    members.add(newMember);
    return newMember;
  }

  private ArrayList<Member> members;
}
