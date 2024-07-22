import java.util.*;
public class Qus21 {

    public static void pyramid(int x ){
        for (int i=1; i<=x; i++){
            for(int j=1; j<=x-i+1;j++){
                System.out.print(j);
            }
            for(int j=1; j<=i-1; j++){
               
                System.out.print(" ");
            }
        
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        pyramid(n);

    }
    
}
