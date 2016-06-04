package exercises4;

public class LabeledPoint extends Point {

  private String label;

  public LabeledPoint(String label, double x, double y) { 
    super(x, y);
    this.label = label;
  }

  public String getLabel() {  
    return label;
  }

  @Override
  public String toString() {
    return this.label + " (" + this.x + ", " + this.y + ")";
  }

  @Override
  public boolean equals(Object otherObject) {
    if (!super.equals(otherObject)) return false;

    LabeledPoint other = (LabeledPoint) otherObject;
    return this.label == other.label;
  }

  @Override
  public int hashCode() {
    return this.label.hashCode() + super.hashCode();
  }
}
