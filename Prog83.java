/* Accept some text from the user and display it line by line till word 
"stop" is not encountered */

/*Here we make the use of BufferedReader class bev=cause this class contains method 
readline() which can read each line sent from the buffer to the program*/
import java.io.*; //BufferedReaderStream IOException

class Prog83
{
	public static void main(String[] argd) throws IOException
{
	//reserve memory to accept data
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//System.in collects the keyboard in in the form of byte stream
	
	System.out.println("Enter some text \"stop\" to exit :- ");
	
	while(true)
	{
		String line = br.readLine(); //return ASCII of character
		
		if(line.contains("stop"))
		break;
		
		System.out.print(line);
	}
	br.close(); //memory is released
}

}