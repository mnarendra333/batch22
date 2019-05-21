import java.util.Scanner;
class Caluculator
{




		
		public static void main(String args[])
		{		
				Scanner sc  = new Scanner(System.in);
				System.out.println("Enter data");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println(" 1.Add \n 2.Sub \n 3.Mul \n 4.div ");
				
				
				System.out.println("Enter your choice");
				
				
				int choice = sc.nextInt();
				switch(choice){
					
					
					case 1: System.out.println("sum is "+(a+b));
							break;
					case 2: System.out.println("sub is "+(a-b));
							break;
							
					case 3: System.out.println("mul is "+(a*b));
							break;
							
					case 4: System.out.println("div is "+(a/b));
							break;
							
					default : System.out.println("invalid choice");
					
				}
			
		}
			

}