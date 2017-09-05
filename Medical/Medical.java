
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
public class Medical extends JFrame implements ActionListener
{
	JLabel l1,background;
	ImageIcon i9;
	JButton b1,b2 , b3;
	Medical()
	{
		///setSize(1500,9500);
		
		
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
		l1=new JLabel("Are you aware about your medical problem?");
		b1=new JButton("YES");
		b2=new JButton("NO");
		b3=new JButton(i9);
		background.add(l1);background.add(b1);background.add(b2);background.add(b3);
		l1.setBounds(new Rectangle(480,260,250,30));
		b1.setBounds(new Rectangle(520,295,150,30));
		b2.setBounds(new Rectangle(520,330,150,30));
	    b3.setBounds(new Rectangle(1346,2,19,19));
		l1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			loginm lm=new loginm();
			lm.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			
			dispose();
			
		}
		
		else
		{
			gender g=new gender();
			g.setVisible(true);
		}
	}
	public static void main(String s[])
	{
		Medical m=new Medical();
		m.setVisible(true);
	}
}