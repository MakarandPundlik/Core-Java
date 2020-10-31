//eg 2 on method overloading


class Test
{
	void test(float f)
	{
		System.out.println("Invocation of test(float)");
	}

	void test(byte b)
	{
		System.out.println("Invocation of test(byte)");
	}
	void test(long l)
	{
		System.out.println("Invocation of test(long)");
	}
	
}
class Prog37
{
	public static void main(String[] args)
	{
		Test t = new Test();
		
		
			byte b=10;
			short s=10;
			int i=10;
			long l=10;
			float f=10;
			double d=10;
			
			t.test(b);	//byte
			t.test(s);	//long
			t.test(i);	//long
			t.test(l);	//long
			t.test(f);	//float
			//t.test(d);	//error  no suitable method found for test(double)
			t.test((float)d);	//explicit typecast
	}
}