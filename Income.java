import java.util.*;
public class Income {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your income");
      float a = sc.nextFloat();
      if(a < 500000){
        System.out.println("tax on  your income is zero");
      }
      else if(a > 500000 && a < 1000000){
          float tax = (float)(0.2*a);
        System.out.println("tax on income is =" + tax);
      }
      else{
        float tax = (float)(a*0.3);
        System.err.println("tax on your income is = " + tax);
      }
    }
    
}
