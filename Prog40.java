//an example on inheritance
class A
{
	int i,j;
	void showij()
	{
		System.out.println("i "+i+" j "+j);
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
		return i+j+k;
	}
}

//to execute the program we dont need .java files of class A and class B
//.class files of the same are sufficient
class Prog40
{
	public static void main(String[] args)
	{
		B b = new B();
		b.i = 10;
		b.j = 20;
		b.k = 30;
		
		b.showij();
		b.showk();
		
		System.out.println("i+j+k "+b.sumijk());
	}
}