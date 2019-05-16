import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a line");
		 */
		String nextLine = "This is a basic program";
		
		String[] split = nextLine.split(" ");
		
		for (String str : split) {
			
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
				
		}

	}

}
