import java.util.*;
public class Qus7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of line you want to print pattern");
        int p = sc.nextInt();
        for (int i =1; i<=p;i++){
            for(int j=1; j<=p-i+1;j++){
                System.out.print("%");
            }
            System.out.println();

        }

}
}
