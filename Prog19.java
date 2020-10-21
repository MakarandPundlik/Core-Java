//aaccept a year from user as a command line argument
//and determine whether it is leap yr or not

class Prog19
{
	public static void main(String[] args)
	{
		//int yr = (int)args[0]; //error,inconvertible types,reqd int found String
		//typecasting is applicable only to the primitive data types
		
		int yr = Integer.parseInt(args[0]);
		//this conversion requires to call a special method called parseInt() from Integer class
		if(yr%4==0 && yr%100!=0)
		System.out.println(yr+" is a leap year");
		else
		System.out.println(yr+" is a not a leap year");
	}
}