import java.awt.*;

class CalculatorDemo extends Frame  

{
	int c,n;
	String s1,s2,s3,s4,s5;
	CalculatorDemo()
	{
		Frame f=new Frame();
		Panel p=new Panel();
		
		f.setLayout(new FlowLayout());
		f.setBackground(Color.pink);
		
		Button b1=new Button ("0");
		
		Button b2=new Button ("1");
		
		Button b3=new Button ("2");
		
		Button b4=new Button ("3");
		
	    Button b5=new Button ("4");
		
		Button b6=new Button ("5");
		
		Button b7=new Button ("6");
		
		Button b8=new Button ("7");
		
		Button b9=new Button ("8");
		
		Button b10=new Button ("9");
		
	    Button b11=new Button ("+");
		 
		Button b12=new Button ("-");
		
		Button b13=new Button ("*");
		
		Button b14=new Button ("/");
		
		Button b15=new Button ("%");
		
		Button b16=new Button ("=");
		
		Button b17=new Button ("C");
		
		
		TextField tf1=new TextField (20);
		
		f.add(tf1);
		
		GridLayout g=new GridLayout(5,5,10,20);
		
		p.setLayout(g);
		
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);
		p.add(b16);p.add(b17);
		f.add(p);
		f.setSize(300,300);
		f.setTitle("Calculator");
		f.setVisible(true);
		
	
	
	}
	
public static void main(String args[])
{
CalculatorDemo c1= new CalculatorDemo();
	
}
}