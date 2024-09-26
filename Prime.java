import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i=2;
        int num=1;
       while(count<=n){
        if(num==2){
            System.out.println(num);
            count++;
        }
        if(num%i==0){
            System.out.println(num);
            count++;
        }
        num++;
        i++;
       }
        
    }
}
