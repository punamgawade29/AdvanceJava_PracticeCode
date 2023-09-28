import java.awt.*;
import java.awt.event.*;

   class LoginPage1 extends Frame implements ActionListener
   
   {
		Label vj;
	    TextField tf1,tf2;
		
		LoginPage1()
		{
				
				setLayout(null);
				setBackground(Color.cyan);
				setForeground(Color.black);
				
				Font f1 =new Font("Arial Black",Font.BOLD,25);
				Font f2 =new Font("Arial Black",Font.BOLD,15);
				
				vj=new Label("                   ");
				
				Label l1=new Label ("VJTech acdamey");
				Label l2=new Label ("enter username");
				Label  l3=new  Label("Password");
				
				l1.setFont(f1);
				setFont(f2);
				
				 tf1=new TextField(15);
			      tf2=new TextField(15);
				tf2.setEchoChar('*');
				
				
				
				Button b1=new Button("Login");
				b1.addActionListener(this); 
			
				
				
				l1.setBounds(200,200,500,40);
				
				l2.setBounds(200,300,130,40);
				
				tf1.setBounds(340,300,150,40);
				
				l3.setBounds(200,350,120,40);
				
				tf2.setBounds(340,350,150,40);
				
				b1.setBounds(300,430,90,40);
				
				vj.setBounds(300,500,250,40);
				
				
				
				
				
				add(l1);
				add(l2);
				add(tf1);
				add(l3);
				add(tf2);
				add(b1);
				add(vj);
				
				
				
		   
		}
				public void actionPerformed(ActionEvent ae)
		{
					String un=tf1.getText();
					String psw=tf2.getText();
					if(un.equals("vijadhav")&&psw.equals("vijadhav"))
					{
						vj.setText("Login successfully");
					}	
					else
					{
						vj.setText("Login fail");
					}
		}
   
   
   
			public static void main(String args[])
			
			{
				LoginPage1 lp1 =new LoginPage1();
				lp1.setVisible(true);
				lp1.setTitle("Loginpage");
				lp1.setSize(700,700);
				
			}
   
   }