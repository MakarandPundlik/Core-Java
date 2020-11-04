//an eg of toString() of object class
class Emp
{
	private int empid;
	private String name;
	private double sal;
	
	public Emp(int id,String n,double s)
	{
		empid=id;
		name=n;
		sal=s;
	}
	//ovveride toString() method
	public String toString()
	{
		return "Empid:- "+empid+" name:-"+name+" salary:-"+sal;
	}
	
}
class Prog56
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(1,"Ramesh",10000);
		Emp e2 = new Emp(2,"Suresh",12000);
		
		System.out.println("e1 contains "+e1.toString()); 
		System.out.println("e2 contains "+e2.toString()); 
		
		//toString() is a method in Object class which returns address of object 
		//all classes are by edefault subclasses of Object class 
	}
}