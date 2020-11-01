/* Write a method to increment 2 variables from main()
by 2 different values say 3 and 5. Process is known as
"Call by Value". Result not achieved */

class Test
{
	int a,b;
}
class Prog45
{
	public static void main(String[] args)
	{
		Test t = new Test();
		
		t.a=10;
		t.b=20;
		
		System.out.println("Before incrementing a = "+t.a+"  b = "+t.b);
		increment(t.a,t.b);
		System.out.println("After incrementing a = "+t.a+"  b = "+t.b);
	}
	static void increment(int x,int y) //result is not schieved as we sent fileds of object not a reference of an object
	{
		x++;
		y++;
		System.out.println("On incrementing a = "+x+"  b = "+y);
	}
}