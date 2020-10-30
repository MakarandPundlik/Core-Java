//with only 1 SOP("Hello") in main() WAP to get following output
//Hi
//Hello
//Bye

class Prog35
{
	static
	{
		System.out.println("Hi");
		main(null);
		System.out.println("Bye");
		System.exit(0); //avoid the auto call to main()
	}
	public static void main(String[] args)
	{
		System.out.println("Hello");
	}
}