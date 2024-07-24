import java.util.*;
public class Qus30 {
    public static void pattern(int x){
        for(int i=1; i<=x;i++){
            for(int j=1;j<=x-i+1;j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            for(int j=1;j<=x-i+1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        pattern(n);
    }
    
}
