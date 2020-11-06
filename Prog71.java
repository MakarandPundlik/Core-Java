//to prove that Strings cannot be modified
class Prog71
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = s1;
		System.out.println("Are references of s1 & s2 same? "+(s1==s2));
		System.out.println("s1 "+s1+" s2 "+s2);
		s1=s1.concat("madam"); //s1+="madam";
		System.out.println("Are references of s1 & s2 same? "+(s1==s2));
		System.out.println("s1 "+s1+" s2 "+s2);
		
	}
}