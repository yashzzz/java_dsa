public class Arr16 {
    public static void reverse(int number[]){
        int start = 0;
        int end = number.length-1;
        while(start<end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }
        

    }
    public static void main(String args[]){
        int number[] = {1,2,3};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

    }
}
