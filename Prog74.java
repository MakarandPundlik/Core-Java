//example of substring method to convert String small Strings
class Prog74
{
	public static void main(String[] args)
	{
		String s1 = "databyte computer training center";
		String s2 = s1.substring(9); ////int , start pos
		String s3 = s1.substring(9,20); //end pos+1

		//if endpos > string.length 
		//becomes string.length

		System.out.println("s1 contains "+s1);
		System.out.println("s2 contains "+s2);
	}
}
 