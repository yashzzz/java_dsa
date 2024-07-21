import java.util.*;
public class Qus17 {
    public static void palindrom(int x){
        int palindrom = x;
        int palin=0;

        while(x!=0){
            int ld = x % 10;
            palin= palin*10+ld;
            x = x/10;
            }
            if (palindrom==palin){
                System.out.println("number is palindrom");
            }
            else{
                System.out.println("number is not palindrom");
            }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number to find palindrom");
        int num = sc.nextInt();
        palindrom(num);
        
               
    }

    
}
