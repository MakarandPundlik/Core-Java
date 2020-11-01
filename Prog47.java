//an example on dynamic method dispatch
class A
{
	void meth()
	{
			System.out.println(" A's implementation of meth()");
	}
}
class B extends A
{
	void meth()
	{
			System.out.println(" B's implementation of meth()");
	}
}
class C extends B
{
	void meth()
	{
			System.out.println(" C's implementation of meth()");
	}
}

class Prog47
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.meth();
		
		obj = new B();
		obj.meth();
		
		obj = new C();
		obj.meth();
	}
}