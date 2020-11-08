//an example of wrapper class
class Prog80
{
	public static void main(String[] args)
	{
		int i=10;//primitive datatype
		Integer obji = new Integer(i);
		
		int ival = obji.intValue(); //Integer -> int pdt
		
		String istr = Integer.toString(ival); //Integer->String
		
		int istrval = Integer.parseInt(istr); //String->int
		
		 System.out.println("i contains " + i);
        	System.out.println("obji contains " + obji);
        	System.out.println("ival contains " + ival);
        	System.out.println("istr contains " + istr);
        	System.out.println("istrval contains " + istrval);
        	System.out.println("istr + istr contains " + (istr + istr));
        	System.out.println("istrval+istrval contains " + (istrval + istrval));
	}
}