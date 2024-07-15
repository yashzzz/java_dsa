import java.util.*;
public class Conditionoftwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number= ");
        int a = sc.nextInt();
        System.out.print("enter the second number= ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("first number is greater");
        }
        else{
            System.out.println("second number is greater");
        }
    }
    
}
