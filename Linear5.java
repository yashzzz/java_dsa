public class Linear5 {
    public static void main(String[] args) {
        int[][] num = {
            {23,45,34},
            {33,45,67,89},
            {21,2,4,6}
        };  
        int target = 67;
        System.err.println("element present at the index" + search(num,target)); 
     }
     static int search(int[][] num , int target){
        if(num.length == 0){
            return -1;
        }
        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(num[i][j]==target){
                    return num[i][j];
                }

            }
        }
        return -1;
     }
}
