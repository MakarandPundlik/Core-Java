/* To prove that new Strings are not created always Especially when they
are created using a string literal*/

class Prog70
{
	public static void main(String[] args)
	{
		String s1 = "databyte";
		String s2 = new String("databyte");
		String s3 = "databyte";
		
		System.out.println("Are contents of s1 and s2 same? "+s1.equals(s2));
		System.out.println("Are contents of s1 and s3 same? "+s1.equals(s3));

		System.out.println("Are references of  of s1 and s2 same? "+(s1==s2));
		System.out.println("Are references of s1 and s3 same? "+(s1==s3));
	}
}