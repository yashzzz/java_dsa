import java.util.*;
public class Qus1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        do{
            int n = sc.nextInt();
            if (n%10 ==0){
            break;}
            System.out.println(n);
          }while(true);
    }

    
}
