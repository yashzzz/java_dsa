import java.util.Scanner;

public class Arr6 {
    public static int search(int number[], int key){
        int start =0;
        int end= number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<key){
             start=mid+1;
            }
            else{
             end=mid-1;
            }
        }
        return -1;
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

          System.out.println("enter the value of element that you want to find");
          int key = sc.nextInt();
          System.out.println("the element is present at index " + search(number, key));
    }
}

