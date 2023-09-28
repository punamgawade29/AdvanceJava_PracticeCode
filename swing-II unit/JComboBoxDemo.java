 import javax.swing.*;
import java.awt.*;
class JComboBoxDemo extends JFrame
{
JComboBoxDemo()
{
Container c=getContentPane();
FlowLayout f1=new FlowLayout();
c.setLayout(f1);
c.setBackground(Color.gray);

JComboBox jcb=new JComboBox();
jcb.addItem("C Lang");
jcb.addItem("C++ Lang");
jcb.addItem("Java Lang");
jcb.addItem("Python Lang");
jcb.addItem("PHP Lang");

c.add(jcb);
}
public static void main(String args[])
{
JComboBoxDemo j1=new JComboBoxDemo();
j1.setVisible(true);
j1.setTitle("JComboBox Demo");
j1.setSize(800,800);
j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
