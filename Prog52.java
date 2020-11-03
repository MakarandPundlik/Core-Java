/* Eg-2 of abstract class. Define a class "Shape" to manage 2D shapes
with suitable attributes and a method to calculate area of any given 2D shape.
Define a class "Rectangle" which inherits "Shape". Define "Triangle" which 
inherits "Shape". Accept n shapes from user and display their area.

Logic:- As the formula/expression to calculate area of different shapes is
different, we have to declare getArea() as abstract */

import java.util.Scanner;
abstract class Shape
{
	protected int dim1,dim2;
	
	Shape(int d1,int d2)
	{
		dim1=d1;
		dim2=d2;
	}
	abstract double getArea();
	
}
class Rectangle extends Shape
{
	Rectangle(int d1,int d2)
	{
		super(d1,d2);
		
	}
	public double getArea() //compulsory overrinding
	{
		 return dim1*dim2;
	}
}
class Triangle extends Shape
{
	Triangle(int d1,int d2)
	{
		super(d1,d2);
	}
	public double getArea() //compulsory overrinding
	{
		 return 0.5*dim1*dim2;
	}
}
class Prog52
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int d1,d2;
		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();
		Shape arr[]=new Shape[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("t/T for Triangle, r,/R for Rectangle :");
			char ch = sc.next().charAt(0);
			
			if(ch=='t' || ch=='T')
			{
				System.out.println("Etnter length and height :");
				d1=sc.nextInt();
				d2=sc.nextInt();
				arr[i]=new Triangle(d1,d2);
				System.out.println("Area of a triangle is "+arr[i].getArea());
			}
			else if(ch=='r' || ch=='R')
			{
				System.out.println("Etnter length and breadth :");
				d1=sc.nextInt();
				d2=sc.nextInt();
				arr[i]=new Rectangle(d1,d2);
				System.out.println("Area of a rectangle is "+arr[i].getArea());
			}
			else
			System.out.println("Please enter the correct choice");
		}
	}
}



