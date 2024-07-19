import java.util.*;
public class Qus11 
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
        System.out.println("enter a number that you to find factorial");
        int a = sc.nextInt();
        int fact = factor(a);
        System.out.print("factorial of a number is = " + fact);
    }
    
}
