//an example on this keyword
class Point
{
	private int x,y;
	private String colour;
	
	public Point(int x,int y,String colour)
	{
		this.x=x;
		this.y=y;
		this.colour=colour;
	}
	public void display()
	{
		System.out.println("Co-ordinates of point are x="+x+" y="+y);
		System.out.println("Colour of the point is "+colour);
	}
}
class Prog31
{
	public static void main(String[] args)
	{
		Point p = new Point(10,20,"black");
		p.display();
	}
}