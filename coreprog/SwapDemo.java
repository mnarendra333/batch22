
public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=200,temp;
		/*
		 * System.out.println("before swap a is "+a+" b is "+b); temp=a; a=b; b=temp;
		 * System.out.println("after swap a is "+a+" b is "+b);
		 */
		
		
		a = a+b;
		b=a-b;
		a = a-b;
		
		System.out.println(a +" "+b);
		

	}

}
