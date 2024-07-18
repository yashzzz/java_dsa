import java.util.*;
public class Qus4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find factorial=");
        int n = sc.nextInt();
        double factor = 1;
        for(int i=1;i<=n;i++){
            factor *= i;
        }
        System.out.println("the factorial of given number is = " + factor);
    }
    
}
