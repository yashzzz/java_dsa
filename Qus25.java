import java.util.*;
public class Qus25 {
    public static void rhombus(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=x; j++){
                System.out.print("*" + " ");
            }
        System.out.println();  
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        rhombus(n);
    }
    
}
