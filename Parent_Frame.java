//example on parent and child frame

import java.awt.*;
import java.awt.event.*;

class Parent_Frame extends Frame implements ActionListener
{
	Button btnchild,btnexit;
	public static void main(String[] args)
	{
		new Parent_Frame();
	}
	 Parent_Frame()
	{
		
		setTitle("Parent Frame");
		setBounds(250,125,500,500);
		setFont(new Font("Times New Roman",Font.BOLD,25));
		setLayout(null);
		btnchild = new Button("open child");
		btnexit = new Button("exit");
		
		btnchild.setBounds(50,400,150,30);
		btnexit.setBounds(220,400,100,30);
		
		add(btnexit);
		add(btnchild);
		
		btnchild.addActionListener(this);
		btnexit.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnchild)
		{
			//dispose(); //if next frame is not child
			new Child_Frame();//call the child frame using constructor
		}
		else
		System.exit(0);
	}
	
	//child Frame
	class Child_Frame extends Frame implements ActionListener
	{
		Button btnclose;
		//IMP - do not use main()
		//main() should be only associated with starting frame of application
		
		//constructor
		Child_Frame()
		{
			setTitle("Child Frame");
			setBounds(400,275,200,200);
			setFont(new Font("Times New Roman",Font.BOLD,25));
			setLayout(new FlowLayout());
			btnclose = new Button("Close");
			add(btnclose);
			
			btnclose.addActionListener(this);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent ae)
		{
			dispose(); //close this frame and go back to calling/parent frame
		}
	}//end of child frame
}//end of parent frame