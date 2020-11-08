//validation of emailid - 2

class Prog77
{
	public static void main(String args[])
	{
		String email = args[0];
		boolean flag = true;
		
		//need to check each other
		String bad_chars = ""; 
			
		for(int i=0;i<email.length();i++)
		{
			char ch = email.charAt(i);
			
			if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch!='@' && ch!='_')
			{
				bad_chars += ch;
				flag=false;
				continue;
			}
		}
		if(!flag)
			System.out.println("Bad Characters:- " + bad_chars);
		else
			System.out.println("Valid");
	}
}