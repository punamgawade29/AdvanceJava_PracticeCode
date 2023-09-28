import java.awt.*;

class FlowLayoutDemo extends Frame  

{
	FlowLayoutDemo()
	{
	
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(f1);
		setBackground(Color.yellow);
		Button b1=new Button("ok");
		Button b2=new Button("Retry");
		Button b3=new Button("Exit");
		Button b4=new Button("Cancle");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
	
	}
	

	
public static void main(String args[])
{
FlowLayoutDemo f2= new FlowLayoutDemo();
f2.setVisible(true);
f2.setTitle("FlowLayout");
f2.setSize(500,500);

	
}
}