package SpringRestOrderAssignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Order {
	
	@Id
	private String id;
	private String itemName;
	private int itemQuantity;
	private double cost;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	/*
	 * @Override public String toString() { return "Order [id=" + id + ", itemName="
	 * + itemName + ", itemQuantity=" + itemQuantity + ", cost=" + cost + "]"; }
	 */
	
}
