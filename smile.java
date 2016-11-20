//This program will make a smilely face
//jaclyn blumenthal
//ciss 111
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class smile extends JApplet implements ActionListener
  
{
  JButton smilebutton = new JButton("Change Expressions");
  boolean smile = true;
  Container c;
  
  public void init()
    {
    setSize(200,200);
    c = getContentPane();
    c.setLayout(new FlowLayout());
    c.setBackground(Color.blue);
    smilebutton.setForeground(Color.cyan);
    c.add(smilebutton);
    smilebutton.addActionListener(this);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
    smile = !smile;
    repaint();
  }
  
  public void paint (Graphics g)
  {
    super.paint(g);
    g.setColor(Color.yellow);
    g.fillOval(50, 50, 100, 100);
    g.setColor(Color.black);
    g.fillOval(85, 80, 10, 20);
    g.fillOval(105, 80, 10, 20);
    if (smile)
      g.drawArc(70, 70, 60, 60, 200, 140);
    else
      g.drawArc(70, 110, 60, 60, 160, -140);
  }}
     
      
      
      
      
      
      