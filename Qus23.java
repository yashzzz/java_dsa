import java.util.*;
public class Qus23 {
    public static void triangle(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number ");
    int n = sc.nextInt();
    triangle(n);
    }
}
