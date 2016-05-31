package exercises3;

import java.util.*;

public class Ex2 {
  public static void main (String[] args) {
    Employee[] employees = { new Employee("Tim", 12000), new Employee("Tom", 16800) };

    Employee largestSalary = (Employee) largest(employees);
    System.out.println("Largest salary: " + largestSalary.getName() + " - " + largestSalary.getSalary() + "€!");
  }

  static double average (Measurable[] objects) {
    double sum = 0, count = 0;
    for (Measurable obj : objects) {
      count++;
      sum += obj.getMeasure();
    }
    return sum / count;
  }

  static Measurable largest (Measurable[] objects) {
    Collections.sort(Arrays.asList(objects), (Measurable a, Measurable b) -> (int)(b.getMeasure() - a.getMeasure()));
    return objects[0];
  }
}

