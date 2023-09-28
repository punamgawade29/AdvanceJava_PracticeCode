import javax.swing.*;
import java .awt.*;
import java.awt.event.*;

class Demo1 extends JFrame implements ActionListener
{	
		JLabel vj;
		JTextField tf1,tf2;
		Container c;
		Demo1()
{
	Container c=getContentPane();
	c.setLayout(null);
	JTextField t2=new JTextField(100);
	t2.setBackground(Color.black);
	t2.setBounds(3,0,10,600);
	c.add(t2);
	
	JTextField t3=new JTextField(100);
	t3.setBackground(Color.black);
	t3.setBounds(10,0,10,600);
	c.add(t3);
	
	JTextField t4=new JTextField(100);
	t4.setBackground(Color.black);
	t4.setBounds(16,0,20,600);
	c.add(t4);
	
	JTextField t5=new JTextField(100);
	t5.setBackground(Color.black);
	t5.setBounds(950,0,10,600);
	c.add(t5);
	
	
	JTextField t6=new JTextField(100);
	t6.setBackground(Color.black);
	t6.setBounds(960,0,15,600);
	c.add(t6);
	
	JTextField t7=new JTextField(100);
	t7.setBackground(Color.black);
	t7.setBounds(970,0,10,600);
	c.add(t7);
	//setLayout(null);
	
	
	//##########Font############
	
	
Font f=new Font("Arial Black",Font.BOLD,30);
//Font f1=new Font("Arial Black",Font.BOLD,30);


	
	
	//#########BorderLayout#############
	
	/*JPanel p3=new JPanel();
	//p3.setLayout(null);
	BorderLayout bd1=new  BorderLayout(10,10);
	setLayout(bd1);
	
	JLabel l5=new JLabel("");
	JLabel l6=new JLabel("");
	JLabel l7=new JLabel("");
	JLabel l8=new JLabel("");
	JLabel l9=new JLabel("");
	
	l5.setBounds(0,600,10,0);
	l6.setBounds(0,600,10,0);
	l7.setBounds(0,600,10,0);
	l8.setBounds(0,600,10,0);
	l9.setBounds(0,600,10,0);
	
	
	
	
       p3.add(l5.BorderLayout.EAST);
		p3.add(l6.BorderLayout.WEST);
	   p3.add(l7.BorderLayout.SOUTH);
		p3.add(l8.BorderLayout.NORTH);
		p3.add(l9.BorderLayout.CENTER);	
		
		c.add(p3);
		p3.add(bd1);*/
	
	
	
	//#########LABEL###############
	
	JPanel p=new JPanel();
	p.setLayout(null);
	p.setBackground(new Color(0,0,0,50));
	p.setBounds(0,0,1000,70);
	
	
	JLabel name=new JLabel("LOGIN PAGE",JLabel.LEFT);
	name.setBounds(240,25,300,50);
	name.setForeground(Color.green);
	name.setFont(f);
	
	p.add(name);
	
	
	
	
	
	//###########Login###############
	
	JPanel login=new JPanel();
	login.setLayout(null);
	
	login.setSize(400,350);
	login.setBackground(new Color(0,0,0,60));
	login.setBounds(100,175,400,350);
	c.add(login);
	
	vj=new JLabel("                   ");
	
	
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
	//tf2.setEchoChar('p');
	login.add(tf2);
	
	
	JButton b1=new JButton("Sign Up");
	b1.setBounds(110,190,100,40);
	b1.setForeground(Color.red);
	
	login.add(b1);
	
	JButton b2=new JButton("Login");
	b2.setBounds(220,190,100,40);
	b2.setForeground(Color.red);
	b2.addActionListener(this); 
	login.add(b2);
	
	vj.setBounds(260,250,50,40);
	login.add(vj);
	

	
	
	
	
	

	
	
	//######Image########
	setLayout(null);
	/*JTextField t1=new JTextField(100);
	t1.setBackground(new Color(0,0,0,60));
	t1.setBounds(220,100,560,40);
	add(t1);
	
	JTextField t2=new JTextField(100);
	t2.setBackground(Color.pink);
	t2.setBounds(8,70,40,600);
	add(t2);
	
	/*JTextField t3=new JTextField(100);
	t2.setBackground(new Color(0,0,0,60));
	t3.setBounds(750,130,40,500);
	add(t3);
	
	JTextField t4=new JTextField(100);
	t4.setBackground(Color.cyan);
	t4.setBounds(220,520,550,40);
	add(t4);*/
	
	
	ImageIcon ii=new ImageIcon("nature.jpg");
	
	//JLabel L1=new JLabel("",ii,JLabel.CENTER);
	Image img=ii.getImage();
	Image temp=img.getScaledInstance(580,600,Image.SCALE_SMOOTH);
	ii=new ImageIcon(temp);
	JLabel L1=new JLabel("",ii,JLabel.RIGHT);
	
	c.add(p);
	L1.add(p);
	L1.add(login);
	L1.setBounds(220,0,580,600);

	
	
	
	//JPanel p2=new JPanel();*/
	setLayout(null);
	ImageIcon back=new ImageIcon("moon.jpg");
	//JLabel L2=new JLabel("",back,JLabel.CENTER);
	Image img1=back.getImage();
	Image temp1=img1.getScaledInstance(320,600,Image.SCALE_SMOOTH);
	back=new ImageIcon(temp1);
	JLabel L2=new JLabel("",back,JLabel.LEFT);
	//add(p2);
	//L2.add(p);
	
	L2.setBounds(30,0,320,600);
	
	
	setLayout(null);
	ImageIcon back_img=new ImageIcon("night.jpg");
	//JLabel L2=new JLabel("",back,JLabel.CENTER);
	Image img2=back_img.getImage();
	Image temp2=img2.getScaledInstance(700,600,Image.SCALE_SMOOTH);
	back_img=new ImageIcon(temp2);
	JLabel L3=new JLabel("",back_img,JLabel.RIGHT);
	//add(p2);
	//L2.add(p);
	L3.setBounds(700,0,270,600);
	
	
	
	/*setLayout(null);
	ImageIcon border_img=new ImageIcon("border.jpg");
	//JLabel L2=new JLabel("",back,JLabel.CENTER);
	Image img3=border_img.getImage();
	Image temp3=img3.getScaledInstance(30,600,Image.SCALE_SMOOTH);
	border_img=new ImageIcon(temp3);
	JLabel L4=new JLabel("",border_img,JLabel.LEFT);
	//add(p2);
	//L2.add(p);

	L4.setBounds(0,0,30,600);*/
	
	
	setLayout(null);
	/*ImageIcon border_ii=new ImageIcon("border.jpg");
	//JLabel L2=new JLabel("",back,JLabel.CENTER);
	Image img4=border_ii.getImage();
	Image temp4=img4.getScaledInstance(30,600,Image.SCALE_SMOOTH);
	border_ii=new ImageIcon(temp4);
	JLabel L5=new JLabel("",border_ii,JLabel.LEFT);
	//add(p2);
	//L2.add(p);

	L5.setBounds(970,0,30,600);*/
	
	
	
	
	//L1.add(p);
	
	c.add(L1);
	c.add(L2);
	c.add(L3);
	//c.add(L4);
	//c.add(L5);
	


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
		Demo1 d=new Demo1();
		d.setVisible(true);
		d.setTitle("Login demo");
		d.setSize(1000,600);
		
	
	}
}