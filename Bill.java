import java.util.*; 
public class Bill {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the cost of pencil");
         float a  = sc.nextFloat();
         System.out.println("enter the cost of pen");
         float b  = sc.nextFloat();
         System.out.println("enter the cost of eraser");
         float c = sc.nextFloat();
          //sum of items
         float sum = a+b+c; 
         System.out.println("the total bill of user without gst:" + sum );
         //gst apply on items
         float gst = 0.18f * sum; 
         System.out.println("total gst amount apply on the bill is :" + gst);
          // total bill including gst        
         float total = gst+sum; 
         System.out.println("toatl bill including gst is given by:" + total);
    }
}
