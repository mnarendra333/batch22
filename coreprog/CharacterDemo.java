class CharacterDemo
{

	public static void main(String... args)
	{	
		String str = args[0];
		if(str.length()!=1)
		{
			System.out.println("invalid input "+str);
			return;
		}
			
			
		char ch = str.charAt(0);
		
		
		/*switch(ch){
				
			case 'a' : System.out.println(ch+" is vowel");
						break;
			case 'e' : System.out.println(ch+" is vowel");
						break;
						
			case 'i' : System.out.println(ch+" is vowel");
						break;
			case 'o' : System.out.println(ch+" is vowel");
						break;
			case 'u' : System.out.println(ch+" is vowel");
						break;
			default: 	System.out.println(ch+" is consonent");
			
			
		}*/
		
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is a vowel");
		else
			System.out.println(ch+" is a consonent");
		
	}

}