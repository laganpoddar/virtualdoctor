import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class abdomen extends JFrame
{
	JTextArea t1;
	abdomen()
	{
		setSize(1500,950);
		t1=new JTextArea();
		t1.setText("Insert Text for abdomen");
		JScrollPane scrollPane2 = new JScrollPane(t1);
		scrollPane2.setBounds(20,30, 263,200);
		add(scrollPane2);
		t1.setLineWrap(true);
		t1.setEditable(false);  
		
	}
		
	public static void main(String s[])
	{
	abdomen f=new abdomen();
	f.setVisible(true);
}
}