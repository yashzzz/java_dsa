   
import java.util.*;
public class Qus12
{
    public static int factor(int x)
    {
        int result=1;
            for(int i=1; i<=x ; i++)
            {
              result = result * i;
            }
        return result;     
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number that you to binomial cofficient");
        int a = sc.nextInt();
        int num1 = factor(a);
        System.out.println("enter second number that you to binomial cofficient");
        int b = sc.nextInt();
        int num2 = factor(b);
        int num3 = factor(a-b);
        int coff = num1/(num2*num3);       
        System.out.print("binomial cofficient of a number is = " + coff );
    }
    
}

