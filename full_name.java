//CISS 111 
//Jaclyn Blumenthal

//This program that inputs from the user their full name - first, middle, and last name. Then break them up into 3 StringBuffers.  
//The StringBuffers to print the name as the full name, as last name, comma, first name, and as first name, middle initial, and last name. 

import java.io.*;
import java.util.StringTokenizer;

public class full_name
{
  
  public static void main (String[] args) throws IOException
{
    String name;
    StringTokenizer st;
    StringBuffer first; //could be String
    String middle, last;
    StringBuffer lastfirst = new StringBuffer();
    StringBuffer username = new StringBuffer();
    StringBuffer signiture = new StringBuffer();
    BufferedReader br = new
      BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter first middle last name:  ");
    name = br.readLine();
    
    st = new StringTokenizer(name, "  ");
    first =new StringBuffer(st.nextToken());
    
    //convert string to buffer
      middle = st.nextToken();
    last = st.nextToken();
    signiture =new StringBuffer();
    
    lastfirst.append(last). append(", "). append(first);
    username.append(Character.toLowerCase(first.charAt(0))).append("-").append(last.toLowerCase());
    System.out.println("\nLast First = " + lastfirst.toString());
    //convert stringbuffer to string
    System.out.println("User Name = " + username);
   signiture.append(first).append(" ").append(middle.charAt(0)).append(" ").append(last);
   System.out.println("Signiture = " + signiture);
  }
}
    
