
import java.awt.*;

class PaneleDemo1 extends Frame
{
	PanelDemo1()
	{
		Frame f=new Frame();
		
		Panel p1=new Panel();
		
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		Label L2=new Label("Frame Window");
		Button b2=new Button("sumbit");
		add(f);
		f.add(p1);
		
		p1.add(L2);
		p1.add(b2);
		
		
}

		public static void main (String args[])
		{
			PanelDemo1 m1=new PanelDemo1();
			m1.setSize(700,700);
		    m1.setTitle("panel ");
		    m1.setVisible(true);
		}
}
			