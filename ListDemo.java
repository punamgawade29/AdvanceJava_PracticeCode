
import java .awt.*;


class ListDemo extends Frame
{
ListDemo()
{
FlowLayout f1=new FlowLayout();
setLayout(f1);

List L1=new List(3);
L1.add("C Lang");
L1.add("C++ Lang");
L1.add("Java Lang");
L1.add("JavaScript Lang");
L1.add("Python Lang");
L1.add("Cobol Lang");

List L2=new List(3,true);
L2.add("Pune");
L2.add("Awasari");
L2.add("Mumbai");
L2.add("Nagar");
L2.add("Solapur");
L2.add("Tuljapur");

add(L1);
add(L2);

}
public static void main(String args[])
{
ListDemo ld=new ListDemo();
ld.setVisible(true);
ld.setTitle("List Control");
ld.setSize(500,500);
}
}

