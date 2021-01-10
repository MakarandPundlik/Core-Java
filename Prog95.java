//design the frame with 2 textfields to accept 2 numbers from user and display their sum
import java.awt.*;
import java.awt.event.*;
class Prog95 extends Frame implements ActionListener
{
	Label l1,l2,result;
	TextField t1,t2;
	public static void main(String[] args)
	{
		new Prog95();
	}
	public Prog95()
	{
		setTitle("Addtion");
		setBounds(250,125,500,500);
		
		setLayout(null);//manual
		
		l1 = new Label("Number 1");
		l2 = new Label("Number 2");
		result = new Label("");
		t1 = new TextField("");
		t2 = new TextField("");
		
		l1.setBounds(50,50,100,30);
		l2.setBounds(50,100,100,30);
		t1.setBounds(170,50,100,30);
		t2.setBounds(170,100,100,30);
		result.setBounds(50,200,150,50);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(result);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		//to manage window events create an object of MyWindowAdapter which is a user defined class
		MyWindowAdapter myAdapter = new MyWindowAdapter();
		addWindowListener(myAdapter);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int no1 = Integer.parseInt(t1.getText());
			int no2 = Integer.parseInt(t2.getText());
			
			result.setText("Sum of "+no1+" and "+no2+" is : " +(no1+no2));
		}
		catch(NumberFormatException e)
		{
			result.setText("Please enter integers only");
		}
	}
	//inner class
	class MyWindowAdapter extends WindowAdapter
	{
		//override reqd method of interface
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}