package pack2;

import java.util.Scanner;

public class Login {

	void validate(String uname, String pwd) throws InValidLoginException {

		if (!(uname.equalsIgnoreCase("pragim") && pwd.equals("pragim")))
			throw new InValidLoginException("Login denied because cred are wrong");
		else
			System.out.println("login success!!! redirect to home page");

	}

	public static void main(String[] args) throws InValidLoginException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cred \n 1.username \n 2.password");
		String username = sc.next();
		String password = sc.next();

		Login obj = new Login();
		obj.validate(username, password);
		System.out.println("testing");

	}

}
