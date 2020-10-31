//example on method overloading
class Test
{
	void test()
	{
		System.out.println("inside the method test()");
	}
	void test(int x)
	{
		System.out.println("Inside the method test(int x)");
	}
	void test(int x,int y)
	{
		System.out.println("Inside the method test(int x,int y)");
	}
	//error: method test(int) is already defined in class Test
	/*int test(int x)
	{
		System.out.println("Inside the method test(int x)");
	}*/
}
class Prog36
{
	public static void main(String[] args)
	{
		Test t = new Test();
		
		t.test();
		t.test(10);
		t.test(10,20);
	}
}