//Jaclyn Blumenthal
//exercise 8-2
//this applet will add 2 numbers

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex82 extends JApplet implements ActionListener
{
  JLabel instruct = new JLabel("Enter an integer and click button");
  Font insfont = new Font("Courier", Font.ITALIC, 18);
  JLabel num1lab = new JLabel("Integer #1");
  JLabel num2lab = new JLabel("Integer #2");
  JTextField num1field = new JTextField(7);
   JTextField num2field = new JTextField(7);
  JLabel answerlab = new JLabel("Add the 2 numbers");
  JTextField answerfield = new JTextField(7);
  JButton calc = new JButton("Calculate");
  FlowLayout flow = new FlowLayout();
                                   
Container c;
   public void init()
                                     
                                     {
     setSize(400,150);
                                     
                                     
   
                                     
                                     
 c = getContentPane();                                  
                             
     c.setLayout(flow);
     c.setBackground(Color.cyan);
     instruct.setFont(insfont);
     instruct.setForeground(Color.blue);
     c.add(instruct);
     c.add(num1lab);
     c.add(num2lab);
     num1field.setForeground(Color.blue);
     c.add(num1field);
     c.add(num2field);
     answerlab.setForeground(Color.blue);
   
     c.add(answerlab);
     answerfield.setForeground(Color.blue);
     answerfield.setEditable(false);
     c.add(answerfield);
     calc.setForeground(Color.blue);
                          c.add(calc);
                          num1field.requestFocus();
                        num2field.addActionListener(this);
                        calc.addActionListener(this);
   }
                                   public void actionPerformed(ActionEvent e)
                                   {
                        
     int num1, num2, ans;
                                   num1 = Integer.parseInt(num1field.getText());
                                   num2 = Integer.parseInt(num2field.getText());
                                   ans = num1 + num2;
                                   answerfield.setText(Integer.toString(ans));
                                   }}
  