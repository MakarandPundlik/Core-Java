//example on type promotion in expression
class Prog12
{
	public static void main(String[] args)
	{
		byte a=2,b=5,c;
		//when two bytes or shorts are added,subtracted they become integer
		//c = a-b; //error, possoble loss of precision found int,required float
		c=(byte)(a+b);
		System.out.println("c contains "+c);
		
		char ch = 'a';
		ch++; //ok
		//ch=ch+1; //error,possible loss of precision,found int reqd char
		
		System.out.println("ch contains "+ch);//b
	}	
}