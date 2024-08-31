import java.util.*;
public class Qus32 {
    public static void main(String[] args) {
      
      try{  System.out.println("program started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int a = n1/n2;
        System.out.println("divison is " + a);   
        System.out.println("program terminated");     
    }
      catch(Exception e){
        System.out.println("exception originated");

      }
      finally{
        System.out.println("terminated");
      }
}
}

