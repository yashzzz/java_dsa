import java.util.*;
public class Qus20 {
    public static void pattern(int x){
        for (int i=1; i<=x; i++){
            for (int j =1;j<=x-i; j++){
                System.err.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and column");
        int a = sc.nextInt();
        pattern(a);
    }
   
    
}
