//an example on method overriding
class A
{
	void show()
	{
		System.out.println(" A's implementation of show()");
	}
}
class B extends A
{
	void show()
	{
		System.out.println(" B's implementation of show()");
		super.show()
	}
}
class Prog43
{
	public static void main(String[] args)
	{
		B b = new B();
		b.show();
		//b.super.show();//error 
	}
}