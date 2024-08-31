import java.util.Arrays;
import java.util.Scanner;
public class Qus31 {
     
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int num = sc.nextInt();
       int[] ans = new int[num];
       for(int i=0;i<num ; i++){
        ans[i] = sc.nextInt();
       }
       System.out.println(Arrays.toString(ans));
    
    
}
}
