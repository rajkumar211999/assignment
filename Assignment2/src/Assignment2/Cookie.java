package Assignment2;
public class Cookie extends DessertItem {
	private int quantity;
	private double pricePerDozen;


	public Cookie()
	{
	super();
	quantity = 0;
	pricePerDozen = 0;
	}

	public Cookie(String name, int qty, double prc)
	{
	super(name);
	quantity = qty;
	pricePerDozen = prc;
	}


	public int getQuantity() {
	return quantity;
	}


	public double getPricePerDozen() {
	return pricePerDozen;
	}

	public void setPricePerDozen(double pricePerDozen) {
	this.pricePerDozen = pricePerDozen;
	}

	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}

	@Override
	public double getCost() {
	double total = pricePerDozen / 12 * quantity;
	total = Math.round(total * 100);
	return total;
	}


	public String toString()
	{
	String s = String.format("%-50s $%.2f\n\t %d cookies @ $%.2f per Dozen", getName(), getCost()/100, quantity, pricePerDozen);
	return s;
	} 

}