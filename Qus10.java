import java.util.*;
public class Qus10 
{ 
    public static int prod(int x,int y)
    {
        int result = x*y;
        return result;
    }
 public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the fisrt number");
      int a =sc.nextInt();
      System.out.println("enter the second number");
      int b =sc.nextInt();
      int result = prod(a,b);
      System.out.println("product is = " + result);
    }   
}
