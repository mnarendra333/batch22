
public class RevNumber {
	
	public static void main(String[] args) {
		
		
		int num = 1234,sum=0,rem=0,dup=num,count=0;
		while (num>0) {
			count++;
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		
		System.out.println("no of digits of given "+dup+" is "+count);
		System.out.println("rev of "+dup+" is "+sum);
		
		
		
	}

}
