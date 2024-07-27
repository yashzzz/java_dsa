import java.util.*;
public class Arr8 {
    public static void pair(int number[]){
        for(int i=0;i<number.length;i++){
            int current = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + current + "," + number[j] + ")"  );

            }
            System.out.println();
        }
       
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of array");
    int n = sc.nextInt();
    int number[] = new int[n];
    for (int i=0;i<n;i++){
        System.out.println("enter the value of " + i);
        number[i]= sc.nextInt();
       
    }
    pair(number);
  }    
}
