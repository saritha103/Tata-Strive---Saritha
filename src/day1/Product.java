package day1;

public class Product {

	String name;
	double price;
	int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void printProductDetails() {
		System.out.println("product Name:" + name);
			System.out.println("product name:" +quantity );
			System.out.println("product name:" +price );
									
	
	
	
	}
}
