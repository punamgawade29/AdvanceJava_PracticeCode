import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener

{
	ButtonDemo()

	{
		
	
		CardLayout card = new CardLayout();
		setLayout (card("new Button()");
		setBackground(Color.red);
		
	//	label L1=new label("vjtech");
		
		Button b1=new Button("India");
		Button b2=new Button("Awasari");
		Button b3=new Button("Lundon");
		
		
		b1.setBackground(Color.yellow);
		b1.setBackground(Color.green);
		b3.setBackground(Color.pink);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
	}
		public void actionPerformed(ActionEvent ae)
		{
			card.getText("new Button()");
		}
public static void main(String args[])
{
	ButtonDemo bd1= new ButtonDemo ();
	bd1.setVisible(true);
	bd1.setTitle("ButtonDemo");
	bd1.setSize(500,500);
}
}