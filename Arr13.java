public class Arr13 {
    public static void trapped_water(int height[]){
        //first left array
        int left[] = new int[height.length];
         left[0] = height[0];
         for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
         }
        //right array
        int right[]= new int[height.length];
        right[height.length-1]= height[height.length-1];
        for(int i=height.length-2;i>0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
         int trapped = 0;
        //loop
        for(int i=0;i<height.length;i++){
            int water_level = Math.min(right[i],left[i]);
            trapped = trapped + (water_level - height[i]);
        }
        System.out.println(trapped);

    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trapped_water(height);

    }
}
