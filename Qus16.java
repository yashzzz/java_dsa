import java.util.*;
public class Qus16 {
 
    public static boolean even(int x){
        boolean isEven = false;
       if( x%2==0 )
       {
         isEven = true;

       }
       return isEven;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number that you want to check");
        int n = sc.nextInt();
      
        System.out.println(  even(n));
    }
    
}

