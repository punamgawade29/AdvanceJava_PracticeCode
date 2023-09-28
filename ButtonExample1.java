
import javax.swing.*;    
 class ButtonExample1 extends Frame
{  
Container c;
ButtonExample1()
 { 
 c=getContentPane();
 FlowLayout f1=new FlowLayout(); 
 c.setLayout(f1);
    JFrame f=new JFrame("Button Example");  
    JButton b1=new JButton("Click Here");  
	JButton b2=new JButton("Click Here");  
	JButton b3=new JButton("Click Here");  
	JButton b4=new JButton("Click Here");  
   /* b1.setBounds(50,100,95,30); 
 b2.setBounds(100,100,95,30); 
 b3.setBounds(150,100,95,30); 
 b4.setBounds(190,100,95,30);  */
    c.add(b1); 
c.add(b2);  
c.add(b3);  
 c.add(b4); 
 }
public static void main(String[] args) {
	
	ButtonExample1 bb1=new ButtonExample1();
    bb1.setSize(400,400);  
  
    bb1.setVisible(true);   
}  
}  