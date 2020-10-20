//example on int literal
class Prog09
{
	public static void main(String[] args)
	{
		byte b = 100;//ok
		short s = 30000;//ok
		long l1 = 2147483647;//ok
		//long l2 = 2147483648; //error,int no too large
		//long l2 = (long)2147483648;//same error
		//typecasting should be done before assignment
		
		long l3 = 2147483648L;//ok
		
		System.out.println("b contains "+b);//100
		System.out.println("s contains "+s);//100
		System.out.println("l1 contains "+l1);//100
		System.out.println("l3 contains "+l3);//100
	}
}