//display message using java applets

import java.applet.*; //applet class
import java.awt.*; //graphics ,font,color

/*<applet code="Prog88.class"  width="500" height="500"></applet>*/ 

public class Prog88 extends Applet
{
	//decalre variables globally so they are accessible by standard methods
	String msg;
	Font f;
	
	public void init()
	{
		msg = "Welcome to Java";
		f = new Font("Chiller",Font.BOLD|Font.ITALIC,25);
		
		/*Font accepts 3 args*
			1 - Font name as string
			2 - Font style as constant 
			3 - font size
		*/
		
		this.setFont(f);
		
		setBackground(Color.BLACK);
		setForeground(Color.YELLOW);
		
		/*these are also called by this keyword.
			They are present in component class*/

				
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,150,150);
	}
	
}