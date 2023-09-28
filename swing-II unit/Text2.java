import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class Text2 extends JFrame implements ActionListener 
	// JTextField 
	{
	
	Container c;
	JTextField t;
	JPasswordField pass;
	JButton b; 
	JLabel l;
	Text2()
	{
		FlowLayout f2=new FlowLayout();
		c.setLayout(f2);
		c=getContentPane();
		JPanel p = new JPanel(); 
		c.add(p);
		
		l = new JLabel("nothing entered"); 
		b = new JButton("submit"); 
		Text1 te = new Text1(); 
		b.addActionListener(te); 
		t = new JTextField("enter name", 16); 
		pass = new JPasswordField(16); 
		Font fo = new Font("Serif", Font.ITALIC, 20); 
		t.setFont(fo); 
		//JPanel p = new JPanel(); 
		p.add(t); 
		p.add(pass); 
		p.add(b); 
		p.add(l); 
	//	f.add(p); 

		
		
		
	}
	public void actionPerformed(ActionEvent ae)
		
	
		
		
	{ 
		String s = ae.getActionCommand(); 
		if (s.equals("submit")) 
		{ 
			// set the text of the label to the text of the field 
			l.setText("name = " + t.getText() + "\t Password = " + pass.getText()); 

			// set the text of field to blank 
			t.setText(" "); 

			// set the text of password field to blank 
			pass.setText(""); 
		} 
	}
		
		public static void main(String args[])
	{
		Text2 d=new Text2();
		d.setVisible(true);
		d.setTitle("Login demo");
		d.setSize(1000,600);
		
	
	}
	}
	
	
	
