import java.awt.*;
import java.awt.event.*;

class LoginForm extends Frame

{
	Label L1,L2,L3;
LoginForm()
{
	FlowLayout f2 =new FlowLayout();
	setLayout(f2);
	
	L1=new Label("WELCOME TO WORLD OF PROGRAMMING");
	L2=new Label("Username");
	L3=new Label("Password");
	TextField tf1=new TextField(20);
	TextField tf2=new TextField(20);
	tf2.setEchoChar('*');
	Button b1=new Button("Login");
	
	
	add(L1);
	add(L2);
	add(L3);
	add(tf1);
	add(tf2);
	add(b1);
	

}

public static void main(String args[])
{
	LoginForm l=new LoginForm();
	l.setVisible(true);
	l.setTitle("AWT COMPONENT");

	l.setSize(500,500);
}

}