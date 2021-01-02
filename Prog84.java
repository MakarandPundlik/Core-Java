//write a program in java to determine presene of stop word in string

class Prog84
{
	public static void main(String[] args)
	{
		String line = "Please don't stop";
		
		int pos = line.indexOf("stop");
		
		if(pos!=-1)
		System.out.println("Stop present");
		
		else
		System.out.println("Stop not present");
	}
}