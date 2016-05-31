package exercises3;

public class Employee implements Measurable {
  private String name;
  private double salary;

  Employee (String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double getMeasure () {
    return this.salary;
  }

  public double getSalary () {
    return this.salary;
  }

  public String getName () {
    return this.name;
  }

  public String toString() {
    return this.name + " / " + this.salary + "€";
  }

}

