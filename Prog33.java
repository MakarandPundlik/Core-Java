//an example on static variables

//define a mthod to accept n numbers and display its sum

class Prog33
{	
		//instance member
	 int num1 = 10;
	 int num2 =  num1*2;
	public static void main(String[] args)
	{
		//solution 1 declare vars in main()
		//solution 2 //declare vars as static
		//solution 3 use instance
		
		Prog33 obj = new Prog33();
		System.out.println("num1 ="+obj.num1);
		System.out.println("num2 ="+obj.num2);
	}
}