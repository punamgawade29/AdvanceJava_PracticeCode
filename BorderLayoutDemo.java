import java.awt.*;

class BorderLayoutDemo extends Frame  

{
	
	 BorderLayoutDemo()
	{
	
		 BorderLayout bd1=new  BorderLayout(10,10);
		 setLayout(bd1);
		
		 setBackground(Color.cyan);
		
		Button b1=new Button ("EAST");
		
		Button b2=new Button ("WEST");
		
		Button b3=new Button ("SOUTH");
		
		Button b4=new Button ("NORTH");
		
		TextArea ta1=new TextArea("BorderLayout Maneger");
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(ta1,BorderLayout.CENTER);
	
	}
		
public static void main(String args[])
{
	
 BorderLayoutDemo bl1= new  BorderLayoutDemo();
bl1.setVisible(true);
bl1.setTitle(" BorderLayout");
bl1.setSize(550,550);

	
}
}