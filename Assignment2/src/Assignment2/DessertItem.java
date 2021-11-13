package Assignment2;


public abstract class DessertItem {
	protected String name;

	public DessertItem()
	{
	name = "";
	}

	public DessertItem(String name1)
	{
	name = name1;
	}

	public String getName()
	{
	return name;
	}

	public void setName(String name1)
	{
	name = name1;
	}

	public abstract double getCost();
}
