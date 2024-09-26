import java.util.*;
public class Linear3 {
    public static void main(String[] args) {
        int[] num = {1,2,4,6,7,34,56,23,45}; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start range ");
        int start = sc.nextInt();
        System.out.println("enter the end range ");
        int end = sc.nextInt();
        System.out.println("enter the value you have to search");
        int target = sc.nextInt();
        boolean b =  search(num, target , start , end);
        System.out.println(b);

        
    }
    static boolean search(int[] num , int target , int start , int end){
       if(num.length==0){
        return false;
       }
       for(int i =start ; i<=end;i++){
        if(num[i]==target){
            return true;
        }
       }
       return false;
    }
}
