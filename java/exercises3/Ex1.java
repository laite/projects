package exercises3;

public class Ex1 {
  public static void main (String[] args) {
    Employee[] employees = { new Employee("Tim", 12000), new Employee("Tom", 16800) };

    System.out.println(average(employees));
  }

  static double average (Measurable[] objects) {
    double sum = 0, count = 0;
    for (Measurable obj : objects) {
      count++;
      sum += obj.getMeasure();
    }
    return sum / count;
  }
}

