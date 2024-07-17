import java.util.*;
public class Prme {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number");
        int n = sc.nextInt();
        if( n==2){
            System.out.println("number is prime");
        }
        else{
            boolean Prime = true;
            for(int i=2; i<=n-1; i++){
                if( n % i== 0){
                    Prime = false;
                }   
            }
            if (Prime == true){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }
    }   
    
}
