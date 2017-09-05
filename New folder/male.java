import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color; //for RGB combination in Buttons
class male extends JFrame implements ActionListener
{
	JLabel background;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
	male()
	{
		setSize(1300,760);
		setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("M.jpg"));
		add(background);
		b1=new JButton("");		b2=new JButton("");		b3=new JButton("");		b4=new JButton("");		b5=new JButton("");
		b6=new JButton("");		b7=new JButton("");		b8=new JButton("");		b9=new JButton("");		b10=new JButton("");
		b11=new JButton("");	b12=new JButton("");	b13=new JButton("");	b14=new JButton("");	b15=new JButton("");
		b16=new JButton("");	b17=new JButton("");	b18=new JButton("");	b19=new JButton("");	b20=new JButton("");
		b21=new JButton("");	b22=new JButton("");	b23=new JButton("");
		
		background.add(b1);background.add(b2);background.add(b3);background.add(b4);background.add(b5);background.add(b6);background.add(b7);background.add(b8);background.add(b9);background.add(b10);background.add(b11);background.add(b12);background.add(b13);background.add(b14);background.add(b15);background.add(b16);background.add(b17);background.add(b18);background.add(b19);background.add(b20);background.add(b21);background.add(b22);background.add(b23);
		
		
		b1.setBounds(new Rectangle(377,50,10,7));		b2.setBounds(new Rectangle(351,74,5,3));
		b3.setBounds(new Rectangle(443,75,5,3));		b4.setBounds(new Rectangle(379,101,5,3));
		b5.setBounds(new Rectangle(385,131,5,3));		b20.setBounds(new Rectangle(1003,277,5,3));
		b7.setBounds(new Rectangle(385,204,5,3));		b6.setBounds(new Rectangle(250,163,5,3));
		b9.setBounds(new Rectangle(198,350,5,3));		b8.setBounds(new Rectangle(294,224,5,3));
		b11.setBounds(new Rectangle(322,398,5,3));		b10.setBounds(new Rectangle(390,363,5,3));
		b13.setBounds(new Rectangle(327,497,5,3));		b12.setBounds(new Rectangle(176,422,5,3));
		b15.setBounds(new Rectangle(999,110,5,3));		b14.setBounds(new Rectangle(348,644,5,3));
		b17.setBounds(new Rectangle(1164,200,5,3));		b16.setBounds(new Rectangle(999,152,5,3));
		b19.setBounds(new Rectangle(943,278,5,3));		b18.setBounds(new Rectangle(841,260,5,3));
		b21.setBounds(new Rectangle(965,350,5,3));		b22.setBounds(new Rectangle(959,543,5,3));
		b23.setBounds(new Rectangle(395,280,5,3));
		
		b1.addActionListener(this);		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);		b6.addActionListener(this);
		b7.addActionListener(this);		b8.addActionListener(this);		b9.addActionListener(this);
		b10.addActionListener(this);	b11.addActionListener(this);	b12.addActionListener(this);
		b13.addActionListener(this);	b14.addActionListener(this);	b15.addActionListener(this);
		b16.addActionListener(this);	b17.addActionListener(this);	b18.addActionListener(this);
		b19.addActionListener(this);	b20.addActionListener(this);	b21.addActionListener(this);
		b22.addActionListener(this);	b23.addActionListener(this);
		//button_name.setBackground(new Color(R,G,B));
		b1.setBackground(new Color(129,187,27));b2.setBackground(new Color(129,187,27));b3.setBackground(new Color(129,187,27));b4.setBackground(new Color(129,187,27));b5.setBackground(new Color(129,187,27));b6.setBackground(new Color(129,187,27));b7.setBackground(new Color(129,187,27));b8.setBackground(new Color(129,187,27));b9.setBackground(new Color(129,187,27));b10.setBackground(new Color(129,187,27));b11.setBackground(new Color(129,187,27));b12.setBackground(new Color(129,187,27));b13.setBackground(new Color(129,187,27));b14.setBackground(new Color(129,187,27));b15.setBackground(new Color(129,187,27));b16.setBackground(new Color(129,187,27));b17.setBackground(new Color(129,187,27));b18.setBackground(new Color(129,187,27));b19.setBackground(new Color(129,187,27));b20.setBackground(new Color(129,187,27));b21.setBackground(new Color(129,187,27));b22.setBackground(new Color(129,187,27));b23.setBackground(new Color(129,187,27));
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
		male m=new male();
		m.setVisible(true);
	}
}