//an example on hidden member of superclass 
class A
{
	int i;
}
class B extends A
{
	int i; //ok but hides "i " of superclass
	B(int x,int y)
	{
		i=x;//will initiate "i" of B to x
		super.i=y; //will initiate "i" of A to y
	}
	void display()
	{
		System.out.println("B's i "+i+" A's i "+super.i);
	}
}


class Prog42
{
	public static void main(String[] args)
	{
		B b = new B(10,20);
		b.display();
	}
}