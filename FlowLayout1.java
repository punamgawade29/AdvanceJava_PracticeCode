
import java.awt.*;

class FlowLayout1 extends Frame
{
	FlowLayout1()
	{
		Frame f=new Frame();
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		
		
		
		FlowLayout f1=new FlowLayout();
		p1.setLayout(f1);
		p2.setLayout(f1);
		
		
		BorderLayout bd1=new BorderLayout();
		p1.setLayout(bd1);
		p2.setLayout(bd1);
		
		
		Label L2=new Label("Frame Window");
		Button b2=new Button("sumbit");
		Button b3=new Button("East");
		
		
		
		 f.add(p1);
		 f.add(p2);
		 p1.add(L2);
	
		  p1.add(b2);
		  p2.add(b3);
		  
		  add(b3,BorderLayout.EAST);
		
		  f.setSize(700,700);
		  f.setTitle("panel ");
		  f.setVisible(true);
		
		
}

		public static void main (String args[])
		{
			FlowLayout1 m1=new FlowLayout1();
			
		}
}
			