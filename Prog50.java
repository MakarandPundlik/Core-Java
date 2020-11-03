/* To prove in inheritance, even the parameterised constructor of sub class
can invoke the default constructor of super class provided they do not
invoke the parameterised constructor of super class
*/


class A
{
	A()
	{
		System.out.println("Inside the default constructor of A");
	}
}
class B extends A
{
	B(int x)
	{
		//super(); //ok , but not prefered
		System.out.println("Inside the parameterised constructor of B");
	}
}
class C extends B
{
	C(int x)
	{ 
		super(x); 
		//super(); //not invoked by compiler automatically
		System.out.println("Inside the parameterized constructor of C");
	}
}
class Prog50
{
	public static void main(String[] args)
	{
		C obj = new C(10);
	}
}