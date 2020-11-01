//a commercial example on dynamuc method dispatch

/* An application of dynamic method dispatch. Design
a class "Emp" with attributes "empid" and "name" and 
methods to accept and display data. Design a class
"Temp_Emp" which inherits "Emp" and with attributes
"rate_hr" and "hrs_wkd". Design a class "Perm_Emp"
which inherits "Emp" and with attributes "desgn" and
"salary".
Write a program to accept data of "n" employees and 
display the details
*/

import java.util.Scanner;

class Emp
{
	private int empid;
	private String name;
	Scanner sc = new Scanner(System.in);

	public void accept()
	{
		System.out.print("Enter empid:- ");
		empid= sc.nextInt();
		System.out.print("Enter name:- ");
		sc.nextLine();
		name= sc.nextLine();
	}

	public void display()
	{
		System.out.print("Empid:- " + empid + ", Name:- " + name);
	}
}

class Temp_Emp extends Emp
{
	private int rate_hr, hrs_wkd;

	//overriding
	public void accept()
	{
		super.accept();	//imp
		System.out.print("Enter rate per hour:- ");
		rate_hr = sc.nextInt();
		System.out.print("Enter the number of hours worked:- ");
		hrs_wkd = sc.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.print(", Type:- Temp, Rate/Hr:- " + rate_hr );
		System.out.println(", Hours worked:- " + hrs_wkd + " ,Net Pay:- " + hrs_wkd*rate_hr);
	}
}

class Perm_Emp extends Emp
{
	private String designation;
	private int sal;

	public void accept()
	{
		super.accept();
		System.out.print("Enter the designation:- ");
		designation= sc.nextLine();
		System.out.print("Enter the salary:- ");
		sal = sc.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.println(", Designation:- " + designation + ", Salary:- " + sal);
	}
}


class Prog48
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees:- ");
		int nor = sc.nextInt();

		/* Logic:- At this point of time, the user is unaware
		of no. of employees of each type. So instread of creating
		seperate array of each type, we can create an array of
		superclass reference variables and @ runtime determine 
		which object or employee type it is referring to */

		Emp arr[] = new Emp[nor];
		int i;
		char type;

		for(i=0;i<nor;i++)
		{
			System.out.print("Enter t/T for temporary and p/P for permanent:- ");
			type = sc.next().charAt(0);

			if(type == 't' || type=='T')
				arr[i] = new Temp_Emp();
			else if(type == 'p' || type=='P')
				arr[i] = new Perm_Emp();
			else
			{
				System.out.println("Incorrect choice");
				i--;
				continue;
			}
			arr[i].accept();	//dynamic method dispatch
		}
		System.out.println("Data of employees is:- ");
		for(i=0;i<nor;i++)
			arr[i].display();	//dynamic method dispatch
	}
}