class MuliplicationTable
{
		
		public static void main(String[] abc)
		{
			if(abc.length==0)
			{
				System.out.println("please enter arguments");
				return;
			}
			int no = Integer.parseInt(abc[0]);
			for(int i=1;i<=no;i++)
			{
				
					for(int j=1;j<=10;j++){
						
						System.out.println(i+"*"+j+"="+(i*j));
					}
			}
			
			
			
		}


}