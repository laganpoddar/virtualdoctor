

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
import java.awt.Color; //for RGB combination in Buttons
class male extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel background;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23 , close;
	ImageIcon i9;
	male()
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
		background=new JLabel(new ImageIcon("M.jpg"));
		add(background);
		b1=new JButton("");		b2=new JButton("");		b3=new JButton("");		b4=new JButton("");		b5=new JButton("");
		b6=new JButton("");		b7=new JButton("");		b8=new JButton("");		b9=new JButton("");		b10=new JButton("");
		b11=new JButton("");	b12=new JButton("");	b13=new JButton("");	b14=new JButton("");	b15=new JButton("");
		b16=new JButton("");	b17=new JButton("");	b18=new JButton("");	b19=new JButton("");	b20=new JButton("");
		b21=new JButton("");	b22=new JButton("");	b23=new JButton("");
		close = new JButton(i9);
		background.add(b1);background.add(b2);background.add(b3);background.add(b4);background.add(b5);background.add(b6);background.add(b7);background.add(b8);background.add(b9);background.add(b10);background.add(b11);background.add(b12);background.add(b13);background.add(b14);background.add(b15);background.add(b16);background.add(b17);background.add(b18);background.add(b19);background.add(b20);background.add(b21);background.add(b22);background.add(b23);
		background.add(close);
		
		b1.setBounds(new Rectangle(377,50,10,7));		b2.setBounds(new Rectangle(351,80,10,7));
		b3.setBounds(new Rectangle(443,80,10,7));		b4.setBounds(new Rectangle(379,111,10,7));
		b5.setBounds(new Rectangle(385,141,10,7));		b20.setBounds(new Rectangle(1003,295,10,7));
		b7.setBounds(new Rectangle(385,218,10,7));		b6.setBounds(new Rectangle(250,173,10,7));
		b9.setBounds(new Rectangle(198,370,10,7));		b8.setBounds(new Rectangle(294,237,10,7));
		b11.setBounds(new Rectangle(322,422,10,7));		b10.setBounds(new Rectangle(390,386,10,7));
		b13.setBounds(new Rectangle(327,527,10,7));		b12.setBounds(new Rectangle(176,448,10,7));
		b15.setBounds(new Rectangle(999,121,10,7));		b14.setBounds(new Rectangle(348,684,10,7));
		b17.setBounds(new Rectangle(1164,208,10,7));	b16.setBounds(new Rectangle(997,163,10,7));
		b19.setBounds(new Rectangle(943,298,10,7));		b18.setBounds(new Rectangle(841,280,10,7));
		b21.setBounds(new Rectangle(965,370,10,7));		b22.setBounds(new Rectangle(959,573,10,7));
		b23.setBounds(new Rectangle(395,295,10,7));
		close.setBounds(new Rectangle(1346,2,19,19));
		
		b1.addActionListener(this);		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);		b6.addActionListener(this);
		b7.addActionListener(this);		b8.addActionListener(this);		b9.addActionListener(this);
		b10.addActionListener(this);	b11.addActionListener(this);	b12.addActionListener(this);
		b13.addActionListener(this);	b14.addActionListener(this);	b15.addActionListener(this);
		b16.addActionListener(this);	b17.addActionListener(this);	b18.addActionListener(this);
		b19.addActionListener(this);	b20.addActionListener(this);	b21.addActionListener(this);
		b22.addActionListener(this);	b23.addActionListener(this);
		close.addActionListener(this);
		//button_name.setBackground(new Color(R,G,B));
		b1.setBackground(new Color(129,187,27));b2.setBackground(new Color(129,187,27));b3.setBackground(new Color(129,187,27));b4.setBackground(new Color(129,187,27));b5.setBackground(new Color(129,187,27));b6.setBackground(new Color(129,187,27));b7.setBackground(new Color(129,187,27));b8.setBackground(new Color(129,187,27));b9.setBackground(new Color(129,187,27));b10.setBackground(new Color(129,187,27));b11.setBackground(new Color(129,187,27));b12.setBackground(new Color(129,187,27));b13.setBackground(new Color(129,187,27));b14.setBackground(new Color(129,187,27));b15.setBackground(new Color(129,187,27));b16.setBackground(new Color(129,187,27));b17.setBackground(new Color(129,187,27));b18.setBackground(new Color(129,187,27));b19.setBackground(new Color(129,187,27));b20.setBackground(new Color(129,187,27));b21.setBackground(new Color(129,187,27));b22.setBackground(new Color(129,187,27));b23.setBackground(new Color(129,187,27));
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) //button for forehead
		{ 
			forehead fh=new forehead();
			fh.setVisible(true);
		}

		if(ae.getSource()==b2) //button for eye
		{ 
			eye fh=new eye();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b3) //button for ear
		{ 
			ear fh=new ear();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b4) //button for nose
		{ 
			nose fh=new nose();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b5) //button for throat
		{ 
			throat fh=new throat();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b6) //button for shoulder
		{ 
			shoulder fh=new shoulder();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b7) //button for chest
		{ 
			chest fh=new chest();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b8) //button for armpit
		{ 
			armpit fh=new armpit();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b9) //button for wrist
		{ 
			wrist fh=new wrist();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b10) //button for pelvis
		{ 
			pelvis fh=new pelvis();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b11) //button for thigh
		{ 
			thigh fh=new thigh();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b12) //button for finger
		{ 
			finger fh=new finger();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b13) //button for knee
		{ 
			knee fh=new knee();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b14) //button for ankle
		{ 
			ankle fh=new ankle();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b15) //button for neck
		{ 
			neck fh=new neck();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b16) //button for spine
		{ 
			spine fh=new spine();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b17) //button for back of shoulder but opens up that of shoulder only
		{ 
			shoulder fh=new shoulder();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b18) //button for elbow
		{ 
			elbow fh=new elbow();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b19) //button for loin
		{ 
			loin fh=new loin();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b20) //button for back
		{ 
			back fh=new back();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b21) //button for buttock
		{ 
			buttock fh=new buttock();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b22) //button for calf
		{ 
			calf fh=new calf();
			fh.setVisible(true);
		}
		
		if(ae.getSource()==b23) //button for abdomen
		{ 
			abdomen fh=new abdomen();
			fh.setVisible(true);
		}
		
		
		else if(ae.getSource()==close){
			
			dispose();
			
			
		}
		
	}
			
	public static void main(String s[])
	{
		male m=new male();
		m.setVisible(true);
	}
}