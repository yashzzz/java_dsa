import java.util.*;
public class Arr10  {
    public static void max_sum(int number[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                curr=0;
                for(int k=i;k<=j;k++){
                    curr=curr+number[k];
                    System.out.println("sum is" + curr );
                    
                }
                if(max<curr){
                    max=curr;
                }
            }System.out.println();
        }
        System.out.println("max sum is " + max);
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
    max_sum(number);
}

    
}
