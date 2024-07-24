import java.util.*;
public class Arr2 {
    public static int sort(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            }
            return -1;
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of array you want to store");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of="+arr[i]);

            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
   
    System.out.println("enter the value you want to find from array");
    int key = sc.nextInt();
    int index=sort(arr,key);
    if(key==index){
        System.out.println("value is found on array index at " + index);
    }
    else{
        System.out.println("value is not present in array");
    }
}

    
}

