//to prove taht Strings created by StringBuffer class can be modified

class Prog78
{
	public static void main(String[] args)
	{
		//StringBuffer s1 = "Hello";//String cannot be converted to StringBuffer
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = s1;
		System.out.println("s1 contains "+s1+" s2 contains "+s1);
		System.out.println("are references of s1 and s2 same? "+(s1==s2));
		
		s1.append(" sir"); //not concat
		System.out.println("s1 contains "+s1+" s2 contains "+s1);
		System.out.println("are references of s1 and s2 same? "+(s1==s2));
		
	}
}