import java.util.Scanner;

public class FactorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find the factors");
		
		int num = sc.nextInt();
		int factCounter=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				factCounter++;
				System.out.println(i);
			}
		}
		System.out.println("Factors of "+num+" are "+factCounter);

	}

}
