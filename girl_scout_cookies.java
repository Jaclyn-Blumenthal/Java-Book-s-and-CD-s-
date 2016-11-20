//Jaclyn Blumenthal
//<HTML><HEAD></HEAD><BODY>
//<APPLET CODE="girl_scout_cookies.class" WIDTH=”250” HEIGHT=”100”></APPLET>// Dimensions of Applet
//</BODY></HTML>
import java.awt.*;//* means full package
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
public class girl_scout_cookies extends JApplet implements ActionListener{
JLabel titlelab = new JLabel("Girl Scout Cookies");//title:“Girl Scout Cookies”
Font titlefont = new Font("TimesRoman", Font.BOLD, 30);//font of title
JLabel numlab = new JLabel("Number of cookies");//1st label= #of cookies            
JTextField numfield = new JTextField(5);//there r 5 textfields
JButton submit = new JButton("Submit");//submit button
JLabel cookie = new JLabel("       ");// = D (empty box)
JPanel pan1 = new JPanel();
BorderLayout bord = new BorderLayout();
GridLayout grid = new GridLayout(2, 2);// (mxn) = the 2 x 2 box
Container c;
public void init(){
c = getContentPane();
c.setLayout(bord);
c.setBackground(Color.cyan); //background boarder cyan
titlelab.setForeground(Color.blue); //title words blue
titlelab.setFont(titlefont);//font of title
titlelab.setHorizontalAlignment(JLabel.CENTER);//Title center
c.add(titlelab, bord.NORTH);//title in the North
pan1.setLayout(grid); //layout of squares
pan1.setBackground(Color.red);//background color red box 1
numlab.setForeground(Color.green);//words in 1st box are green
pan1.add(numlab);//add words
numfield.setForeground(Color.green);//words 2nd box green(top right)
pan1.add(numfield);
submit.setForeground(Color.green);//submit 3rd box letter green(bottom left)     
pan1.add(submit);//add submit button
c.add(pan1, bord.CENTER);//submit center of 3rd box
cookie.setForeground(Color.red);//the letters in output
c.add(cookie, bord.SOUTH);//south part of boarder
numfield.requestFocus();// = B
numfield.addActionListener(this);// = C
submit.addActionListener(this);}// = C
public void actionPerformed(ActionEvent e){
NumberFormat curr = NumberFormat.getCurrencyInstance(); 
int num; //number
double price; 
String sprice, scookie;
num = Integer.parseInt(numfield.getText());//# inserted by user
price = num * 3.0;// Price of cookies = # of cookies x 3
sprice = curr.format(price); 
scookie = "Your total comes to " + sprice; //output in boarder
cookie.setText(scookie);}}// = D
