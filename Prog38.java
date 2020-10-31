//eg constructor overloading


class Room
{
	int length,breadth;
	public Room(int l,int b)
	{
		length=l;
		breadth=b;
		
	}
	public Room(int s)
	{
		length=s;
		breadth=s;
	}
	public int getArea()
	{
		return length*breadth;
	}
	public int getPerimeter()
	{
		return 2*(length+breadth);
	}
}
class Prog38
{
	public static void main(String[] args)
	{
		Room r1 = new Room(10);
		
		Room r2 = new Room(10,20);
		
		System.out.println("Area of r1 is "+r1.getArea());
		System.out.println("Perimeter of r1 is "+r1.getPerimeter());
		
		System.out.println("Area of r2 is "+r2.getArea());
		System.out.println("Perimeter of r2 is "+r2.getPerimeter());
	
	}
}