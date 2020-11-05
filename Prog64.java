/*Accept the age of a person to be insured between 10-60 years only and
display it. Handle the following exceptions:
if age<10 throw "AgeTooSmallException"
if age>50 throw "AgeTooLargeException"
handle standard exceptions if any */
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}

class Prog64
{
	public static void main(String[] args)
	{
		try
		{
			int age=Integer.parseInt(args[0]);
			if(age<10)
			throw new MyException("AgeTooSamllException");

			else if(age>50)
			throw new MyException("AgeTooLargeException");

			else
			System.out.println("Age seems to be fine , you can  proceed further");
		}
		catch(MyException e)
		{
			System.out.println("Error:- "+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error:- "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:- please provide the age");
		}
	}
}