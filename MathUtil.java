class MathUtil
{
	 static boolean isPrime(int x)
	{
		for(int i=2;i<x/2;i++)
		if(x%i==0)
		return false;
		return true;
	}
	static int getSum(int x)
	{
		int sum=0;
		while(x>0)
		{
			sum+=x%10;
			x/=10;
		}
		return sum;
	}
}