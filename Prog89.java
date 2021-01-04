//design an applet to wish user depending upon the time of the day

import java.applet.*; //applet class
import java.awt.*; //graphics ,font,color
import java.util.Date;

/*<applet code="Prog89.class"  width="500" height="500"></applet>*/ 

public class Prog89 extends Applet
{
	
	public void init()
	{
		
		setFont (new Font("Arial",Font.BOLD,25));		
	}
	public void paint(Graphics g)
	{
	//create an instance of Date class
	
		Date d = new Date();
	
		int hrs = d.getHours(); //will return time in hrs , 24 hr format
	
		String msg = "Good ";
		
		if(hrs<12)
		msg+="morning";
		
		else if(hrs<16)
		msg+="afternoon";
		
		else
		msg+=" night";
		
		g.drawString(msg,150,150);
	}
	
}