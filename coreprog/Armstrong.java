class Armstrong
{
	public static void main(String[] abc)
	{
				
		int no = Integer.parseInt(abc[0]);
		int sum=0,r=0;
		int dup = no;
		
		while(no>0){
			r = no%10;
			sum = sum+(r*r*r);
			no = no/10;
			
		}
		if(dup == sum)
			System.out.println(dup +" is armstrong!!");
		else
			System.out.println(dup +" is not armstrong!!");
			
			
		
			
			
	}


}

//javatpont

//tutorialspoint



