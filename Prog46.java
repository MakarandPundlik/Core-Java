/* Write a method to increment 2 variables from main()
by 2 different values say 3 and 5. Process is known as
"Call by Reference". Result achieved */

class Test
{
	int a,b;
}
class Prog46
{
	public static void main(String[] args)
	{
		Test t = new Test();
		
		t.a=10;
		t.b=20;
		
		System.out.println("Before incrementing a = "+t.a+"  b = "+t.b);
		increment(t);
		System.out.println("After incrementing a = "+t.a+"  b = "+t.b);
	}
	static void increment(Test temp) //result is  schieved as we sent are creating reference to an object
	{
		temp.a++;
		temp.b++;
		System.out.println("On incrementing a = "+temp.a+"  b = "+temp.b);
	}
}