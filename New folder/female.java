import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class female extends JFrame implements ActionListener
{
	JLabel background;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
	female()
	{
		setSize(1500,950);
		setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("FM.jpg"));
		add(background);
		b1=new JButton("");		b2=new JButton("");		b3=new JButton("");		b4=new JButton("");		b5=new JButton("");
		b6=new JButton("");		b7=new JButton("");		b8=new JButton("");		b9=new JButton("");		b10=new JButton("");
		b11=new JButton("");	b12=new JButton("");	b13=new JButton("");	b14=new JButton("");	b15=new JButton("");
		b16=new JButton("");	b17=new JButton("");
		
		background.add(b1);background.add(b2);background.add(b3);background.add(b4);background.add(b5);background.add(b6);background.add(b7);background.add(b8);background.add(b9);background.add(b10);background.add(b11);background.add(b12);background.add(b13);background.add(b14);background.add(b15);background.add(b16);background.add(b17);
		background.setBounds(new Rectangle(0,0,1500,950));
		b1.setBounds(new Rectangle(383,51,2,2));
		b2.setBounds(new Rectangle(359,71,2,2));
		b3.setBounds(new Rectangle(383,83,2,2));
		b4.setBounds(new Rectangle(383,96,2,2));
		b5.setBounds(new Rectangle(325,72,2,2));
		b6.setBounds(new Rectangle(383,121,2,2));
		b7.setBounds(new Rectangle(325,190,2,2));
		b8.setBounds(new Rectangle(395,232,2,2));
		b9.setBounds(new Rectangle(400,300,2,2));
		b10.setBounds(new Rectangle(395,350,2,2));
		b11.setBounds(new Rectangle(234,156,2,2));
		b12.setBounds(new Rectangle(210,300,2,2));
		b13.setBounds(new Rectangle(190,375,2,2));
		b14.setBounds(new Rectangle(333,430,2,2));
		b15.setBounds(new Rectangle(360,625,2,2));
		b16.setBounds(new Rectangle(1000,50,2,2));
		b17.setBounds(new Rectangle(1000,180,2,2));
		
		b1.addActionListener(this);		
		b2.addActionListener(this);	
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this); 
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this); 
		b14.addActionListener(this); 
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{ 
			forehead fh=new forehead();
			fh.setVisible(true);
		}
	}
			
	public static void main(String s[])
	{
		female m=new female();
		m.setVisible(true);
	}
}