//an example of an abstract class
abstract class A
{
	//non abstract method
	void callMe()
	{
		System.out.println("Inside the method callMe()");
	}
	
	//abstract method 
	abstract void callMeToo();
	//implementation will be taken care by subclass
}
class B extends A
{
	//compulsory to provide implementation to asbtract method
	public void callMeToo()
	{
		System.out.println("Inside the B's implementation of callMeToo()");
	}
}

class Prog51
{
	public static void main(String[] args)
	{
		//A a = new A();  // A is abstract; cannot be instantiated
		B obj = new B();
		
		obj.callMe();
		obj.callMeToo();
	}
}