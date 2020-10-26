//Sum of digits, prime number check check program 
//Write the methods in seperate class called MathUtil so that new class file 
//is created.



//executable class
class Prog25
{
	public static void main(String[] args)
	{
		int no = Integer.parseInt(args[0]);
		
		
		if(MathUtil.isPrime(no))
		System.out.println(no+" is a prime number");
		
		else
		System.out.println(no+" is a composite number");
	
		//int result = MathUtil.getSum(no); //ok
		
		//use nested call if possible
		System.out.println("sum of digits of given number is "+MathUtil.getSum(no));
	}
}