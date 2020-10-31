//define a mthod to accept n numbers and display its sum

class Prog39
{
	static int test(int ...nos)
	{
		int sum = 0;
		for(int i=0;i<nos.length;i++)
		sum+=nos[i];
		
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Sum of 10 20 30 is "+test(10,20,30));
		System.out.println("Sum of 10 20 30 40 is "+test(10,20,30,40));
		System.out.println("Sum of 10 20 30 40 50 is "+test(10,20,30,40,50));
		System.out.println("Sum of 10 20  is "+test(10,20));
	}
}