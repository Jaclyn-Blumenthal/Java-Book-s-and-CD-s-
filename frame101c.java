import java.awt.*;
import javax.swing.*;
public class frame101c extends JFrame
{
 
   JLabel quote = new JLabel("Hello World!");
   Font ravie = new Font("Ravie", Font.BOLD, 24);
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public frame101c()
  {
    super("Quote Frame");
  c = getContentPane();
  c.setLayout(flow);
  c.setBackground(Color.cyan);
  quote.setForeground(Color.blue);
  quote.setFont(ravie);
  c.add(quote);
  setTitle("Quote Frame Title");
  setSize(400, 400);
  setResizable(false);
  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  setVisible(true);
  
 }
public static void main(String[] args)

{
  frame101c f = new frame101c();
}}