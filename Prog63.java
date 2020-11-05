//an example on nested try blocks
class Prog63
{
	public static void main(String[] args)
	{
		int num=12,denom[]={1,2,3,0,-12,0,6};
		//outer try block
		try
		{
			for(int i=0;i<10;i++)
			{
				//inner try
				try
				{
					int result = num/denom[i];
					System.out.println("Result of division is "+result);

				}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero is ruled out");
				}
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array length exhausted");
			}	
	}
}