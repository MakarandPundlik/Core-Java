//example2 on type promotion in expression
class Prog13
{
	public static void main(String[] args)
	{
		int r=10;
		
		//float cc = 3.14*2*r;//error,possible loss of precision found double , reqd float
		//float ac = 3.14*r*r;//error,same as above
		
		//when two float numbers are multiplied they become double
		
		double cc = 3.14*r*2;//ok
		float ac = 3.14F*r*r;//ok	
		
		System.out.println("ac contains "+ac);
		System.out.println("cc contains "+cc);
	}	
}