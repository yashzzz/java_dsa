public class Linear4 {
    public static void main(String[] args){
        int[] num = {0,-1,-2,9,8,6,-1};
        System.out.println("minimum number of array is" + min(num));
    }
    static int min(int[] num){
        int min = Integer.MAX_VALUE;
        if(num.length==0){
            return -1;
        }
        for(int element: num){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
}
