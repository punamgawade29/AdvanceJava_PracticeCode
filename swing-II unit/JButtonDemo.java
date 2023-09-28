import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButtonDemo extends JFrame implements ActionListener
{
JButton b1,b2;
JLabel L1;
JButtonDemo()
{
Container c=getContentPane();
FlowLayout f1=new FlowLayout();
c.setLayout(f1);
c.setBackground(Color.cyan);
b1=new JButton("15 August");
ImageIcon ii=new ImageIcon("flowers.jpg");
b2=new JButton(ii);
L1=new JLabel("                                                                                                                    ");
L1.setForeground(Color.red);
b1.addActionListener(this);
c.add(b1);
c.add(L1);
c.add(b2);
}
public void actionPerformed(ActionEvent ae)
{
L1.setText("Happy Independence Day!!!");
}
public static void main(String args[])
{
	JButtonDemo jb1=new JButtonDemo();
	jb1.setVisible(true);
	jb1.setTitle("image");
	jb1.setSize(600,600);
}
}



