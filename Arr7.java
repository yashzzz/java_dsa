import java.util.*;
public class Arr7 {
    public static void reverse(int number[]){
        int start=0 , end = number.length-1;
       
        while(start<end){
            int temp = number[end];
            number[end] = number [start];
            number[start]=temp;
            start++;
            end--; 
        }
    }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number[]=new int[4];
    System.out.println("enter the value of array");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("enter the value of = " + i);
         number[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            System.out.println(number[i] + " ");

        }
        reverse(number);
        for(int i =0;i<n;i++){
            System.out.print( number[i] );
        }System.out.println();
    }    
}
