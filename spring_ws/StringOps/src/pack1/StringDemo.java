package pack1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = new String("hello");
		
		
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		String s4 = "hello";
		
		
		if(s1 == s2)
			System.out.println("s1 and s2 are equal");
		else
			System.out.println("s1 and s2 are not equal");
		
		
		if(s1.equals(s2))
			System.out.println("s1 and s2 content is equal");
		else
			System.out.println("s1 and s2 content is not equal");
		
		if(s1 == s3)
			System.out.println("s1 and s3 are equal");
		else
			System.out.println("s1 and s3 are not equal");
		
		if(s1.equals(s3))
			System.out.println("s1 and s3 content is equal");
		else
			System.out.println("s1 and s3 content is not equal");
		
		if(s2  == s4)
			System.out.println("s2 and s4 are equal");
		else
			System.out.println("s2 and s4 are not equal");
		
		if(s2.equals(s4))
			System.out.println("s2 and s4 content is equal");
		else
			System.out.println("s2 and s4 content is not equal");
		
		
		//immutable
		String str = new String("ravi");
		str.concat("kumar");
		System.out.println(str);
		
		//mutable
		StringBuffer sb = new StringBuffer("ravi");
		sb.append("kumar");
		
		System.out.println(sb);
		

	}

}
