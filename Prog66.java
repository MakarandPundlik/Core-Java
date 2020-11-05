import test.Mathops;

public class Prog66
{	
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		num = Mathops.abs(num);
		System.out.println("Absolute value of numbers is "+num);
	}
}