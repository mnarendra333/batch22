package pack1;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			/*
			 * int numbers[] = { 10, 20, 30, 40, 50, 60 }; System.out.println(numbers[8]);
			 */

			/*
			 * String address = null; address.length();
			 */

			/* int res =10/0; */

			/*
			 * Object obj = new Object(); String s1 = (String) obj;
			 */
			String s1 = "goodMorning";
			int res = Integer.parseInt(s1);

		} catch (ArithmeticException | NullPointerException | ClassCastException | ArrayIndexOutOfBoundsException
				| NumberFormatException ex) {
			System.out.println("dont enter zero in the denominator");
			ex.printStackTrace();
			if(ex instanceof ArithmeticException)
				System.out.println("dont enter zero");
			else if(ex instanceof NullPointerException)
				System.out.println("do the null check");
			else if(ex instanceof NumberFormatException)
				System.out.println("dont cast string to integer");
		}

		

	}

}
