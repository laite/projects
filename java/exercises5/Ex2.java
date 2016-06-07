package exercises5;

import java.util.*;
import java.io.*;

public class Ex2 {
  public static void main (String[] args) {
    try {
      System.out.println(sumOfValues("doubles.txt"));
    } catch (IOException e) {
      System.out.println("IO Error! " + e.getMessage());
      return;
    } catch (NumberFormatException e) {
      System.out.println("Number format error! " + e.getMessage());
      return;
    }

  }

  public static Double sumOfValues(String filename) throws IOException, NumberFormatException {
    ArrayList<Double> valuesFromFile = new ArrayList<>();
    valuesFromFile = readValues(filename);

    double value = 0;
    for (Double valueFromFile : valuesFromFile) {
      value += valueFromFile;
    }

    return value;
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

