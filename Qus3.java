import java.util.*;
public class Qus3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number");
        int n = sc.nextInt();
        int even=0;
        int odd =0;
        for(int i=1; i<=n;i++){
            if(i%2==0){
                even=even+i;
               // System.out.println(even);
            }
            else {
                odd=odd+i;
               // System.out.println(odd);
             }  
        }
        System.out.println(even);
        System.out.println(odd);
    }
    
}
