import java.awt.*;
 import javax.swing.*;
 /* 
 <applet code="JTableDemo" width=400 height=200> </applet> 
 */ 
 public class JTableDemo extends JApplet
 {
 
 public void init() 
 {
 Container contentPane = getContentPane(); 
 contentPane.setLayout(new BorderLayout()); 
 final Object[][] data = { { "Ramesh", "111", "50000"},{ "Sagar", "222", "52000" }, { "Virag", "333", "40000" },{"Amit", "444", "62000" }, { "Anil", "555", "60000" }} ;
JTable table = new JTable(data); 
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp = new JScrollPane(table, v, h); 
contentPane.add(jsp,BorderLayout.CENTER); 
}
 }