package pack4;

public class Product {
	
	private int proId;
	private String proName;
	private double price;
	
	
	public int getProId() {
		return proId;
	}


	public String getProName() {
		return proName;
	}


	public double getPrice() {
		return price;
	}


	public Product(int proId, String proName, double price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + "]";
	}
	
	
	

}
