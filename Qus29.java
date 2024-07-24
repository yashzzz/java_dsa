import java.util.*;
public class Qus29 {
    public static void palin(int x){
        for(int i =1; i<=x; i++){
            //for first spaces
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            // for numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();    
        palin(n);
    }
}
