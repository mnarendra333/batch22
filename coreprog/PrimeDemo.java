import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find the factors");
		
		int num = sc.nextInt();
		int counter=0;
		if(num%2==0) {
			System.out.println("not prime");
			return;
		}
		for (int i = 1; i <=num/2; i=i+2) {
			
			if(num%i==0)
				counter++;
			
			
		}
		if(counter>2)
			System.out.println("not prime");
		else
			System.out.println("prime");
		
		

	}

}
