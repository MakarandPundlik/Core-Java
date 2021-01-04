//similar to Prog90 where container class can be assigned to manage events

import java.applet.*; //applet class
import java.awt.*; //graphics ,font,color
import java.awt.event.*;//ctionListener interface
/*<applet code="Prog91.class"  width="500" height="500"></applet>*/ 

public class Prog91 extends Applet implements ActionListener
{
	Button btnorange,btngreen;
	public void init()
	{
		//orange is caption
		btnorange = new Button("Orange");
		btngreen = new Button("Green");
		
		setLayout(null);
		btnorange.setBounds(120,100,100,70);
		btngreen.setBounds(250,100,100,70);
		
		//add button to applet interface
		add(btngreen);
		add(btnorange);
		
		//register the events
		//BtnHanlder list_obj = new BtnHanlder();
		
		//btnorange.addActionListener(list_obj);
		//btngreen.addActionListener(list_obj);
		
		btnorange.addActionListener(this);
		btngreen.addActionListener(this);
		
		setFont (new Font("Arial",Font.BOLD,25));	
		setVisible(true);		
	}
	//the listener object has to be inner class so it can access buttin object
	
	
	
		public void actionPerformed(ActionEvent ae)
		{
			//check which button is clicked
			
			if(ae.getSource() == btnorange)
			setBackground(Color.ORANGE);
			
			else
			setBackground(Color.GREEN);
		}
	
}