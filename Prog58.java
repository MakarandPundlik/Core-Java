//to prove than interfaces as well as abstract classes can inherit

interface X
{
	void methX();
}

//error : as interfaces only contains abstract methods ,they cannot implement each other
/*interface Y implements X
{
	
}*/

interface Y extends X
{
		void methY();
}
abstract class A implements Y
{
	//as a class is abstract it is not necessary to provide implementation 
	//for each and every method
	abstract void methA();
}
abstract class B extends A
{
	public  void methY()
	{
		//not compulsory
		System.out.println("B's implementation of methY()");
	}
}
class C extends B
{
	//as class is non abstract 
	//it is compulsory to provide 
	//implementation to all abstract methods present in previous class
	public void methX()
	{
		System.out.println("C's implementation of methX()");
	}
	
	public void methA()
	{
		System.out.println("C's implementation of methA()");
	}
}

class Prog58
{
	public static void main(String[] args)
	{
		C obj = new C();
		obj.methA();
		obj.methX();
		obj.methY();
	}
}