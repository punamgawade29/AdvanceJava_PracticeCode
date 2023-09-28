import javax.swing.*;
import java.awt.*;
class JLabelDemo extends JFrame
{
//	Jpanel heading;
JLabelDemo()
{
Container c=getContentPane();

Font f=new Font("Arial Black",Font.BOLD,30);



JPanel p=new JPanel();
//p.setLayout(c);
//FlowLayout f1=new FlowLayout();
   // Jpanel p=new Jpanel();
   //p.setBackground(Color.red);
   p.setBackground(new Color(0,0,0,80));
  
	p.setBounds(0,0,900,70);
	//p.setBounds(10,10,50,70);
	
	JLabel name=new JLabel("Login Example");
	name.setBounds(20,25,400,50);
	 name.setForeground(Color.green);
	//name.setFont(f);

	p.add(name);
	
	
	
	
	
	JPanel login=new JPanel();
	login.setLayout(null);
	login.setSize(400,350);
	login.setBackground(new Color(0,0,0,60));
      login.setBounds(250,175,400,350);
	  
	  JTextField tf1=new JTextField("Enter username");
	  tf1.setBounds(50,50,300,50);
	 // tf1.setOpaque(false);
	  tf1.setForeground(Color.white);
	  tf1.setBackground(new Color(210,180,140));
	  
	  login.add(tf1);
	  
	  
	  JPasswordField tf2=new JPasswordField("Enter password");
	  tf2.setBounds(50,150,300,50);
	  // tf2.setOpaque(false);
	   tf2.setForeground(Color.white);
	  tf2.setBackground(new Color(210,180,140));
	  login.add(tf2);
	  
	  JButton b1=new JButton("Sign Up");
	  b1.setBounds(50,250,100,50);
	  b1.setBackground(new Color(160,182,45));
	  login.add(b1);
	  
	   JButton b2=new JButton("Login");
	  b2.setBounds(250,250,100,50);
	  b2.setBackground(new Color(160,182,45));
	  login.add(b2);
	  
	  
	  




setLayout(null);

//Image ii=Toolkit.getDefaultToolkit().getImage("C:UsersAdminPicturesSaved Pictures.png");
ImageIcon ii=new ImageIcon("flowers.jpg");

Image img=ii.getImage() ;
Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
ii=new ImageIcon(temp_img);
JLabel L1=new JLabel("",ii,JLabel.CENTER);
c.add(p);
L1.add(p);
L1.add(login);

L1.setBounds(0,0,900,600);

c.add(L1);
//c.add(name);
//c.add(p);
c.add(login);
}
public static void main(String args[])
{
JLabelDemo jld=new JLabelDemo();
jld.setVisible(true);
jld.setTitle("JLabel Demo");
jld.setSize(900,600);
}
}
