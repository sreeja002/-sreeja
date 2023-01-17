package Demopackage;

public class Product {
	String itemName;
	float price;
	float quantity;
		// TODO Auto-generated constructor stub}
	public Product(String itemName,float price,float quantity)
	{
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	public String toString()
	{
		return"itemName:"+itemName+",Price"+price+",Quantity"+quantity;
	}

}
