package exercises4;

public class Item {

	private String description;
	private double price;

  public Item(String description, double price) { 
		this.description = description;
		this.price = price;
  }

	public void setDescription(String description) {
  	this.description = description;
	}

	public String getDescription() {  
		return description;
	}

	public void setPrice(double price) {
  	this.price = price;
	}

	public double getPrice() {  
		return price;
	}

  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) return true;

    if (otherObject == null) return false;

    if (!(otherObject instanceof Item)) return false;
    Item other = (Item) otherObject;

    return other.description == this.description && other.price == this.price;
  }

  @Override
  public int hashCode() {
    return description.hashCode() + (int)price;
  }
}
