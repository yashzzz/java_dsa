public class Linear1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        int ans = linear(nums, 5);
        boolean b = linear2(nums, ans);
        System.out.println(ans);
        System.out.println(b);
    }
     static  int linear(int[] arr, int num) {
        for(int i=0; i<arr.length;i++){
            int value = arr[i];
            if(num==value){
                return i;
            }
        
    } 
    return -1;
}
static  boolean linear2(int[] arr, int num) {
    for(int element: arr){
        if(num==element){
            return true;
        }
}
 return false;
}
}
