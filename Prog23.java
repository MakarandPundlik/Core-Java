//write your own method which return absolute values of any given int value
//define this meh=thod in same class as that of main()



class Prog23
{
	public static int abs(int no) //as method is called using classname use static keyword
	{
		if(no>0)
		return no;
		else
		return -no;
	}
	public static void main(String[] args)
	{
		 int no = Integer.parseInt(args[0]);
		
		 no = Prog23.abs(no); 
		// no = abs(no);  //valid , as both the methods are from same class
		System.out.println("absolute of given no. is " +no );
	}
}