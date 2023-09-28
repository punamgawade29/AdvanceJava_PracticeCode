import java.awt.*;
import java.awt.event.*;

class ButtonEvent extends Frame implements ActionListener
{


Label vj;
Label l1,l2;
TextField tf1,tf2;
Button b1;
ButtonEvent()
{

	FlowLayout f1=new FlowLayout();
	setLayout(f1);
	vj=new Label("      ");
	 l1=new Label("enter name");
	 l2=new Label("enter password");
	 
 tf1=new TextField(10);
	tf2=new TextField(10);
	tf2.setEchoChar('*');
	 b1=new Button ("sumbit");
	b1.addActionListener(this);
	add(l1);
	add(l2);
	add(tf1);
	add(tf2);
	add(b1);
	
} 


public void actionPerformed(ActionEvent ae)
{
	
		String un=tf1.getText();
	    String psw=tf2.getText();
		if(un.equals("punam")&&psw.equals("punam"))
		{
			vj.setText("succesfull");
			
		}
		else
		{
			vj.setText("fail");
		}
		
	
}
 
public static void main(String args[])
{

ButtonEvent be1=new ButtonEvent();
be1.setVisible(true);
be1.setTitle("event");
be1.setSize(500,500);
}
}