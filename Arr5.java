import java.util.*;
public class Arr5 {
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        System.out.println("enter the value of element of array");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the value of index = " + i);
          number[i] =sc.nextInt();
           }
           System.out.println("the largest value in the array is = " + largest(number));
     }
}
