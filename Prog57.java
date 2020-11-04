//an example on interface

interface Area
{
	double PI = 3.14;
	//aoutomatically becomes 
	//public static final double PI = 3.14;
	
	double getArea();
	//aoutomatically becomes 
	//public static double getArea()
}

interface Circumference
{
	double getCircumference();
}

class Circle implements Area,Circumference
{
	int rad;
	public Circle(int r)
	{
		rad=r;
	}
	
	//compulsory to provide implmentation with public keyword
	public double getArea()
	{
		return rad*rad*PI;
	}
	public double getCircumference()
	{
		return rad*2*PI;
	}
}

class Prog57
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(10);
		System.out.println("Area of c1 is "+c1.getArea() +" circumferemce is "+c1.getCircumference());
	}
}