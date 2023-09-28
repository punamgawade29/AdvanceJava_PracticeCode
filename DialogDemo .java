import java.awt.*;
class DialogDemo extends Frame
{
DialogDemo()
{
Dialog t1=new Dialog(this,"Model Dialog",true);
t1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
t1.add(new Button("Ok"));
t1.add(new Button("Cancel"));
t1.add(new Button("Retry"));
t1.setSize(300,300);
t1.setVisible(true);
}
public static void main(String args[])
{
DialogDemo d1=new DialogDemo();
d1.setVisible(true);
d1.setTitle("Dialog Demo");
d1.setSize(600,600);
}
}
