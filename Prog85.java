//accept a filename from user and display its contetns

import java.io.*;
import java.util.Scanner;

class Prog85
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter filename : ");
		String filename = sc.next();
		
		//create an input stream file contents. This stream
		//can only be created from exiting files. If filename does not exists
		// it throws FileNotFoundException
		
		try
		{
			FileInputStream fin = new FileInputStream(filename);
			
			while(true)
			{
				int no = fin.read();
				
				if(no==-1)
					break;
					
					System.out.print((char)no);
			}
			fin.close();
		}
		catch(FileNotFoundException e)
			{
				System.out.println("File "+filename+" does not exist");
			}
	}
}