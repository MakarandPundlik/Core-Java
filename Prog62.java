//an example of multiple catch blocks

class Prog62
{
	public static void main(String[] args)
	{
		int denom[] = {1,0,2,-12,3,6,0};
		int num = 12;
		for(int i=0;i<100;i++)
		{
			try
			{
				int result = num/denom[i];
				System.out.println("Rsult of division is "+result);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero is ruled out");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array length exhausted");
			}	
		}
	}
}