package com.java.string;

public class Candy extends DessertItem {
	private double weight;
	private double pricePerPound;


	public Candy()
	{
	super();
	weight = 0;
	pricePerPound = 0;
	}

	public Candy(String name, double w, double prc)
	{
	super(name);
	weight = w;
	pricePerPound = prc;
	}


	public double getWeight() {
	return weight;
	}

	public void setWeight(double weight) {
	this.weight = weight;
	}

	public double getPricePerPound() {
	return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) {
	this.pricePerPound = pricePerPound;
	}

	@Override
	public double getCost() {
	double total = weight * pricePerPound;
	total = Math.round(total * 100);
	return total;
	}


	public String toString()
	{
	String s = String.format("%-50s $%.2f\n\t %.2f lbs @ $.2f", getName(), getCost()/100, weight, pricePerPound);
	return s;
	} 
}