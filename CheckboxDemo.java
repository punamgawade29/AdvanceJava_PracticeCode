import java.awt.*;
class CheckboxDemo extends Frame
{
		Font f;
		CheckboxDemo()
		
{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		setBackground(Color.cyan);
		
		Font f=new Font("Arial Black",Font.BOLD,15);
		
		Label l1=new Label(" WORLD OF CHECKBOX");
		
		l1.setFont(f);
		
		
		Checkbox c1=new Checkbox("India",true);
		Checkbox c2=new Checkbox("pune",true);
		Checkbox c3=new Checkbox("awasari",true);
		
		add(c1);
		add(c2);
		add(c3);
		
		add(l1);
		


}
		
			public static void main(String args[])
			
			{
			CheckboxDemo cb1 =new CheckboxDemo();
				cb1.setVisible(true);
				cb1.setTitle("CheckboxDemo");
				cb1.setSize(700,700);
				
			}
			
}
				