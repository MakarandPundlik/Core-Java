//example on double literal literal
class Prog10
{
	public static void main(String[] args)
	{
		float f1 = 9;//ok
		//float f2 = 9.0;//compiler error, possible loss of precision
				//required float ,found double
		float f2 = 9.0F;//ok
		double d = 123.1234567890123;//ok
		
		System.out.println("f1 contains "+f1);	//9.0
		System.out.println("f2 contains "+f2);	//9.0
		System.out.println("d contains "+d);	//same as assigned
	}
}