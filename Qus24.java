import java.util.*;
public class Qus24 {
    public static void butterfly_pattern(int x){
      //for first half
      for(int i=1;i<=x;i++){
        //for first star
        for(int j=1; j<=i; j++){
            System.err.print("*" + " ");
        }
        //for middle spaces
        for( int j=1;j<=2*(x-i);j++){
            System.out.print(" "+ " ");
        }
        //for second star patter
        for(int j=1; j<=i; j++){
            System.out.print("*" + " ");
        }
        System.out.println();
      } 
   
     // for second half
     for(int i=x; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.err.print("*" + " ");
            }
            //for middle spaces
            for( int j=1;j<=2*(x-i);j++){
                System.out.print(" " + " ");
            }
            //for second star patter
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
          } 
        }       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number for pattern");
        int n = sc.nextInt();
        butterfly_pattern(n);
    }
    
}
