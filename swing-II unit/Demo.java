import javax.swing.*;
import java .awt.*;

class Demo extends JFrame
{
		Demo()
{
	//Container c=getContentPane();
	//setLayout(null);
	
	
	//##########Font############
	
	
	Font f=new Font("Arial Black",Font.BOLD,30);
	Font f1=new Font("Arial Black",Font.BOLD,10);
	
	
	
	
	
	//#########LABEL###############
	
	JPanel p=new JPanel();
	p.setBackground(new Color(0,0,0,50));
	p.setBounds(0,0,900,70);
	
	JLabel name=new JLabel("LOGIN PAGE");
	name.setBounds(20,25,450,50);
	name.setForeground(Color.green);
	name.setFont(f);
	
	p.add(name);
	
	
	//###########Login###############
	
	JPanel login=new JPanel();
	login.setLayout(null);
	
	login.setSize(400,350);
	login.setBackground(new Color(0,0,0,60));
	login.setBounds(250,175,400,350);
	
	JLabel jl1=new JLabel("Enter username");
	jl1.setBounds(50,50,200,40);
	jl1.setForeground(Color.red);
	login.add(jl1);
	
	
	JLabel jl2=new JLabel("Enter Password");
	jl2.setBounds(50,100,200,40);
	jl2.setForeground(Color.red);
	login.add(jl2);
	
	JTextField tf1=new JTextField(20);
	tf1.setBounds(220,50,90,40);
	login.add(tf1);
	
	JTextField tf2=new JTextField(20);
	tf2.setBounds(220,100,90,40);
	login.add(tf2);
	
	JButton b1=new JButton("Sign Up");
	b1.setBounds(110,190,100,40);
	b1.setForeground(Color.red);
	login.add(b1);
	
	JButton b2=new JButton("Login");
	b2.setBounds(220,190,100,40);
	b2.setForeground(Color.red);
	login.add(b2);
	

	
	
	
	
	

	
	
	//######Image########
	setLayout(null);
	ImageIcon ii=new ImageIcon("nature.jpg");
//	JLabel L1=new JLabel("",ii,JLabel.CENTER);
	Image img=ii.getImage();
	Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
	ii=new ImageIcon(temp);
	JLabel L1=new JLabel("",ii,JLabel.CENTER);
	add(p);
	L1.add(p);
	L1.add(login);
	L1.setBounds(0,0,900,600);
	
	
	
	//L1.add(p);
	add(L1);
	//add(p);


}
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.setVisible(true);
		d.setTitle("Login demo");
		d.setSize(900,600);
		
	
	}
}