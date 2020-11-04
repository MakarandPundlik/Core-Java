//an example of uncaught exception
class Prog59
{
	public static void main(String[] args)
	{
		int num=10,denom=0;
		int result = num/denom;
		System.out.println("Result of operation is "+result);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
	}
}