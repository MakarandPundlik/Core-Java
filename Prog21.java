//accept a character from user as a commandline argument and display its category

class Prog21
{
	public static void main(String[] args)
	{
		char ch = args[0].charAt(0);
		
		//no such method called Character.parseChar() ;
		
		if(Character.isUpperCase(ch))
		System.out.println(ch+" is a upper case letter");
		
		else if(Character.isLowerCase(ch))
		System.out.println(ch+" is a lower case letter");
		
		else if(Character.isDigit(ch))
		System.out.println(ch+" is a digit");
		
		else
		System.out.println(ch+" is a special character/symbol");
	}
}