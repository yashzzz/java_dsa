import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you want to reverse ");
        int n = sc.nextInt();
        while( n > 0 ){
           int num = n % 10;
           System.out.print(num + " ");
           n = n / 10;
        }
        System.out.println();
    }
    
}
