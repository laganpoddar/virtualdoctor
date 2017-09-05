

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
class female extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel background;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,close;
	ImageIcon i9;
	female()
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
		background=new JLabel(new ImageIcon("FM.jpg"));
		add(background);
		b1=new JButton("");		b2=new JButton("");		b3=new JButton("");		b4=new JButton("");		b5=new JButton("");
		b6=new JButton("");		b7=new JButton("");		b8=new JButton("");		b9=new JButton("");		b10=new JButton("");
		b11=new JButton("");	b12=new JButton("");	b13=new JButton("");	b14=new JButton("");	b15=new JButton("");
		b16=new JButton("");	b17=new JButton("");	b18=new JButton("");	b19=new JButton("");	b20=new JButton("");	
		b21=new JButton("");	b22=new JButton("");	b23=new JButton("");	b24=new JButton("");	b25=new JButton("");
		b26=new JButton("");
		close = new JButton(i9);
		background.add(close);
		
		background.add(b1);background.add(b2);background.add(b3);background.add(b4);background.add(b5);background.add(b6);background.add(b7);background.add(b8);background.add(b9);background.add(b10);background.add(b11);background.add(b12);background.add(b13);background.add(b14);background.add(b15);background.add(b16);background.add(b17);background.add(b18);background.add(b19);background.add(b20);background.add(b21);background.add(b22);background.add(b23);background.add(b24);background.add(b25);background.add(b26);
		background.setBounds(new Rectangle(0,0,1500,950));
		b1.setBounds(new Rectangle(346,30,10,7));		b2.setBounds(new Rectangle(316,57,10,7));
		b3.setBounds(new Rectangle(400,60,10,7));		b4.setBounds(new Rectangle(345,81,10,7));
		b5.setBounds(new Rectangle(333,127,10,7));		b6.setBounds(new Rectangle(196,132,10,7));
		b7.setBounds(new Rectangle(334,191,10,7));		b8.setBounds(new Rectangle(263,189,10,7));
		b9.setBounds(new Rectangle(170,242,10,7));		b10.setBounds(new Rectangle(121,348,10,7));
		b11.setBounds(new Rectangle(331,362,10,7));		b12.setBounds(new Rectangle(248,404,10,7));
		b13.setBounds(new Rectangle(264,515,10,7));		b14.setBounds(new Rectangle(270,671,10,7));
		b15.setBounds(new Rectangle(992,94,10,7));		b16.setBounds(new Rectangle(994,137,10,7));
		b17.setBounds(new Rectangle(863,164,10,7));		b18.setBounds(new Rectangle(1003,256,10,7));
		b19.setBounds(new Rectangle(848,261,10,7));		b20.setBounds(new Rectangle(963,290,10,7));
		b21.setBounds(new Rectangle(835,297,10,7));		b22.setBounds(new Rectangle(942,360,10,7));
		b23.setBounds(new Rectangle(790,417,10,7));		b24.setBounds(new Rectangle(934,589,10,7));
		b25.setBounds(new Rectangle(1038,709,10,7));	b26.setBounds(new Rectangle(337,278,10,7));
		close.setBounds(new Rectangle(1346,2,19,19));
		
		//button_name.setBackground(new Color(R,G,B));
		b1.setBackground(new Color(129,187,27));
		b2.setBackground(new Color(129,187,27));
		b3.setBackground(new Color(129,187,27));b4.setBackground(new Color(129,187,27));b5.setBackground(new Color(129,187,27));b6.setBackground(new Color(129,187,27));b7.setBackground(new Color(129,187,27));b8.setBackground(new Color(129,187,27));b9.setBackground(new Color(129,187,27));b10.setBackground(new Color(129,187,27));b11.setBackground(new Color(129,187,27));b12.setBackground(new Color(129,187,27));b13.setBackground(new Color(129,187,27));b14.setBackground(new Color(129,187,27));b15.setBackground(new Color(129,187,27));b16.setBackground(new Color(129,187,27));b17.setBackground(new Color(129,187,27));b18.setBackground(new Color(129,187,27));b19.setBackground(new Color(129,187,27));b20.setBackground(new Color(129,187,27));b21.setBackground(new Color(129,187,27));b22.setBackground(new Color(129,187,27));b23.setBackground(new Color(129,187,27));b24.setBackground(new Color(129,187,27));b25.setBackground(new Color(129,187,27));b26.setBackground(new Color(129,187,27));
		
		b1.addActionListener(this);		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);		b6.addActionListener(this);
		b7.addActionListener(this);		b8.addActionListener(this);		b9.addActionListener(this);
		b10.addActionListener(this);	b11.addActionListener(this);	b12.addActionListener(this);
		b13.addActionListener(this);	b14.addActionListener(this);	b15.addActionListener(this);
		b16.addActionListener(this);	b17.addActionListener(this);	b18.addActionListener(this);
		b19.addActionListener(this);	b20.addActionListener(this);	b21.addActionListener(this);
		b22.addActionListener(this);	b23.addActionListener(this);	b24.addActionListener(this);
		b25.addActionListener(this);	b26.addActionListener(this);
		close.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{ 
			forehead fh=new forehead();
			fh.setVisible(true);
		}
		
else if(ae.getSource()==close){
			
			dispose();
			
			
		}
	}
			
	public static void main(String s[])
	{
		female m=new female();
		m.setVisible(true);
	}
}