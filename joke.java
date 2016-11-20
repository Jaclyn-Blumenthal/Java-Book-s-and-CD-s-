//Jaclyn Blumenthal
//Excersice 8-1
//this applet asks a joke that I made up :)


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class joke extends JApplet implements ActionListener
{
  JLabel question = new JLabel("What type of method can you never trust?");
  JButton answer = new JButton("Answer");
  
  
  JLabel results = new JLabel();
  
  JLabel results2 = new JLabel();
  Font resfont = new Font("TimesRoman", Font.BOLD, 26);
  FlowLayout flow = new FlowLayout();
  Container c;
  
  
  public void init()
  { 
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    question.setForeground(Color.blue);
    c.add(question);
    answer.setForeground(Color.blue);
    c.add(answer);
    results.setForeground(Color.blue);
    results.setFont(resfont);
    c.add(results);
    results2.setForeground(Color.blue);
    results2.setFont(resfont);
    c.add(results2);
    answer.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    results.setText("A void method");
    results2.setText("It never returns your things!");
 
 
  }}
    
    
    
    
    