//design a frame with 3 scrollbars to manipulate basic colours RGB
//and set background colour of the fram to the colour generated

import java.awt.*;
import java.awt.event.*;

public class Prog94 extends Frame implements AdjustmentListener,WindowListener
{
	Scrollbar hsbr,hsbb,hsbg; //declare variables globally 
	
	public static void main(String[] args)
	{
		new Prog94();
	}
	//constructor
	public Prog94()
	{
		setTitle("RGB Frame");
		setBounds(250,125,500,500);
		setLayout(null); //manual layout
		
		//allocate momory to scrollbars
		hsbr = new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,256); //args (orientation,increment,min,max+1,default);
		hsbg = new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,256);
		hsbb = new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,256);
		
		hsbr.setBounds(150,95,200,40);
		hsbg.setBounds(150,230,200,40);
		hsbb.setBounds(150,365,200,40);
		
		//add components to layout
		add(hsbr);
		add(hsbb);
		add(hsbg);
		
		
		//as the thumb of the scrollbar is at extreme left backgoround colour should be black
		//setBackground(Color.BLACK);
		setBackground(new Color(0,0,0));
		//calling the constructor of Color class, accepts RGB as an args
		
		//register the scrollbar for event handling
		hsbr.addAdjustmentListener(this);
		hsbg.addAdjustmentListener(this);
		hsbb.addAdjustmentListener(this);
		
		//we cannot close the frame using closex buttin as there is no code in java to manage event of close x;
	//register the frame for window type events
	
		addWindowListener(this);
		setVisible(true);
	}
	//override the methods of AdjustmentListener
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		//scrollbars are used to generate value 
		//to know which value is generated use method getValue()
		
				setBackground(new Color(hsbr.getValue(),hsbg.getValue(),hsbb.getValue()));
		//or 
		repaint();
	}
	public void paint(Graphics g)
	{
		setBackground(new Color(hsbr.getValue(),hsbg.getValue(),hsbb.getValue()));
	}
	
	
	//it is compulsory to override all methods of WindoeListener interface
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}