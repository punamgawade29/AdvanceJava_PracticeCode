import java.awt.*;

class GridLayoutDemo3 extends Frame  

{
	int i;
	GridLayoutDemo3()
	{
	
		FlowLayout g1=new FlowLayout();
		setLayout(g1);
		
		setBackground(Color.pink);
		
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
         Button b3=new Button("Button 3");
        Button b4=new Button("Button 4");
          Button b5=new Button("Button 5");	
add(b1);
add(b2);add(b3);add(b4);add(b5);

	
	}
		
public static void main(String args[])
{
	
GridLayoutDemo3 g2= new GridLayoutDemo3();
g2.setVisible(true);
g2.setTitle("GridLayout");
g2.setSize(500,500);

	
}
}