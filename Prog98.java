//an example on anonymous inner classes
//design a program in which background colour changes to red,gree,blue onclivk of left,center and right mouse buttons
//use anonymous inner class

import java.awt.*;
import java.awt.event.*;

class Prog98 extends Frame 
{
	public static void main(String[] args)
	{
		new Prog98();
	}
	Prog98()
	{
		setBounds(250,125,500,500);
		//register the mouse with frame to deal with events
		addMouseListener(new MouseAdapter()
		
		//define new inner class without name but which inherits MouseAdapter
		{
			//override the reqd method
			public void mouseClicked(MouseEvent me)
			{
				//check which button is clicked
				if(me.getButton()==1) //left Button 
				setBackground(Color.RED);
				
				else if(me.getButton()==2)
				setBackground(Color.GREEN);
				
				else setBackground(Color.BLUE);
			}
		});
			
			addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				});
		 
		 setVisible(true);
	}//end of constructor
}//end of class