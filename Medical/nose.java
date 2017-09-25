import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class nose extends JFrame
{
	JTextArea t1;
	nose()
	{
		setSize(1500,950);
		t1=new JTextArea();
		t1.setText("Insert Text for nose");
		JScrollPane scrollPane2 = new JScrollPane(t1);
		scrollPane2.setBounds(20,30, 263,200);
		add(scrollPane2);
		t1.setLineWrap(true);
		t1.setEditable(false);  
		
	}
		
	public static void main(String s[])
	{
	nose f=new nose();
	f.setVisible(true);
}
}