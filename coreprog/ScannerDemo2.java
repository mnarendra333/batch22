import java.util.Scanner;
class ScannerDemo2
{


	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String name = sc.next();
		
		//approch-1
		
		for(int i=name.length()-1;i>=0;i--)
			System.out.print(name.charAt(i));
		
		System.out.println();
		//approch-2
		
		char ch[] = name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
		
		
		
	}



		

}