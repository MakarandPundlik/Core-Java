//validation of email
class Prog76
{
	public static void main(String[] args)
	{
		try
		{
			String email = args[0];
			//check for presence of @
			int pos_1a = email.indexOf('@');
			if(pos_1a==-1)
			{
				System.out.println("Missing @ in email");
			}
			else
			{
				//check for presence of multiple @
				int pos_2a = email.indexOf('@',pos_1a+1);
				if(pos_2a!=-1)
				{
					System.out.println("Email contains multiple @");
				}
				else
				{
					//chech for username
					if(pos_1a==0)
					{
						System.out.println("Missing username");
					}
					else
					{
						int pos_dot_afat = email.indexOf('.',pos_1a+1);
			
						if(pos_dot_afat==pos_1a+1)
						{
							System.out.println("Missing user name");
						}
						else
						{
							if(pos_dot_afat==-1)
							{
								System.out.println("Missing domain name");
							}
							else
							{
								String domain = email.substring(pos_dot_afat+1);
								if(domain.length()<2)
								System.out.println("Enter correct domain name");
								else
								System.out.println("Email seems to be okay");
							}
						}
					}
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter email");
		}
	}
}