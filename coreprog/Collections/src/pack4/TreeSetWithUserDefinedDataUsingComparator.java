package pack4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithUserDefinedDataUsingComparator {
	
	
	public static void main(String[] args) {
		
		
			TreeSet<Product> productList = new TreeSet<Product>(new Comparator<Product>() {

				@Override
				public int compare(Product o1, Product o2) {
					String proName1 = o1.getProName();
					String proName2 = o2.getProName();
					
					return -proName1.compareTo(proName2);
				}
			});
			productList.add(new Product(23, "MAC", 90000));
			productList.add(new Product(67, "Lenovo", 50000));
			productList.add(new Product(78, "ACER", 30000));
			productList.add(new Product(24, "HP", 60000));
			productList.add(new Product(79, "DELL", 60000));
			productList.add(new Product(45, "ASUS", 20000));
			
			
			System.out.println(productList);
		
	}

}
