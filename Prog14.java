//example1 scope
class Prog14
{
//global scope
	public static void main(String[] args)
	{
		//outer scope
		int out_x=10;
		
		//inner scope
		{
			int in_x=20;
			//int out_x=30; //error, out_x is a;redy defined
			
		System.out.println("in_x contains "+in_x);
		System.out.println("out_x contains "+out_x);
		}
		
	}	
}