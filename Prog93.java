//an assignment on radio buttons

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="Prog93.class" height="500" width="500"></applet>
public class Prog93 extends Applet implements ItemListener
{
	Label l1,l2;
	Checkbox radm,radum,radl25,radb2550,radg50;
	CheckboxGroup rbg1,rbg2;
	public void init()
	{
		setFont (new Font("Arial",Font.BOLD,25));
		setLayout(null);
		
		l1 = new Label("Marital Status");
		rbg1 = new CheckboxGroup();
		
		radm = new Checkbox("Married",rbg1,false);
		radum = new Checkbox("Unmarried",rbg1,true);
		
		l1.setBounds(50,50,180,30);
		radm.setBounds(50,100,150,30);
		radum.setBounds(230,100,150,30);
		
		add(l1);
		add(radm);
		add(radum);
		
		radm.addItemListener(this);
		radum.addItemListener(this);
		
		l2 = new Label("Income Group");
		
		rbg2 = new CheckboxGroup();
		radl25 = new Checkbox("<25K",rbg2,true);
		radb2550 = new Checkbox("25K< >50k",rbg2,false);
		radg50= new Checkbox(">50K",rbg2,false);
		
		l2.setBounds(50,220,200,30);
		radl25.setBounds(10,280,150,30);
		radb2550.setBounds(160,280,150,30);
		radg50.setBounds(340,280,150,30);
		
		add(l2);
		add(radl25);
		add(radb2550);
		add(radg50);
		
		radl25.addItemListener(this);
		radb2550.addItemListener(this);
		radg50.addItemListener(this);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("I am "+rbg1.getSelectedCheckbox().getLabel(),50,160);
		
		g.drawString("My income is "+rbg2.getSelectedCheckbox().getLabel(),50,340);
	}
}