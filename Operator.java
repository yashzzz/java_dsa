import java.util.*;
public class Operator {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter two number to perform operations");
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("the sum of two number is =" + (a+b));
     System.out.println("the diffrence of two number is =" + (a-b));
     System.out.println("the multiplication of two number is =" + (a*b));
     System.out.println("the division of two number is =" + (a/b));
     System.out.println("the modulas of two number is =" + (a%b));
    }
}
