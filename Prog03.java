// example on precedence of operator
 class Prog03
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("a+2= "+a+2); //102
		System.out.println("a+2= "+(a+2)); //12
		System.out.println("a*5= "+a*5); //50
		System.out.println("a-6"+a-6); //compiler error
		//bad operands , required string found int
		System.out.println("a/2= "+a/2); //5
	}
}