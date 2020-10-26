//Define a recursive method to return the factorial value
//of any given int no. Write this function in a seperate class but in same
//.java file


class Mathops
{
	static int getFact(int no) //when access specifier is absent , default value is package
	{
		int y;
		if(no==1 || no==0 )
		return 1;
		else
		y = no*getFact(no-1);
		return y;
	}
	
}
//executable class
class Prog24
{
	public static void main(String[] args)
	{
		int no = Integer.parseInt(args[0]);
		
		int result = Mathops.getFact(no);
		System.out.println("Factorial of given number is "+result);
	}
}