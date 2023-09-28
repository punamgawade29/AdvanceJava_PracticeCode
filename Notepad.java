import java.awt.*;

class Notepad extends Frame  

{
	Notepad()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		setBackground(Color.cyan);
		
		MenuBar mbr=new MenuBar();
		Menu m1=new Menu("File");
		
		MenuItem m11=new MenuItem("New");
		MenuItem m12=new MenuItem("Open");
		MenuItem m13=new MenuItem("Save");
		MenuItem m14=new MenuItem("save as");
		
		
		Menu m2=new Menu("Edit");
		
		
		MenuItem m21=new MenuItem("cut");
		MenuItem m22=new MenuItem("copy");
		MenuItem m23=new MenuItem("Paste");
		MenuItem m24=new MenuItem("Delete");
		
		
		Menu m3=new Menu("Format");
		
		
		MenuItem m31=new MenuItem("Word wrap");
		MenuItem m32=new MenuItem("Font");
		
		
		
		
		Menu m4=new Menu("View");
		
		CheckboxMenuItem m41=new CheckboxMenuItem("status Bar");
		
		
		Menu m5=new Menu("Help");
		
		MenuItem m51=new MenuItem("View help");
		MenuItem m52=new MenuItem("Send Feedback");
		MenuItem m53=new MenuItem("About Notepad");
		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m3.add(m31);
		m3.add(m32);
		m4.add(m41);
		m5.add(m51);
		m5.add(m52);
		m5.add(m53);
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		mbr.add(m5);
		
		setMenuBar(mbr);	
		
	
	}
	
public static void main(String args[])
{
	Notepad n1= new Notepad ();
	n1.setVisible(true);
	n1.setTitle("Notepad");
	n1.setSize(400,400);
}
}