package exercises4;

public class DiscountedItem extends Item {

  private double discount;

  public DiscountedItem(String description, double price, double discount) { 
    super(description, price);
		this.discount = discount;
  }

	public void setDiscount(double description) {
  	this.discount = discount;
	}

	public double getDiscount() {  
		return discount;
	}

  @Override
  public boolean equals(Object otherObject) {
    if (otherObject instanceof DiscountedItem) {
      if (!super.equals(otherObject)) {
        return false;
      }

      DiscountedItem other = (DiscountedItem) otherObject;
      
      return other.discount == this.discount;
    } else if (otherObject instanceof Item) {
      return super.equals(otherObject);
    } else {
      return false;
    }
    
  }

  @Override
  public int hashCode() {
    return super.hashCode() + (int)discount;
  }
}
