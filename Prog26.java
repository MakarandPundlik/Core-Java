//accept records of employee and display their details

import java.util.Scanner;
//Scanner class resides in util package
//and not lang package , hence we need to import it

class Prog26
{
	public static void main(String[] args)
	{
		//creating an instance of Scanner class 
		Scanner sc = new Scanner(System.in);
		
		//system.in respresents input from keyboard
		System.out.println("Enter emp_id :-");
		int emp_id = sc.nextInt();
		
		sc.nextLine(); //clear buffer
		System.out.println("Enter emp_name :-");
		String emp_name = sc.nextLine(); //to accept string with spaces
		
		sc.nextLine(); //clear buffer
		
		System.out.println("Enter emp_desig :-");
		String emp_desig = sc.nextLine();
		
		System.out.println("Enter emp_sal :-");
		double emp_sal = sc.nextDouble();
		
		System.out.println("emp_id :-"+emp_id+" emp_name:-"+emp_name+" emp_desig:-"+emp_desig+" emp_sal:-"+emp_sal);
	}
}