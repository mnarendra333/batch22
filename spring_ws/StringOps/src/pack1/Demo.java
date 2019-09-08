package pack1;

public class Demo {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		
        StringBuffer sb = new StringBuffer("pragim");  
        for (int i=0; i<1000000; i++){  
            sb.append("tech");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
       
        
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("pragim");  
        for (int i=0; i<1000000; i++){  
            sb2.append("tech");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
