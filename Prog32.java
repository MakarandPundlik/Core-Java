/*Design a class "Student" with attributes rollno,name and percent.
Accept data of a few students and at the end, display their records
along with number of records/objects created. */

class Student
{
	private int rollno;
	private String name;
	private double percent;
	private static int cntr;
	public Student(int r,String n,double p)
	{
		name=n;
		rollno=r;
		percent=p;
		cntr++;
		display();
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Percentage :"+percent);
	}
	public static int getCntr()
	{
	//instance member cannot be referd using statuc method
		return cntr;
	}
}
class Prog32
{
	public static void main(String[] args)
	{
		Student s1 = new Student(10,"Makya",69.346);
		Student s2 = new Student(12,"Makyabhau",99.99);
		Student s3 = new Student(14,"Makyasheth",78.2354);
		
		System.out.println("Number of students are :"+Student.getCntr());
	}
}