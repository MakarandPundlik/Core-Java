//an example on method overloading
class A
{
	void show()
	{
		System.out.println(" A's implementation of show()");
	}
}
class B extends A
{
	void show(String msg)
	{
		System.out.println(msg);
	}	
}
class Prog44
{
	public static void main(String[] args)
	{
		B b = new B();
		b.show("sonamgupta bewafa hai");
		b.show();
	}
}