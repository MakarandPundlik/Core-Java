//an example of caught exception
class Prog60
{
	public static void main(String[] args)
	{
		try
		{
			int num=10,denom=0;
			int result = num/denom;
			System.out.println("Result of operation is "+result);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is rulred out");
			return ;
		}
		finally
		{
			System.out.println("This is the code in finally{}");
		}
	}
}