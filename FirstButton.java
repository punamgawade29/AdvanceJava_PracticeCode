import java.awt.*;  
class FirstButton extends Frame
{  
FirstButton()
{  

Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame    
}  
public static void main(String args[]){  
FirstButton f=new FirstButton();  
f.setSize(300,300);//frame size 300 width and 300 height  
f.setLayout(null);//no layout manager  
f.setVisible(true);//now frame will be visible, by default not visible  

}
}  