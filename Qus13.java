import java.util.*;
public class Qus13 {
    public static void bin(int num)
    {   int dec=0;
        int pow=0;
       
        while(num>0)
        {
            int ld = num % 10;
            dec = dec + (ld * (int)Math.pow(2,pow));
            pow++;
            num = num/10;  
        }
        System.out.println("decimal digit is " + dec);
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number ");
        int mynum = sc.nextInt();
        bin(mynum);
       
    }
    
}
