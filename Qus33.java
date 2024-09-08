import java.util.Scanner;
public class Qus33 {
    public static void arms(int x){
        int dup = x;
        int sum = 0;
        while(x>0){
            int ld = x % 10;
            sum = sum + (ld*ld*ld);
            x = x / 10;
        }
        if(sum == dup){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println( x + "number is not an amrstrong" );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        arms(num);
        
    }
}
