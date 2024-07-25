import java.util.*;
public class Arr4 {
    public static int search(String[] fruits, String key){
        for(int i=0;i<fruits.length;i++){
            if(fruits[i] == key){
            return i;
            }
        }
      return -1;
    }
       public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        String[] fruits = {"mango","banana","pinapple","date","almond"};
      //  System.out.println("enter the fruit you want to search");
        String key = "banana";
        
        int index = search(fruits, key);
        
        if(index == -1) {
            System.out.println("value is not present in the array");
          }
          else{
              System.out.println("value is presnt at index = " + index);
          }

    }
}
