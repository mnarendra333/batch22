import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find the factorial");
		
		int num = sc.nextInt();
		int sum=1,dup=num;
		while (num>0) {
			//sum=sum*num;
			sum*=num--;
			//num--;
		}
		System.out.println("factorial of "+dup+" is "+sum);

	}

}
