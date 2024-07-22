import java.util.*;
public class Qus22 {
    public static void pyramid(int x){
        int count = 1;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.err.println();
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row in floyad pyramid");
        int n = sc.nextInt();
        pyramid(n);
    }
    
}
