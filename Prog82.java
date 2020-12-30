//accept some text from user and display it char by char until char 'q' encounters

import java.io.*; //BufferedReaderStream IOException

class Prog82
{
	public static void main(String[] argd) throws IOException
{
	//reserve memory to accept data
	BufferedInputStream bin = new BufferedInputStream(System.in);
	
	//System.in collects the keyboard in in the form of byte stream
	
	System.out.println("Enter some text 'q' to exit :- ");
	
	while(true)
	{
		int no = bin.read(); //return ASCII of character
		
		if((char)no =='q')
		break;
		
		System.out.print((char)no);
	}
	bin.close(); //memory is released
}

}