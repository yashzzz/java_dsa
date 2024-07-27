import java.util.Scanner;

public class Arr9 {
    public static void pairs(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+ " ");
                }System.out.println();
            }System.out.println();
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
    pairs(number);
}
}