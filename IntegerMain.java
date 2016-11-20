//And here is the functional code:
 //Here is some output I got while testing:
  //main.java:

 import java.util.Scanner;  //import scanner
 import java.util.LinkedList; //import linkedlist
 import java.util.ListIterator; //import listiterator
 import java.util.Random; //import package that allows random numbers
 import java.util.Collections; //import collection of values

public class IntegerMain
{
       
     public static void main(String[] args) 
     {
        LinkedList<integer> list=new LinkedList<integer>(); //Linkedlist is a linkedlist of integers
        Scanner in= new Scanner(System.in); //scanner 
        System.out.print("Enter the number of object: to store in the linked list: "); //Asks user to enter the number of objects
        int n= in.nextInt(); //
        Random random_gen= new Random(); //generate random numbers
        int random;
        //creates the random numbers and add them to the list
        for(int i=0;i<n;i++){  
            random=random_gen.nextInt(149)+1; //149 + 1 is the bound on the random number to be returned. Must be positive.
            list.add(new integer(random,i));
        }
        
        Collections.sort(list); //sort the list
       
        ListIterator<integer> iterator= list.listIterator();  //creates the iterator
        integer z; 
        int count=0; //count
        System.out.println("Index   Order   Random Number");
        do
        {
            //gets the element from the list, and print its values
            z=iterator.next();
            System.out.printf("%3d",count);
            System.out.printf("%8d",z.get_order());
            System.out.printf("%13d\n",z.get_number());
   
            count++;          
        }
        while(iterator.hasNext()); //iterator

       int min=151; //parameter for random number 
        int max=0; //1st index starts at 0
        int sum=0; //sum
        float mean; // mean (average of the random numbers)
        random=random_gen.nextInt(list.size()); 
        integer randy=list.get(random);
        iterator= list.listIterator();
        do
        {
            //we get the element from the list, and calculate its values
            z=iterator.next();  //z = the next integer on the list
            sum=sum+z.get_number();  //add next integer to the sum
            if(max<z.get_number())
                max=z.get_number();
            if(min>z.get_number())
                min=z.get_number();
        }
        while(iterator.hasNext()); //next part of the iterator
        System.out.printf("Sum="+sum); //prints out the sum value
        mean=(float)sum/list.size(); //equation used to find the mean
        System.out.printf(" Mean="+mean); //print the mean
        System.out.printf(" Range="+(max-min)); // equation to find the range
        int med; //median
        if(list.size()%2==0){ //if the list size is even
            med=list.size()/2 -1; //find the median from the size of lisr/(2-1)
        }
        else
        {
            med=list.size()/2;  //how to find median if lis5 size is odd
        }
        System.out.printf(" Median="+list.get(med).get_number());  //prints the median
       
        //printing random node, index, order and random number 
        System.out.printf(" Random Node:");
        System.out.printf(" Index="+random);
        System.out.println(" Order= "+randy.get_order());
        System.out.println("Random Number= "+randy.get_number());
       
     }
 }
