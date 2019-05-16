import java.util.Scanner;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line");
		String nextLine = sc.nextLine();
		System.out.println(nextLine.length());
		//System.out.println(nextLine);
		
		
		
		//0,1,2,3,4...15
		/*
		 * String[] split = nextLine.split(" "); System.out.println(split.length);
		 */
		
		
		for(int i=nextLine.length()-1;i>=0;i--)
			System.out.print(nextLine.charAt(i));
		

		
		
		
		
		
		
		
		
	}

}
