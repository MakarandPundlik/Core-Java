//and example on menu driven program
//design the menu driven program with 2 menus file and format
//file -> exit
//format -> bold,italic
import java.awt.*;
import java.awt.event.*;
class Prog97 extends Frame implements ActionListener,ItemListener
{
	MenuBar mbar;
	Menu mfile,mformat;
	MenuItem mexit;
	CheckboxMenuItem mbold,mitalic;
	Label l ;
	Font f;
	public static void main(String[] args)
	{
		new Prog97();
	}
	
	Prog97()
	{
		setTitle("Menu Driven Program");
		setBounds(250,125,600,600);
		//setLayout(new Layout());
		
		mbar = new MenuBar();
		mfile = new Menu("File");
		mformat = new Menu("Format");
		mexit = new MenuItem("Exit");
		mbold = new CheckboxMenuItem("Bold");
		mitalic = new CheckboxMenuItem("Italic");
		l = new Label("Databyte Computer Training Center , Pune ");
		
		f = new Font("Times New Roman",Font.BOLD,25); //defualt font settings
		l.setFont(f);
		
		setMenuBar(mbar);
		mbar.add(mfile);
		mbar.add(mformat);
		mfile.add(mexit);
		mformat.add(mbold);
		mformat.add(mitalic);
		
		add(l);
		
		mexit.addActionListener(this);
		mbold.addItemListener(this);
		mitalic.addItemListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(mbold.getState())
		{
			if(mitalic.getState())
				f = new Font("New Times Roman",Font.BOLD|Font.ITALIC,25);
			else
					f = new Font("Times New Roman",Font.BOLD,25);
		}
		else{
			if(mbold.getState())
				f = new Font("New Times Roman",Font.ITALIC,25);
			else
					f = new Font("Times New Roman",Font.PLAIN,25);
		}
		l.setFont(f);
	}
}