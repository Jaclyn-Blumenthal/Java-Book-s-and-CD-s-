
//THIS PROGRAM WILL COUNT VOWELS IN AN ARRAY OF STRINGS

public class compare_names
{ 
  public static void main(String[] args)
  {
    int count = 0, i, j;
    String vowels= "aeiouAEIOU";
    String[] names = {"Jaclyn", "Lauren", "Sarah" , "Taylor", "Matthew"};
    
    for (i=0; i < names.length; i++)
      
      for (j = 0; j < names[i].length(); j++)
      
      if (vowels.indexOf(names[i].charAt(j)) != -1)
      count++;
    
    System.out.println("The number of vowels is " + count);
      
      
  }
}
