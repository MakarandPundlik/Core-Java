//design an applet with 2 buttons if clicked will change the background

import java.applet.*; //applet class
import java.awt.*; //graphics ,font,color
import java.awt.event.*;//ctionListener interface
/*<applet code="Prog90.class"  width="500" height="500"></applet>*/ 

public class Prog90 extends Applet
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
		BtnHanlder list_obj = new BtnHanlder();
		
		btnorange.addActionListener(list_obj);
		btngreen.addActionListener(list_obj);
		
		setFont (new Font("Arial",Font.BOLD,25));	
		setVisible(true);		
	}
	//the listener object has to be inner class so it can access buttin object
	
	class BtnHanlder implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			//check which button is clicked
			
			if(ae.getSource() == btnorange)
			setBackground(Color.ORANGE);
			
			else
			setBackground(Color.GREEN);
		}
	}
}