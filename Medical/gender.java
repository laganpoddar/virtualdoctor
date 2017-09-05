

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
class gender extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,background;
	JButton b1,b2,b3;
	ImageIcon i9;
	gender()
	{
		setUndecorated(true);
		setAlwaysOnTop(false);
		setResizable(false);
		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		setVisible(true);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		    
			int x = (int)tk.getScreenSize().getWidth();
			int y = (int)tk.getScreenSize().getHeight();
			
		   setSize(x ,y);
		   i9=new ImageIcon("close.jpg");
		   
		   
		   
		   
		setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("mback.jpg"));
		add(background);
		l1=new JLabel("GENDER");
		b1=new JButton("MALE");
		b2=new JButton("FEMALE");
		b3=new JButton(i9);
		  b3.setBounds(new Rectangle(1346,2,19,19));
		background.add(l1);background.add(b1);background.add(b2);background.add(b3);
		l1.setBounds(new Rectangle(520,260,150,30));
		b1.setBounds(new Rectangle(520,295,150,30));
		b2.setBounds(new Rectangle(520,330,150,30));
		
		l1.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
		{
			male m=new male();
			m.setVisible(true);
		}
		if(ae.getSource()==b2)
		{
			female f=new female();
			f.setVisible(true);
		}
		
		else if(ae.getSource()==b3)
		{
			
			dispose();
			
		}
	}
	public static void main(String s[])
	{
		gender m=new gender();
		m.setVisible(true);
	}
}