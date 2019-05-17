import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int numbers[] = {10,20,30,40,50,60};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("============================");
		
		for (int i : numbers) {
			if(i==40)
				continue;
			System.out.println(i);
		}
		
		//step-1
		//int num[] = new int[5];
		Integer numb[] = new Integer[5];
		System.out.println("before filling the data");
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);
		}
		System.out.println("Enter inputs to fill the array");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numb.length; i++) {
			numb[i] = sc.nextInt();
		}
		
		System.out.println("print array data");
		
		for (Integer integer : numb) {
			System.out.println(integer);
		}
		
		
		
		
		
		

	}

}
