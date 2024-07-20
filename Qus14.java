import java.util.*;
public class Qus14 {
    public static void bin(int num)
    {   int bin =0;
        int pow=0;
       
        while(num>0)
        {
            int rem = num % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            num = num/2;  
        }
        System.out.println("binary digit is " + bin);
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number ");
        int mynum = sc.nextInt();
        bin(mynum);
       
    }
    
}
