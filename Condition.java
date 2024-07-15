import java.util.*;
public class Condition {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the age = ");
       int age = sc.nextInt();
       if (age >= 18){
       {
        System.out.println("you are elible to vote");
       }
       if(age < 18 && age > 13)
       {
        System.out.println("you are a teenager");
       }
       else
       {
        System.out.println("you are not eligible");
       }
    }

}
    

}