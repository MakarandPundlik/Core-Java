//an exmple on Math class
class Prog81
{
	public static void main(String[] args)
	{
		System.out.println("some random numbers are :-");
		for(int i=0;i<Math.random()*10;i++)
		System.out.println(Math.random()+"\t");
		
		System.out.println("Math floor(9.1) is " +Math.floor(9.1));	//9.0
		System.out.println("Math floor(9.99) is " +Math.floor(9.99));	//9.0
		System.out.println("Math floor(-9.1) is " +Math.floor(-9.1));	//-10.0
		System.out.println("Math ceil(9.1) is " +Math.ceil(9.1));	//10
		System.out.println("Math floor(9.99) is "+ Math.ceil(9.99));	//10.0
		System.out.println("Math floor(-9.1) is " +Math.ceil(-9.1));	//-9.0
		System.out.println("5 to the power of 3 is "+ Math.pow(5,3));	//125
		System.out.println("Square root of 25 is "+ Math.sqrt(25));	//5		
		System.out.println("Square root of -25 is "+ Math.sqrt(-25));	//NaN
	}
}