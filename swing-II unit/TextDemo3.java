import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextDemo3 extends JFrame  implements ActionListener

{	Container c;
	JLabel L1;
	JTextField tf1,tf2;
	//JPasswordField tf2;
	TextDemo3()
	{
	c=getContentPane();
		c.setLayout(null);
		
		L1=new JLabel("                         ");
		JLabel L2=new JLabel("enter username");
		 JLabel L3=new JLabel("enter Password");
		 tf1=new JTextField(20);
		 tf2=new JTextField(20);
		 
		 //tf2=new JPasswordField("password");
	     //tf2.setEchoChar('*');
		JButton b1=new JButton("Login");
		b1.addActionListener(this); 
			
		
		L2.setBounds(100,80,100,40);
		tf1.setBounds(190,80,120,40);
		L3.setBounds(100,150,100,40);
		tf2.setBounds(220,150,120,40);
		b1.setBounds(320,290,150,40);
		L1.setBounds(330,350,180,40);
		
		
		c.add(L2);
		c.add(L3);
		c.add(tf1);
		c.add(tf2);
		c.add(b1);
		c.add(L1);
	
	}
		public void actionPerformed(ActionEvent ae)
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