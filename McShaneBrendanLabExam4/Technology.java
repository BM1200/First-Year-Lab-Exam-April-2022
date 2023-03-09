public class Technology
{
	//initializing variables
	private String brand;
	private String model;
	private char type;
	private double cost;

	//static variables
	private static int phoneTotal = 0;
	private static int compTotal = 0;
	private static int speakerTotal = 0;
	private static int otherTotal = 0;

	//no arg constructor
	public Technology()
	{

	}
	//constructor
	public Technology(String brand, String model, char type, double cost)
	{
		setBrand(brand);
		setModel(model);
		setType(type);
		setCost(cost);
	}



	//getter/accessor
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public char getType()
	{
		return type;
	}
	public double getCost()
	{
		return cost;
	}
	//setters
	public void setBrand(String b)
	{
		brand = b;
	}
	public void setModel(String m)
	{
		model = m;
	}
	public void setType(char ty)
	{
		type = ty;
	}
	public void setCost(double c)
	{
		cost = c;
	}

	//toString() method
	public String toString()
	{
		String str = "";
		str = "{ brand='" + brand+"', model='" + model + "', type=" + type + "', cost='" + cost + "'}" ;
		return str;
	}
}