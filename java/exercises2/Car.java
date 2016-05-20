package exercises2;

public class Car {
  private int distanceDriven;
  private double fuelLeft;
  private double efficiency;
  
  public Car(double efficiency, int fuel) {
    this.efficiency = efficiency;
    this.fuelLeft = fuel;
  }

  public boolean drive (int km) {
    double fuelTaken = (km / 100.0) * efficiency;

    if (fuelTaken > fuelLeft) {
      int kilometresLeft = (int) Math.floor(100 / this.efficiency * this.fuelLeft);

      System.out.println("Run out of fuel after " + kilometresLeft + " kilometres");

      this.fuelLeft = 0;
      this.distanceDriven += kilometresLeft;

      return false;
    }

    System.out.println("You drive for " + km + " kilometres.");

    this.fuelLeft -= fuelTaken;
    this.distanceDriven += km;

    return true;
  }

  public double getFuel () {
    return this.fuelLeft;
  }

  public int getDistance () {
    return this.distanceDriven;
  }
}

