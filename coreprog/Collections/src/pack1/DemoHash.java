package pack1;

public class DemoHash {
	
	public static void main(String[] args) {
		
		
		String s1 = new String("hello");
		int hashCode = s1.hashCode();
		System.out.println(hashCode);
		
		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		
		
		char[] s = new char[] {'h','e','l','l','o'};
		
		int n = s.length;
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum = sum+s[i]*(int)Math.pow(31, (n-1));
			n--;
		}
		System.out.println(sum);
		
	}

}
