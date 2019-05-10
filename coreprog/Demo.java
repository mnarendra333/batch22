
public class Demo {

	public static void main(String[] args) {
		
		
		for (int i = 10; i <=1000; i++) {
			
			int r=0,sum=0,mulsum=1,dupno=i;
			int j = i;
			while(j>0){
				
				r = j%10;
				sum  =sum+r;
				mulsum = mulsum*r;
				j = j/10;
			}
			if(sum == mulsum)
				System.out.println(dupno +"is perfect no");
			
				
			
		}
		
		

	}

}
