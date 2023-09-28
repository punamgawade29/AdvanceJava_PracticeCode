import javax.swing.*;
import java.awt.*;

class JTextFieldDemo extends JFrame
{
JTextFieldDemo()
{
Container c1=getContentPane();
//FlowLayout f1=new FlowLayout();
c1.setLayout(null);
ImageIcon ii=new ImageIcon("flowers.jpg");


c1.setForeground(Color.blue);
JLabel L1=new JLabel("Enter User Name:");
JLabel L2=new JLabel("Enter Password:");
JLabel L3=new JLabel("or");
JLabel L4=new JLabel("sign in");
L4.setForeground(Color.blue);
JTextField tf1=new JTextField(20);
JTextField tf2=new JTextField(20);


JButton b1=new JButton("Login");

L1.setBounds(30,100,110,40);
tf1.setBounds(140,100,150,40);
L2.setBounds(30,140,110,40);
tf2.setBounds(140,150,150,40);
b1.setBounds(130,220,100,40);
L3.setBounds(150,270,50,40);
L4.setBounds(140,300,100,40);


c1.add(L1);
c1.add(tf1);
c1.add(L2);
c1.add(tf2);
c1.add(b1);
c1.add(L3);
c1.add(L4);
}
public static void main(String args[])
{
JTextFieldDemo jtfd=new JTextFieldDemo();
jtfd.setVisible(true);
jtfd.setTitle("JTextField Demo");
jtfd.setSize(500,500);
jtfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
