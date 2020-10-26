//accept a character from user and change its case

class Prog22
{
	public static void main(String[] args)
	{
		char ch = args[0].charAt(0);
		
		//no such method called Character.parseChar() ;
		
		if(!Character.isLetter(ch))
		System.out.println(" Please enter letters only");
		
		
		else
		{
			if(Character.isLowerCase(ch))
			ch = Character.toUpperCase(ch);
			else
			ch = Character.toLowerCase(ch);
			
			System.out.println("character now is "+ch);
		}
	}
}