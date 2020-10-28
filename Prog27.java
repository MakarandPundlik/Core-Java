//Design a class "Circle" with suitable attributes and methods to 
//calculate area and circumference

class Circle
{
	int r,x,y;
	
	double getArea()
	{
		return r*r*3.14;
	}
	double getCircum()
	{
		return 2*3.14*r;
	}
	
}
class Prog27
{
	public static void main(String[] args)
	{
		Circle c1,c2;
		c1 = new Circle();
		c1.x=100;
		c1.y=200;
		c1.r=10;
		System.out.println("Area of c1 is "+c1.getArea() +"  circumference is "+c1.getCircum());
	}	
}