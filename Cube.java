public class Cube {  
  // variables
   private double length;  
   private String color;
   private boolean fill;
   private double area;
   private double volume;
  
  
   public Cube()  // method for default cube for if no change 
   {
       length = 1;
       color = "Black";
       fill = false;
       setArea();
       setVoulme();
   }
  
   private void setArea() //method to set set the area
   {
       area = Math.pow(length, 2.0) * 6;   //get tne area using the Math.pow package
   }
  
   private void setVoulme()  //method to set the volume
   {
       volume = Math.pow(length, 3);  //you set the area using the MAth.pow package
   }

   public double getLength()  //Method to get the length of the cube
   {
       return length;  //returns the length
   }

   public void setLength(double length) 
   {
       this.length = length;
       setArea();
       setVoulme();
   }

   public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public boolean isFill() {
       return fill;
   }

   public void setFill(boolean fill) {
       this.fill = fill;
   }

   public double getArea() {
       return area;
   }

   public double getVolume() {
       return volume;
   }
  
}