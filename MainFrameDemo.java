import java.awt.*;

class PanelDemo extends Panel
{
	PanelDemo()
	
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		Label L1=new Label("Panel Window");
		Button b1=new Button("click");
		
		add(L1);
		add(b1);
	
	}
}
class MainFrameDemo extends Frame
{
	MainFrameDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		Label L2=new Label("Frame Window");
		Button b2=new Button("sumbit");
		
		add(L2);
		add(b2);
		
		PanelDemo p1=new PanelDemo();
		add(p1);
}

		public static void main (String args[])
		{
			MainFrameDemo m1=new MainFrameDemo();
			m1.setSize(700,700);
		    m1.setTitle("panel ");
		    m1.setVisible(true);
		}
}
			
		
		
	