import java.awt.*;

class Calculator extends Frame  

{
	Calculator()
	{
		Frame f=new Frame();
		Pannel p=new Pannel()
		
		f.setLayout(new FlowLayout());
		f.setBackground(Color.cyan);
		
		Button b1=new button("0");
		
		Button b2=new button("1");
		
		Button b3=new button("2");
		
		Button b4=new button("3");
		
	    Button b5=new button("4");
		
		Button b6=new button("5");
		
		Button b7=new button("6");
		
		Button b8=new button("7");
		
		Button b9=new button("8");
		
		Button b10=new button("9");
		
	    Button b11=new button("+");
		 
		Button b12=new button("-");
		
		Button b13=new button("*");
		
		Button b14=new button("/");
		
		Button b15=new button("%");
		
		Button b16=new button("=");
		
		Button b17=new button("C");
		
		
		Textfield tf1=new Textfield (20);
		
		f.add(tf1);
		
		GridLayout g=new GridLayout(4,4,10,20);
		
		p.setlayout(g);
		
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);
		p.add(b16);p.add(b17);
		f.add(p);
		f.setSize(200,200);
		f.setTitle("Calculator");
		f.setVisible(true);
		
	
	
	}
	
public static void main(String args[])
{
Calculator c1= new Calculator ();
	
}
}