package exercises1;

import java.util.*;

public class Ex8 {

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Give me a String and I'll give you all its substrings!");
    String text = in.nextLine();

    ArrayList<String> substrings = findSubstrings(text);
    Collections.sort(substrings);
    printSubStrings(substrings);
  }

  public static ArrayList<String> findSubstrings (String text) {

    ArrayList<String> result = new ArrayList<>();

    for (int begin = 0; begin < text.length(); begin++) {
      for (int end = text.length(); end > begin; end--) {
        String substring = text.substring(begin, end).trim();

        if (substring.trim().length() > 0) {
          result.add(substring);
        }
      }
    }

    return result;
  }

  public static void printSubStrings (ArrayList<String> substrings) {
    for (String s : substrings) {
      System.out.println(s);
    }
  }

}

