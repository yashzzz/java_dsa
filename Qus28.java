import java.util.*;
public class Qus28 {
    public static void number_pyramid(int x){
        //for the first half 
        for(int i=1; i<=x; i++){
            //for first spaces
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            //for middle star pattern
            for(int j=1; j<=i;j++){
                System.out.print(i + " ");
               
            }  System.out.println();
              
            }
          
          
            }
           
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
            number_pyramid(n);

        }   
        }
    