 import javax.swing.*;
import java.awt.*;
class JComboBoxDemo1 extends JFrame
{
JComboBoxDemo1()
{
Container c=getContentPane();
FlowLayout f1=new FlowLayout();
c.setLayout(f1);
c.setBackground(Color.gray);

JComboBox jcb=new JComboBox();
jcb.addItem("Mumbai");
jcb.addItem("Solapur");
jcb.addItem("Pune");
jcb.addItem("Banglore");
jcb.addItem("Mumbai");

c.add(jcb);
}
public static void main(String args[])
{
JComboBoxDemo1 j1=new JComboBoxDemo1();
j1.setVisible(true);
j1.setTitle("JComboBox Demo");
j1.setSize(300,300);
j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
