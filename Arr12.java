public class Arr12 {
    public static void kadan(int number[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            curr=curr+number[i];
            if(curr<0){
                curr=0;
             }     
             max=Math.max(max,curr);
        }
        System.out.println("max sum is = " + max);
    }
    public static void main(String args[]){
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        kadan(number);
    }
}
