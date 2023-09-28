import java.awt.*;

class Notepad2 extends Frame  

{
	Notepad2()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		setBackground(Color.cyan);
		
		MenuBar mbr=new MenuBar();
		Menu m1=new Menu("Red");
		
		MenuItem m11=new MenuItem("Dark Red");
		MenuItem m12=new MenuItem("Light Red");
		
		
		
		Menu m2=new Menu("Blue");
		
		
		MenuItem m21=new MenuItem("Dark Blue");
		MenuItem m22=new MenuItem("Light Blue");
		
		
		
		Menu m3=new Menu("Yellow");
		
		
		MenuItem m31=new MenuItem("Dark Yellow");
		MenuItem m32=new MenuItem("Light Yellow");
		
		
		Menu m5=new Menu("Black");
		
		MenuItem m51=new MenuItem("Dark Black");
		MenuItem m52=new MenuItem("Light Black");
	
		
		m1.add(m11);
		m1.add(m12);
		
		m2.add(m21);
		m2.add(m22);
		
		m3.add(m31);
		m3.add(m32);
		
		m5.add(m51);
		m5.add(m52);

		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		
		mbr.add(m5);
		
		setMenuBar(mbr);	
		
	
	}
	
public static void main(String args[])
{
	Notepad2 n1= new Notepad2 ();
	n1.setVisible(true);
	n1.setTitle("Notepad");
	n1.setSize(400,400);
}
}