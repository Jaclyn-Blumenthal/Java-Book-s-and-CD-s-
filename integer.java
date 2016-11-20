// functional code:


public class integer implements Comparable<integer>
{
       
    int number; //number is an integer
    int order; //the order is an integer

    public integer(int n,int o) 
    {
        number=n; 
        order=o;
     }
   
     public int get_number() //get method for the number
     {
        return number; //returns number value
     }

    public int get_order() //get method for the order
    {
        return order; //returns order
     }
   
     //the function that compares 2 integers, based on their numbers
    public int compareTo(integer a){
        if(a.number==this.number){
            return 0;
        }else{
            if(this.number>a.number){
                return 1;
            }else{
                return -1;
            }
        }
    }
 }











 















































