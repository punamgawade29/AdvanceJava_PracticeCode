import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextDemo3 extends JFrame implements ActionListener

{	Container c;
	JLabel L1;
	JTextField tf1,tf2;
	TextDemo3()
	{
		 c=new getContentPane();
		c.setLayout(null);
		
		JLabel L1=new JLabel("                 ");
		JLabel L2=new JLabel("enter username");
		JLabel L3=new JLabel("enter Password");
		JTextField tf1=new JTextField(20);
		JTextField tf2=new JTextField(20);
		//tf2.setEchoChar('*');
		JButton b1=new JButton("Login");
		b1.addActionListener(this); 
			
		
		L2.setBounds(100,80,70,40);
		tf1.setBounds(150,80,120,40);
		L3.setBounds(170,100,70,40);
		tf2.setBounds(220,100,120,40);
		b1.setBounds(230,150,50,40);
		L1.setBounds(230,180,180,40);
		
		
		c.add(L2);
		c.add(L3);
		c.add(tf1);
		c.add(tf2);
		c.add(b1);
		c.add(L1);
	
	}
		public void ActionPerformed(ActionEvent ae)
		{
		
			String un=tf1.getText();
			String psw=tf2.getText();
			if(un.equals("vijadhav")&&psw.equals("vijadhav"))
			{
				L1.setText(" Login succesfully");
				
			}
			else
			{
				L1.setText("Login Fail");
			}
			

		}
			public static void main(String args[])
{
			TextDemo3 d1=new TextDemo3();
			d1.setVisible(true);
			d1.setTitle("TextField  Control");
			d1.setSize(700,700);
}
		
		
		

}