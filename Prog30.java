//an eg on parameterized constructor
class Pconstructor
{
	Pconstructor(int x)
	{
		System.out.println("Inside the default constructor of clas Pconstructor");
		System.out.println("x="+x);
	}
}
class Prog30
{
	public static void main(String[] args)
	{
		Pconstructor p1 = new Pconstructor(10);
	}
}