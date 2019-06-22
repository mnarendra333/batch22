package pack1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fully Qualified class name");
		String className = sc.next();
		
		try {
			Class obj = Class.forName(className);
			Method[] declaredMethods = obj.getDeclaredMethods();
			System.out.println("============methods==============");
			for (Method method : declaredMethods) {
				System.out.println(method);
			}
			
			System.out.println("==========constructors============");
			Constructor[] declaredConstructors = obj.getDeclaredConstructors();
			for (Constructor constructor : declaredConstructors) {
				System.out.println(constructor);
			}
			System.out.println("============variables=================");
			Field[] declaredFields = obj.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
