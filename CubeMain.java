import java.util.Scanner; //allows scanner to be used
import java.io.*;
  
 
    public class CubeMain 
    {
   public static void main(String[] args)throws IOException  //string of arguements
   {
       Cube cube = new Cube();  //create a new cube
       Scanner sc = new Scanner(System.in); //allows uset to enter data
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Using buffered reader for color only since it is a string
       System.out.print("Would you like to change this cube: "); //Asks the user if they want to change the cube
       
       String input = sc.next(); //These options below will be asked in consecutive order
       

       double length;
       String color;
       boolean fill;
       if(input.equalsIgnoreCase("yes")) //if user enters yes; doesnt matter if capital or lower case
       {
       System.out.print("Enter the length: "); //input the length
           length = sc.nextDouble();
           cube.setLength(length); //set length
           System.out.print("Enter the color: "); //input color
           color = br.readLine();
           cube.setColor(color);
           System.out.print("Would you like the cube to be filled? "); //true if filled false if empty
           fill = sc.nextBoolean();
           cube.setFill(fill);
       }
       System.out.printf("Length: %.2f\n", cube.getLength()); //Shows the viewer the resulting cube length
       System.out.printf("Color: %s\n", cube.getColor());//Showsw the viewer the resulting cube color
       System.out.println("Fill: " + cube.isFill()); //Shows the viewer the resulting cube filled or empty
       System.out.printf("Area: %.2f\n", cube.getArea()); //output the area of the cube created
       System.out.printf("Volume: %.2f\n", cube.getVolume()); //output the area of the cube created
   }
}