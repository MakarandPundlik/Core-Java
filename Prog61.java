/*accept a few int values from user as command line arguments and
display them. At the end, display the total number of valid and invalid ages*/

class Prog61
{
	public static void main(String[] args)
	{
		int cntr=0;
		for(int i=0;i<args.length;i++)
		{
		try
		{
			int num = Integer.parseInt(args[i]);
			System.out.println("Valid arg ->"+num);
			cntr++;
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid arg ->"+args[i]);
		}
		
		}
		System.out.println("Number of valid arguments "+cntr);
		System.out.println("Number of invalid arguments "+(args.length-cntr));
	}
}