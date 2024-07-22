import java.util.*;
public class Qus19 {
    public static void hollow(int x , int y)
    {
        for(int i=1; i<=x;i++){
            for(int j=1;j<=y;j++){
                if(i==1 || i==x || j==1 || j==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             }
            System.out.println();
           }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and coloums");
        int a = sc.nextInt();
        int b = sc.nextInt();
        hollow(a,b);
    }
    
}
