//design an applet to manage checkboxes

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="Prog92.class" height="500" width="500"></applet>
public class Prog92 extends Applet implements ItemListener
{
	Label l;
	Checkbox chbhome,chbmobile,chbPC;
	
	public void init()
	{
		setFont(new Font("Arial",Font.BOLD,25));
		
		//create object of label and checkboxes
		
		l = new Label("I own ");
		chbhome = new Checkbox("Home",true);
		
		//2nd arguement is optional with default value false can be changed to true
		
		chbPC = new Checkbox("PC");
		chbmobile = new Checkbox("Mobile");
		
		chbhome.setEnabled(false); //checkbox is disabled
		
		//by default it is autolayout i.e. JRE checks size pf containers and components
		
		setLayout(null); //null means manual layout
		
		l.setBounds(50,50,100,30);
		chbhome.setBounds(50,120,150,30);
		chbPC.setBounds(50,170,150,30);
		chbmobile.setBounds(50,220,150,30);
		
		add(l);
		add(chbhome);
		add(chbPC);
		add(chbmobile);
		
		
		
		
		//register only enabled checkboxes
		chbPC.addItemListener(this);
		chbmobile.addItemListener(this);
		
		setVisible(true);
	}
	//override all methods of ItemListener
	
	public void itemStateChanged(ItemEvent ie)
	{
		//call the paint()
		repaint();//we need to do this because to write on applet window we need Graphics object
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Status ",50,300);
		//text to write , left , top
		
		g.setColor(Color.blue);
		g.drawString("Home - true",50,350);
		g.drawString("PC - "+chbPC.getState(),50,400);
		g.drawString("Mobile - "+chbmobile.getState(),50,450);
		
	}
}//end of class






