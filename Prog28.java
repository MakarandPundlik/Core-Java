//Design class "Rectangle" with suitable attributes and methods
//to calculate area and perimeter

class Rectangle
{
	int length,breadth;
	/*in java we have only two types of methods in, setter and getter
	setter methods are called as mutator methods and with return
	type void an argument list*/
	public void setParam(int l,int b)
	{
		length=l;
		breadth=b;
	}
	/*getter methods are generally nonvoid methods,does not require 
		any argument list 
	process on fields of objects*/
	public double getArea()
	{
		return length*breadth;
	}
	public double getPerimeter()
	{
		return 2*(length+breadth);
	}
}
class Prog28
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		
		r.setParam(20,50);
		
		System.out.println("Area of rectangle r is "+r.getArea()+" perimeter is "+r.getPerimeter());
	}
}