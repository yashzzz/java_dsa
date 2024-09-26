
        

import java.util.*;
public class Linear6 {
    public static void diamond(int x){
        //for the first half 
        for(int i=1; i<=x; i++){
            //for first spaces
            for(int j=1; j<=x-i; j++){
                System.out.print(" "+" ");
            }
            //for middle star pattern
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }
            //for last spaces
            for(int j=1;j<=x-i;j++){
                System.out.print(" "+" ");
            }
            System.out.println();
            }
        for(int i=x-1; i>=1; i--){

            for(int j=1; j<=x-i; j++){
                System.out.print(" "+" ");
            }
            //for middle star pattern
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }
            //for last spaces
            for(int j=1;j<=x-i;j++){
                System.out.print(" "+" ");
            }
            System.out.println();
        }    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        diamond(n);
    }
    
}
