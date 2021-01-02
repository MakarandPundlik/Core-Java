//accept source and target from user and copy the contents of source into target

import java.io.*;
import java.util.Scanner;

class Prog86
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter sourcefile name : ");
		String source = sc.next();
		
		System.out.print("Enter targetfile name : ");
		String target = sc.next();
		
		//wrong style
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			FileInputStream fin = new FileInputStream(source);
			
			FileOutputStream fout = new FileOutputStream(target,false);
			
			/*second option is boolean append with default value set to
			false. It means if target file does not exist ,create one and if it exists
			overwrite it.
			*/
			//setting append to true will append the content of target file
			//with source file
			
			while(true)
			{
				int no = fin.read();
				
				if(no==-1)
				break;
				
				fout.write((char)no);
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Source file not found.");
		}
		br.close();
	}
}