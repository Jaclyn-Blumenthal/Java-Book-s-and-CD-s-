/* Katelyn Pingelski
Exercise 9-2 main class
This program will use a hotel room and suite
*/
public class ex92c 
{
 public static void main(String[] args)
   
 {
  hotelroom92 h = new hotelroom92(375); 
  suite92 s = new suite92(475);

  System.out.println("The Hotel Room is " + h.getroomnum() + " and Cost " +
       h.getroomrate());
  
  System.out.println("The Suite Room is " + s.getroomnum() + " and Cost " + s.getroomrate());

       
 }
}
