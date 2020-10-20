//example on boolean literal
class Prog07
{
	public static void main(String[] args)
	{
		//to print 'hello' 5 times
		boolean b = true;
		int cntr = 0;
		while(b)
		{
			System.out.println("Hello");
			cntr++;
			if(cntr==5)
			b=false;
		}
	}
}