/* Accept a binary expression from user as cmd argument and evaluate it. 
Handle the following exceptions:- 
1. if no. of arguments are not valid
    throw "InvalidNoOfArgsException"
2. if opertor is invalid
    throw "InvalidOperatorException"
3. if result is -ve 
    thorw "NegativeResultException"
4. Handle other standard exceptions if any
*/

class MyException extends Throwable
{
	public MyException(String msg)
	{
		super(msg);
	}
}
class Prog65
{
	public static void main(String[] args)
	{
		try
		{
			if(args.length!=3)
			throw new MyException("InvalidNumberOfArgumentsException");
		
			char ch = args[1].charAt(0);
			if(ch!='+' && ch!='-' && ch!='/' && ch!='*' && ch!='%' && ch!='$')
			throw new MyException("Please enter the valid operator");
			double result;
			double num1 = Double.parseDouble(args[0]);
			double num2 = Double.parseDouble(args[2]);
		
			switch(ch)
			{
				case '+':
					result=num1+num2;
				break;
				case '-':
					result=num1-num2;
				break;
				case '*':
					result=num1*num2;
				break;
				case '/':
					result=num1/num2;
				break;
				case '%':
					result=num1%num2;
				break;
				default:
				 result=Math.pow(num1,num2);
				break;
			}
			if(result<0)
			throw new MyException("Result is negative");
			
			System.out.println("Result of operation "+result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please provide numbers only");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
/*to handle unknows exceptions which may occur @runtime. This exceptiom handler should
        be @the end of other catch statements, otherwise we get compile error. Based on Dynamic method
        Dispatch */
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}