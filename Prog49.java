/* To prove that in a class hierarchy i.e inheritance, the default
constructor of super class are automatically invoked by sub class
constructor */

class A
{
	A()
	{
		System.out.println("Inside the default constructor of A");
	}
}
class B extends A
{
	B()
	{
		//super(); //ok , but not prefered
		System.out.println("Inside the default constructor of B");
	}
}
class C extends B
{
	C()
	{ 
		//super(); //invoked by compiler automatically
		System.out.println("Inside the default constructor of C");
	}
}
class Prog49
{
	public static void main(String[] args)
	{
		C obj = new C();
	}
}