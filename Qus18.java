import java.util.*;
public class Qus18 {
    public static void sum(int x){
        int sum = 0;
        while(x!=0){
            int ld = x % 10;
            sum = sum +ld;
            x = x / 10;
        }
        System.out.println("sum of digit os given number is " + sum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sum(num);
    }
    
}
