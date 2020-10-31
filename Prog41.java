//an example private members of superclass 
class A
{
	private int i;
	int j;
	void showij()
	{
		System.out.println("i "+i+" j "+j);
	}
	void seti(int x)
	{
		i=x;
	}
	int geti()
	{
		return i;
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k "+k);
	}
	
	int sumijk()
	{
		
		return geti()+j+k;
	}
}


class Prog41
{
	public static void main(String[] args)
	{
	//here i,j,showij() are available but i is not accessible
		B b = new B();
		//b.i = 10;//error: i has private access in A
		b.seti(10);
		b.j = 20;
		b.k = 30;
		
		b.showij();
		b.showk();
		
		System.out.println("i+j+k "+b.sumijk());
	}
}