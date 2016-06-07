package exercises5;

import java.util.*;
import java.io.*;

public class Ex1 {
  public static void main (String[] args) {
    ArrayList<Double> valuesFromFile = new ArrayList<>();

    try {
      valuesFromFile = readValues("doubles.txt");
    } catch (IOException e) {
      System.out.println("IO Error! " + e.getMessage());
      return;
    } catch (NumberFormatException e) {
      System.out.println("Number format error! " + e.getMessage());
      return;
    }

    for (Double value : valuesFromFile) {
      System.out.println(value);
    }
  }

  public static ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException {
    ArrayList<Double> values = new ArrayList<>();

    BufferedReader br = new BufferedReader(new FileReader(filename));
    String line = br.readLine();

    while (line != null) {
      values.add(Double.parseDouble(line));
      line = br.readLine();
    }

    return values;
  }
}

