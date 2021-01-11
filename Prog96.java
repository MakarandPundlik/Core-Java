//and examlple of frame registered with hardware devices
//we want co-ordinates of mouse as we hover it on screena and character entered from keyboard

import java.awt.*;
import java.awt.event.*;

public class Prog96 extends Frame
{
	String msg1="",msg2="";
	public static void main(String[] args)
	{
		new Prog96();
	}
	public Prog96()
	{
		setTitle("Hardware Registered Frame");
		setBounds(250,125,500,500);
		setFont(new Font("Times New Roman",Font.BOLD,25));
	
		//register the frame
		//shortcut, use anonymous object
		
		addMouseMotionListener(new MyMouseAdapter());
		addKeyListener(new MyKeyAdapter());
		
		setVisible(true);
	}
	//inner class for event handling
	//because we have learnt that inner class can access all the members of outer scope
	class MyMouseAdapter extends MouseMotionAdapter
	{
		//override the reqd method
		public void mouseMoved(MouseEvent me)
		{
			msg1="Mouse moved to : "+me.getX()+","+me.getY();
			repaint();
		}
	}
	class MyKeyAdapter extends KeyAdapter
	{
		//override the reqd mrthod
		public void keyTyped(KeyEvent ke){
		msg2="Character entered from keyboard : "+ke.getKeyChar();
		repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg1,50,100);
		g.drawString(msg2,50,170);
	}
}