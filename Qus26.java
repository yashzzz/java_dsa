import java.util.*;
public class Qus26 {
    public static void hollow(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=(x-i);j++){
                System.out.print(" " + " ");
            }
            for(int j =1; j<=x; j++){
                if(i==1 || i==x|| j==1 || j==x){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }System.out.println();
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number");
        int n = sc.nextInt();
        hollow(n);
    }
    
}
