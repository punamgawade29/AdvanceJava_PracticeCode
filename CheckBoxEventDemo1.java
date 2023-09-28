import java.awt.*;
import java.awt.event.*;


   class CheckBoxEventDemo1 extends Frame implements ItemListener
{
		Checkbox c1,c2,c3,c4;
		Label L1;
		CheckBoxEventDemo1()
		
{
		
		setLayout(null);
		
		setBackground(Color.cyan);
		
		Font f=new Font("Arial Black",Font.BOLD,15);
		setFont(f);
		 c1=new Checkbox("Inguln",false);
		 c2=new Checkbox("pune",false);
		 c3=new Checkbox("awasari",false);
		 c4=new Checkbox("delhi",true);
		
		
		Label L1=new Label(        );
		L1.setForeground(Color.red);
		
		
		c1.setBounds(100,100,150,40);
		c1.setBounds(100,180,150,40);
		c1.setBounds(100,260,150,40);
		c1.setBounds(100,340,150,40);
		L1.setBounds(100,420,300,50);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(L1);
		
		


}
			public void itemStateChanged(ItemEvent ie)
			{
				
				if(c1.getState())
				{
					L1.setText("You have selected"+c1.getLabel());
				}
				else if(c2.getState())
				{
					L1.setText("You have selected"+c2.getLabel());
				}
				
				else if(c3.getState())
				{
					L1.setText("You have selected"+c3.getLabel());
				}
				else if(c4.getState())
					
				{
					L1.setText("You have selected"+c4.getLabel());
				}
			}
		
			
			public static void main(String args[])
			
			{
			CheckBoxEventDemo1 cb1 =new CheckBoxEventDemo1();
				cb1.setVisible(true);
				cb1.setTitle("CheckboxDemo");
				cb1.setSize(500,500);
				
			}
			
			}
			
			
			
			
