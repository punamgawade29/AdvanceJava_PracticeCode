import javax.swing.*;
import java.awt.*;
class JTextAreaDemo extends JFrame
{
JTextAreaDemo()
{
Container c=getContentPane();
FlowLayout f1=new FlowLayout();
c.setLayout(f1);
c.setBackground(Color.green);

JTextArea ta1=new JTextArea("Enter comments here",10,20);
JTextArea ta2=new JTextArea(10,30);

c.add(ta1);
c.add(ta2);
}
public static void main(String args[])
{
JTextAreaDemo j1=new JTextAreaDemo();
j1.setVisible(true);
j1.setTitle("JTextArea Demo");
j1.setSize(800,800);
j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


