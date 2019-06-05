package pack1;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object obj = new String("hello");
		
		Object obj1 = new Integer(10);
		
		Object obj2 = new Float(10.5f);
		
		Number obj3 =  new Integer(50);
		
		int x[] = {10,20,30,40};
		
		String s1[] = {"hello","hi","hw","are","u","10"};
		
		int x1 = 10;
		float f = 10.5f;
		double d = 20.5;
		
		Object objArray[] = {x1,f,d};
		
		
		Integer i1 = new Integer(60);
		Float f1 = new Float(30.5f);
		
		Object objArray2[] = {i1,f1};
		
		
		Object objArray3[] = new Object[3];
		
		objArray3[0] = new String("Ravi");
		objArray3[1] = new Integer(100);
		objArray3[2] = new Float(100.5f);
		
		for (int i = 0; i < objArray3.length; i++) {
			System.out.println(objArray3[i]);
		}
		System.out.println("========================");
		for(Object object : objArray3)
			System.out.println(object);
		

	}

}
