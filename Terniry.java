import java.util.*;
public class Terniry{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numner to be cheacked");
        int a = sc.nextInt();
        String c=((a%2)==0)?"even":"odd";
        System.out.println(c);


    }
    
}
