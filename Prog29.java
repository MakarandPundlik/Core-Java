//an eg on default constructor
class Dconstructor
{
	Dconstructor()
	{
		System.out.println("Inside the default constructor of clas Dconstructor");
	}
}
class Prog29
{
	public static void main(String[] args)
	{
		Dconstructor d1 = new Dconstructor(); //declaration and memory allocation ,
											//invokes constructor implicitly
		
		Dconstructor d2;//constructor not called
		//d1.Dconstructor(); //cannot invoke constructor explicitly
	}
}