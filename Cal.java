import java.util.*;
public class Cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the operation to perform");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);   
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '%':System.out.println(a%b);    
            default:
            System.out.println("error");
                break;
        }
    }
    
}
