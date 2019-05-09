class StrRevDemo
{


	static public void main(String args[])
	{
		 
		 String[] names = {"John","Miller","Clerk","Diana","Dony"};
		 
		 for(int i=0;i<5;i++){
			 
			 String perName = names[i];
			 
			 
			 for(int j=perName.length()-1;j>=0;j--)
				 System.out.print(perName.charAt(j));
			 
			 System.out.println();
			 
		 }
		 
		 
		 
	}


}
