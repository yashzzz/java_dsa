import java.util.*;
public class Qus5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find table");
        int n = sc.nextInt();
        for(int i=1; i<=10 ;i++){
            int t = n*i;
            System.out.print("2 x " + i );
            System.out.println(" = " + t );
        }
    }
    
}
