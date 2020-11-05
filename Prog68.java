//g1 on String class constructor

class Prog68
{
	public static void main(String[] args)
	{
		char arr[]={'d','a','t','a','b','y','t','e'};
		String s1 = new String(arr);
		String s2 = new String(arr,2,3);
		
		System.out.println("S1 contains "+s1);
		System.out.println("S2 contains "+s2);
			
	}
}