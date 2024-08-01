public class Arr15 {
    public static void min_max(int number[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("maximum value of array is " + max);
        System.out.println("min value of array is " + min);
    }
    public static void main(String args[]){
        int number[] = {3, 5, 4, 1, 9};
        min_max(number);
    }
}
