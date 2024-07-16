import java.util.*;
public class Greaterbwthree {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("print first number");
       int a = sc.nextInt();
       System.out.println("print second number");
       int b = sc.nextInt();
       System.out.println("print third number");
       int c = sc.nextInt();
       if( (a>c) && (a>b) ){
        System.out.println("first number is greater");
       }
       else if( (b>a) && (b>c)){
        System.out.println("second number is greater");
       }
       else{
        System.out.println("third number is greater");
       }
    }
    
}
