public class Arr11 {
    public static void sum(int number[]){
        int curr = 0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i=1;i<number.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                curr=0;
                curr=i==0 ? curr=j:prefix[i]-prefix[j-1];
            }
        if(max_sum<curr){
            max_sum=curr;
        }
        }
        System.out.println("max sum is" + max_sum);
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5,6};
        sum(number);

    }
}
