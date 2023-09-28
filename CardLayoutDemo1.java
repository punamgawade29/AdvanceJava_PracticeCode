import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutDemo1 extends JFrame  implements ActionListener

{
	Container c;
	CardLayout card;
	
	 CardLayoutDemo1()
	{

		 c= getContentPane();
        card=new CardLayout();
		 c.setLayout(card);
		setBackground(Color.cyan);
		JButton b1=new JButton (" BRANCH");
		JButton b2=new JButton ("INFORMATION TECHNOLOGY ");
		JButton b3=new JButton (" COMPUTER SCIENCE");
		JButton b4=new JButton ("ELECTRICAL");	
		b1.setBackground(Color.pink);
		b2.setBackground(Color.YELLOW);
		b3.setBackground(Color.cyan);
		b4.setBackground(Color.green);
		b1.setForeground(Color.red);
		b1.setForeground(Color.black);
		b1.setForeground(Color.green);
		b1.setForeground(Color.magenta);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		c.add(b1,"a");
		c.add(b2,"b");
		c.add(b3,"c");
	    c.add(b4,"d");
			
	         }
                    	public void actionPerformed(ActionEvent ae)
	        {
	                  card.next(c);
	        }
                          public static void main(String args[])
                      {
                          CardLayoutDemo1 cld= new  CardLayoutDemo1();
                          cld.setVisible(true);
                       cld.setTitle("CardLayout");
                       cld.setSize(550,550);
                   }
              

	
}
