import java.util.*;
public class Arr1 {
    public static void update(int marks[]){
        for(int i=0;i<=marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String srgs[]){
        int marks[] = {1, 2, 3};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }System.out.println();
    }
}
