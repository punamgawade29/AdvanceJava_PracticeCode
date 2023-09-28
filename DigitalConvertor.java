import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DigitalConvertor extends JFrame implements ActionListener
{
JLabel L1,L2,L3,L4;
JTextField tf1,tf2,tf3,tf4;
JButton b1;
DigitalConvertor()
{
Container c1=getContentPane();
//FlowLayout f1=new FlowLayout();
 c1.setLayout(null);

 L1=new JLabel("Kg value");
 L2=new JLabel("g value");
  L3=new JLabel("cm value");
   L4=new JLabel("gm value");

 tf1=new JTextField(20);
 tf2=new JTextField(20);
  tf3=new JTextField(20);
   tf4=new JTextField(20);


b1=new JButton("Login");
b1.addActionListener(this);

L1.setBounds(50,150,70,40);
L2.setBounds(50,210,70,40);
L3.setBounds(50,270,70,40);
L4.setBounds(50,330,70,40);
tf1.setBounds(140,150,50,40);
tf2.setBounds(140,210,50,40);
tf3.setBounds(140,270,50,40);
tf4.setBounds(140,330,50,40);
b1.setBounds(100,390,150,40);


c1.add(L1);
c1.add(L2);
c1.add(L3);
c1.add(L4);
c1.add(tf1);
c1.add(tf2);
c1.add(tf3);
c1.add(tf4);
c1.add(b1);
}
public void actionPerformed(ActionEvent ae)
{
 int n= Integer.parseInt(tf1.getText());
 tf2.setText("" +(n*0.01));
 int n1= Integer.parseInt(tf3.getText());
 tf4.setText("" +(n1*0.394));
 


}
public static void main(String args[])
{
 DigitalConvertor jtfd=new  DigitalConvertor();
jtfd.setVisible(true);
jtfd.setTitle("JTextField Demo");
jtfd.setSize(500,500);
jtfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
